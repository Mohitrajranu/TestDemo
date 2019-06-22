package bo;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Pattern;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

import Util.ParsingSpecialCharacter;
import au.com.bytecode.opencsv.CSVReader;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class FTPUtils extends FTPClient {
	// public static int BUFFER_SIZE = 10240;
	// private FTPClient m_client;
	// private String host = "";
	// private String user = "";
	// private String password = "";
	// private String targetDataDir = "";
	// public String ftpStartTime="";
	// public String ftpEndTime="";
	// Date_prog dp;
	// ParseFile pf=null;
	private Logger logger = Logger.getLogger(FTPUtils.class);

	public Set<String> readFromSftp(String bankName) {
		Session session = null;
		Channel channel = null;
		ChannelSftp sftp = null;
		Properties props = null;
		String host = "", userId = "", pwrd = "";
		int port = 0;
		Vector<ChannelSftp.LsEntry> list = null;
		Set<String> fileSet = new HashSet<String>();
		Set<String> returnfileSet = new HashSet<String>();
		try {
			ParsingSpecialCharacter pspc = new ParsingSpecialCharacter();
			props = new Properties();
			props.load(pspc.getPropertyfile());
			logger.trace("property file loaded successfully");
			String dtToProcess = ParsingSpecialCharacter.getYesterdayDateString();

			String outputfolderpath = props.getProperty(bankName.trim() + "ReportLocalLoc");
			userId = props.getProperty("YBLUID");
			pwrd = props.getProperty("YBLPWRD");
			host = props.getProperty("YBLHOST");
			port = Integer.parseInt(props.getProperty("YBLPORT"));
			// YBL_NEFT_VSBRecon_Out_20150424.csv
			fileSet.add("YBL_NEFT_" + bankName.trim() + "Recon_Out_" + dtToProcess.trim() + ".csv");
			fileSet.add("YBL_NEFT_" + bankName.trim() + "Recon_In_" + dtToProcess.trim() + ".csv");
			JSch jsch = new JSch();
			session = jsch.getSession(userId, host, port);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setConfig("PreferredAuthentications", "password");
			session.setPassword(pwrd);
			session.connect();
			channel = session.openChannel("sftp");
			sftp = (ChannelSftp) channel;
			sftp.connect();
			logger.trace("Connected to SFTP Server");
			String location = props.getProperty(bankName + "ReportLoc");
			list = sftp.ls(location);

			if (list.size() > 0) {
				for (ChannelSftp.LsEntry item : list) {
					// List<String[]> records;
					try {
						String name = item.getFilename();
						if (name != null && name.endsWith(".csv")) {
							for (String fileName : fileSet) {
								if (name.equals(fileName)) {
									sftp.get(location + name, outputfolderpath);
									sftp.rename(location + name, location + name.concat(".Done"));
									returnfileSet.add(outputfolderpath + name);
								}
							}
						}
					} catch (Exception e) {
						logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
						logger.error(ParsingSpecialCharacter.getExceptionString(e));
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (sftp != null) {
					sftp.exit();
					sftp = null;
				}
				if (channel != null) {
					channel.disconnect();
					channel = null;
				}
				if (session != null) {
					session.disconnect();
					session = null;
				}
			} catch (Exception e2) {
				sftp = null;
				channel = null;
				session = null;
			}
		}
		return returnfileSet;
	}

	public void uploadToCbs(String bankName) {
		FTPClient m_client = null;
		Properties props = null;
		String host = "", userId = "", pwrd = "";
		int port = 0;
		FileInputStream in=null;
		try {
			ParsingSpecialCharacter pspc = new ParsingSpecialCharacter();
			props = new Properties();
			props.load(pspc.getPropertyfile());
			logger.trace("property file loaded successfully");
			userId = props.getProperty(bankName.trim()+"UID");
			pwrd = props.getProperty(bankName.trim()+"PWRD");
			host = props.getProperty(bankName.trim()+"HOST");
			port = Integer.parseInt(props.getProperty(bankName.trim()+"PORT"));
			m_client = new FTPClient();
			m_client.connect(host);
		} catch (Exception e) {
			logger.error(e.getMessage());
			logger.error(ParsingSpecialCharacter.getExceptionString(e) + "/n" + ParsingSpecialCharacter.getCurrentTimeStampStr());
		}
		if (FTPReply.isPositiveCompletion(m_client.getReplyCode())) {
			try {
				if (m_client.login(userId, pwrd)) {
					logger.debug(bankName+" CBS FTP login done");
					String outputfolderpath = props.getProperty(bankName.trim()+"Location");
					String inputfolderpath =  props.getProperty(bankName.trim() + "ReportOutLocalLoc");
					String filename = "RON_99922_"  + ParsingSpecialCharacter.getYesterdayDateString() +"_"+ bankName.trim()+ ".csv";
					if (outputfolderpath != null && inputfolderpath!=null) {
						in = new FileInputStream(inputfolderpath + filename);
						if(in!=null){
							if(m_client.storeFile(outputfolderpath+filename, in)) 
							{
								logger.debug("file ftped to cbs "+bankName);
								in.close();
								boolean retFlag = renameAppFile(inputfolderpath + filename, inputfolderpath + filename+".Done");
								while(!retFlag){
									retFlag = renameAppFile(inputfolderpath + filename, inputfolderpath + filename+".Done");
								}
								if(retFlag){
									logger.debug("local file rename sucessfully");
								}
								
							}else{
								in.close();
							}
						}
					}
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
				logger.error(ParsingSpecialCharacter.getExceptionString(e) + "/n" + ParsingSpecialCharacter.getCurrentTimeStampStr());
			}
		}
	}

	public boolean renameAppFile(String oldf, String newf) {
		boolean flag = false;
		try {
			File oldName = new File(oldf);
			File newName = new File(newf);
			if (oldName.renameTo(newName)) {
				flag = true;
			}
			flag = true;
		} catch (Exception e) {
			logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
			logger.error(ParsingSpecialCharacter.getExceptionString(e));
		}
		return flag;
	}
}
