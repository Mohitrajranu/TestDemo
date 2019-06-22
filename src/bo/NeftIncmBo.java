package bo;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sql.DataSource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import bean.ParamBean;
import DAO.BankConfigDAO;
import Util.CsvUtil;
import Util.ParsingSpecialCharacter;

public class NeftIncmBo {
	private static Logger logger = Logger.getLogger(NeftIncmBo.class);
	static DataSource dbDatasource;

	public NeftIncmBo(DataSource dbDatasource) {
		NeftIncmBo.dbDatasource = dbDatasource;
	}

	public void cleanUp() {
	}

	public void doProcess(String bankName,boolean flag) {
		FTPUtils fu = new FTPUtils();
		BankConfigDAO bdao = new BankConfigDAO();
		try {
			// step 1 download all files to local dir from ftp server
			// logger =
			// ParsingSpecialCharacter.provideLogger(fBean.getTxMsgType().trim(),
			// fBean.getBankBean().getBankName().trim(),
			// fBean.getFlow().trim());
//VIKRANT			Set<String> fileNameSet = fu.readFromSftp(bankName);
			Set<String> fileNameSet=new HashSet<String>();//VPP
			//fileNameSet.add("D:/Yes_Recon/NEFT/YBL_NEFT_VSBRecon_In_20160516.csv");//VPP
			fileNameSet.add("D:/Yes_Recon/NEFT/YBL_NEFT_VSBRecon_Out_20160801_1.csv");//VPP
			if (fileNameSet.size() == 1) {
				List<ParamBean> listFromFile = CsvUtil.parseCSVFileAsList(fileNameSet);
				if(!flag)
				{boolean flag1=bdao.insertIntoYesRecon(listFromFile,dbDatasource);}
//				ArrayList<ParamBean> at1 = new ArrayList<ParamBean>(listFromFile);
				// Collections.so
				List<ParamBean> listFromDb = bdao.getReconData(dbDatasource, bankName);
				ArrayList<ParamBean> common = new ArrayList<ParamBean>(listFromFile);
				ArrayList<ParamBean> peculiar = new ArrayList<ParamBean>();

				common.retainAll(listFromDb);
				System.out.println(common);
				peculiar = (ArrayList<ParamBean>) CollectionUtils.disjunction(listFromFile, listFromDb);
				boolean f1 = CsvUtil.generateCsvForInErrBean(common, peculiar, bankName);
				/*if (f1) {
					fu.uploadToCbs(bankName);
					logger.debug("Recon done for bank "+bankName);
				}
			}else{
				logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr()+" valid 2 files yet not received for bank "+bankName);
			}*/
		}} catch (Exception e) {
			logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
			logger.error(ParsingSpecialCharacter.getExceptionString(e));
		} finally {
//			logger = Logger.getLogger("CommonLogger");
		}
		// return neftInStdBeanList;

	}

}
