package Util;

//
//
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import bean.ParamBean;
import bo.FTPUtils;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

//import bean.BankGroupDetBean;
//import bean.JavaStdErrorBean;
//import bean.JavaStdBean;
//import bean.JavaStdErrorBean;
//import bean.NeftAckBankBean;
//import bean.NeftIncomingMsgBean;
////import bean.NeftIncomingMsgErrorBean;
//import bean.NeftOutMsgBean;
//import bean.SystemBean;
public class CsvUtil {
	private final static Logger logger = Logger.getLogger(CsvUtil.class);

	//
	public static void main(String[] args) {
	}

	public static List<ParamBean> parseCSVFileAsList(Set<String> fileList) {

		// //create CSVReader object
		CSVReader reader;
		Date_prog dp = new Date_prog();
		List<ParamBean> recordTotal = new LinkedList<ParamBean>();
		FTPUtils fu = new FTPUtils();
		try {
			for (String filename : fileList) {
				String pathname = filename;
				File f = new File(pathname);
				boolean fileflag = false;
				if (f.exists() && !f.isDirectory()) {
					fileflag = true;
				}
				if (fileflag) {
					HeaderColumnNameTranslateMappingStrategy<ParamBean> beanStrategy = new HeaderColumnNameTranslateMappingStrategy<ParamBean>();
					beanStrategy.setType(ParamBean.class);
					Map<String, String> columnMapping = new HashMap<String, String>();
					columnMapping.put("UTR", "utr");
					columnMapping.put("BANKIFSC", "bankIfsc");
					columnMapping.put("MSGTYPE", "msgType");
					columnMapping.put("AMOUNT", "amount");
					columnMapping.put("CREATIONTIME", "creationTm");
					columnMapping.put("BANKUTR", "yesUTR");
					beanStrategy.setColumnMapping(columnMapping);
					
					CsvToBean<ParamBean> csvToBean = new CsvToBean<ParamBean>();
					reader = new CSVReader(new FileReader(f.getAbsolutePath()));
					List<ParamBean> emps = csvToBean.parse(beanStrategy, reader);
					recordTotal.addAll(emps);
					
					System.out.println(emps);
					boolean retFlag = fu.renameAppFile(filename, filename + ".Done");
					logger.debug("rename file: " + filename + " " + retFlag);
					while (!retFlag) {
						logger.debug("rename file failed, retrying: " + filename);
						retFlag = fu.renameAppFile(filename, filename + ".Done");
					}
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return recordTotal;
	}

	public static boolean generateCsvForInErrBean(ArrayList<ParamBean> l1, ArrayList<ParamBean> l2, String bankName) {
		Date_prog dp = new Date_prog();
		Properties props = null;
		ParsingSpecialCharacter pspc = new ParsingSpecialCharacter();

		props = new Properties();
		BufferedWriter out;
		String filename = "";
		try {
			props.load(pspc.getPropertyfile());
			String projpath = props.getProperty(bankName + "ReportOutLocalLoc");
//			RON_99922_06052015_083118_01.txt 
			filename = "RON_99922_"  + ParsingSpecialCharacter.getYesterdayDateString() +"_"+ bankName.trim()+ ".csv";
			boolean fileflag = true;
			File f = new File(projpath + filename);
			if (f.exists() && !f.isDirectory()) {
				fileflag = false;
			}
			// if (Files.exists(projpath+filename)) {
			// // file exist
			// }
			out = new BufferedWriter(new FileWriter(f.getAbsolutePath(), true));
			CSVWriter writer = new CSVWriter(out);
			// Write header
			if (fileflag) {
				String[] header = { "UTR", "BANKIFSC", "MSGTYPE", "AMOUNT", "CREATIONTIME", "STATUS", "YESUTR" };
				writer.writeNext(header);
			}

			// Write data
			String[] data;

			for (ParamBean p : l1) {
				data = new String[] { p.getUtr(), p.getBankIfsc(), p.getMsgType(), p.getAmount(), p.getCreationTm(), "S", p.getYesUTR() };
				writer.writeNext(data);
			}
			for (ParamBean p : l2) {
				data = new String[] { p.getUtr(), p.getBankIfsc(), p.getMsgType(), p.getAmount(), p.getCreationTm(), "F", p.getYesUTR() };
				writer.writeNext(data);
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("ERROR in generateCsvForInErrBean:" + e.toString());
			logger.error(ParsingSpecialCharacter.getExceptionString(e));
			return false;
		}
		System.out.println("Generated CSV generateCsvForInErrBean: \n");
		logger.debug("Generated CSV generateCsvForInErrBean: \n");
		return true;
	}

}
