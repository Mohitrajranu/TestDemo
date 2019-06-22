package task;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import DAO.BankConfigDAO;
import Util.ParsingSpecialCharacter;

import com.zaxxer.hikari.HikariDataSource;

import dbPool.CreateDatasource;


public class MainRun{
	private static Logger logger = Logger.getLogger(MainRun.class);
	static CreateDatasource dbObj = new CreateDatasource();
	static Properties props = null;
	
//	static ArrayList<SystemBean> sysList = new ArrayList<SystemBean>();
//	static DataSource dbDatasource = dbObj.setupDataSource("jdbc:oracle:thin:kiran/kiran@10.1.21.249:1521:xe", "kiran", "kiran");
// 	static DataSource dbDatasource = dbObj.setupDataSource("jdbc:oracle:thin:nbrdch/nbrdch@10.43.1.101:1531:iibprod", "nbrdch", "nbrdch");

	
		 public static void main(String[] args) {
			 try{
					ParsingSpecialCharacter pspc = new ParsingSpecialCharacter();
					props = new Properties();
					props.load(pspc.getPropertyfile());
					logger.trace("property file loaded successfully");
					String url = props.getProperty("dburl");
					String uid = props.getProperty("dbuid");
					String pwrd = props.getProperty("dbpwd");
					logger.trace(url+" "+uid+" "+pwrd);
					System.out.println(url+" "+uid+" "+pwrd);
//					DataSource dbDatasource = dbObj.setupDataSource("jdbc:oracle:thin:system/system@10.1.21.199:1521:xe", "system", "system");
					DataSource dbDatasource = dbObj.setupDataSource(url, uid, pwrd);
//					bdao.getReconData(dbDatasource, "VSB");
					 MainFlow mFlow = new MainFlow(dbDatasource);
					 mFlow.run();
//					 mFlow.myTime();
				}catch (Exception e) {
					logger.error(ParsingSpecialCharacter.getExceptionString(e)+"/n"+ParsingSpecialCharacter.getCurrentTimeStampStr()+"/n"+ParsingSpecialCharacter.getCurrentTimeStampStr());
				}
		 }
			
	
}