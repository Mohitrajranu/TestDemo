package task;

import java.util.Set;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import DAO.BankConfigDAO;
import Util.ParsingSpecialCharacter;
import bo.NeftIncmBo;

public class MainFlow {
	static DataSource dbDatasource;
	private final Logger logger = Logger.getLogger(MainFlow.class);
	MainFlow(DataSource dbDatasource) {
		MainFlow.dbDatasource = dbDatasource;
	}
	// @SuppressWarnings("static-access")
	public void run() {
		BankConfigDAO bDao =null;
		NeftIncmBo nio = new NeftIncmBo(dbDatasource);
		try {
			bDao = new BankConfigDAO();
			Set<String> bankSet = bDao.getbankname(dbDatasource);
			boolean flag=false;
			for (String bankname : bankSet) {
				logger.debug("Entering report scan for  "+bankname + " "+ParsingSpecialCharacter.getCurrentTimeStampStr());
				nio.doProcess(bankname,flag);
				System.out.println(" bank complete  \n");
				flag=true;
			}
		} catch (Exception e) {
			logger.error(ParsingSpecialCharacter.getExceptionString(e)+"/n"+ParsingSpecialCharacter.getCurrentTimeStampStr());
		} finally {
			if(bDao!=null){
				bDao=null;
			}
		}
	}
}