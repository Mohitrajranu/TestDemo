package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.log4j.Logger;

import bean.ParamBean;
import Util.ParsingSpecialCharacter;

public class BankConfigDAO {
	private static Logger logger = Logger.getLogger(BankConfigDAO.class);

	public Set<String> getbankname(DataSource dbDatasource)
	// public void getbankname()
	{
		Set<String> bank = new HashSet<String>();
		Connection conn = null;
		Statement st = null;
		String sql = null;
		ResultSet rs = null;
		// int i=0;
		try {
			conn = dbDatasource.getConnection();
			sql = "select distinct bankname from mst_bankname";
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				bank.add(rs.getString(1));
			}
		} catch (Exception e) {
			logger.error(ParsingSpecialCharacter.getExceptionString(e) + "/n" + ParsingSpecialCharacter.getCurrentTimeStampStr());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				logger.error("Error while releasing resultset");
				logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
				logger.error(ParsingSpecialCharacter.getExceptionString(e));
			}
			try {
				if (st != null) {
					st.close();
				}
			} catch (Exception e) {
				logger.error("Error while releasing preparedStatement");
				logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
				logger.error(ParsingSpecialCharacter.getExceptionString(e));
			}
			try {
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception e) {
				logger.error("Error while releasing connection");
				logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
				logger.error(ParsingSpecialCharacter.getExceptionString(e));
			}
		}
		return bank;
	}

	@SuppressWarnings("unchecked")
	public List<ParamBean> getReconData(DataSource dbDatasource, String bankname) {
		QueryRunner run;
		List<ParamBean> beans = new ArrayList<ParamBean>();
		try {
			String dtToProcess = ParsingSpecialCharacter.getYesterdayDateString2();
			String v1 = dtToProcess+" 00:00:00", v2 = dtToProcess+" 23:59:59";
			run = new QueryRunner(dbDatasource);
			ResultSetHandler<List<ParamBean>> h = new BeanListHandler<ParamBean>(ParamBean.class);
			beans = (ArrayList) run.query("select neft_in.tran_ref_no as utr, ifsc_sender as bankIfsc, msg_type as msgType, "
					+ "amount, TO_CHAR(neft_in.CREATION_TIME,'DD-MM-YYYY') as creationTm, yes_recon.yes_utr as yesUTR from neft_in inner join yes_recon on yes_recon.tran_ref_no=neft_in.tran_ref_no  " + "where trim(neft_in.bankname)='" + bankname + "' and neft_in.CREATION_TIME >= to_timestamp('" + v1
					+ "', 'dd-mm-yyyy hh24:mi:ss') " + "and neft_in.CREATION_TIME <= to_timestamp('" + v2 + "', 'dd-mm-yyyy hh24:mi:ss') UNION "
					+ "select neft_out.tran_ref_no as utr, ifsc_sender as bankIfsc, sub_msg_type as msgType, amount, to_char(to_timestamp(neft_out.CREATION_TIME),'DD-MM-YYYY') as creationTm,yes_recon.yes_utr as yesUTR from neft_out inner join yes_recon on neft_out.tran_ref_no=yes_recon.tran_ref_no "
					+ "where trim(neft_out.bankname)='" + bankname + "' and neft_out.CREATION_TIME >= to_timestamp('" + v1 + "', 'dd-mm-yyyy hh24:mi:ss')" + "  and neft_out.CREATION_TIME <= to_timestamp('" + v2
					+ "', 'dd-mm-yyyy hh24:mi:ss')", h);

			// beans.addAll(beans2);
                System.out.println("hiii"+beans.toString());
		} catch (Exception e) {
			logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
			logger.error(ParsingSpecialCharacter.getExceptionString(e));
		} finally {
		}
		return beans;
	}

	public boolean insertIntoYesRecon(List<ParamBean> listFromFile,DataSource dbDatasource) {
		
		Connection conn = null;
		int[] batchresult = null;
		PreparedStatement ps = null;
		String sql = null;
		ResultSet rs = null;
		try {
			conn = dbDatasource.getConnection();
			sql="INSERT INTO YES_RECON (TRAN_REF_NO,YES_UTR,CREATION_TIME) VALUES(?,?,?)";
			ps = conn.prepareStatement(sql);
			conn.setAutoCommit(false);
			for (Iterator iterator = listFromFile.iterator(); iterator.hasNext();) 
			{
				ParamBean paramBean = (ParamBean) iterator.next();
				ps.setString(1, paramBean.getUtr());
				ps.setString(2, paramBean.getYesUTR());
				ps.setString(3,paramBean.getCreationTm());
				ps.addBatch();
			}
			batchresult=ps.executeBatch();
		    conn.commit();
		}catch (Exception e) {
			logger.error(ParsingSpecialCharacter.getExceptionString(e) + "/n" + ParsingSpecialCharacter.getCurrentTimeStampStr());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				logger.error("Error while releasing resultset");
				logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
				logger.error(ParsingSpecialCharacter.getExceptionString(e));
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				logger.error("Error while releasing preparedStatement");
				logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
				logger.error(ParsingSpecialCharacter.getExceptionString(e));
			}
			try {
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception e) {
				logger.error("Error while releasing connection");
				logger.error(ParsingSpecialCharacter.getCurrentTimeStampStr());
				logger.error(ParsingSpecialCharacter.getExceptionString(e));
			}
		}
		return false;
	}
}
