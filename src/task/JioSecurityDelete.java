package task;


import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JioSecurityDelete {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "system";
	private static final String DB_PASSWORD = "system@123";

	public static void main(String[] argv) {
           int count = 0;
		try {
			JioSecurityDelete jd = new JioSecurityDelete();
			JioSecurityDeleteVo jsDelVo = new JioSecurityDeleteVo();
			count=jd.executeStoredProcedure(2);
			//selectRecordsFromTable();
			System.out.println("No of Records Present in the main table eligible for Renewal = "+count);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	private int executeStoredProcedure(int recLimit){
		
		Connection dbConnection = null;
		CallableStatement cstmt = null;
		int counter = 0;
		try {
			dbConnection = getDBConnection();
			cstmt = dbConnection.prepareCall("{call AutoRenewal_Process.RenewSubscriber(?,?)}");
			cstmt.setInt(1, recLimit);
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.execute();
			System.out.println("Procedure is executed successfully ");
			
			counter = cstmt.getInt(2);
			System.out.println("Total Records eligible for renewal = "+counter);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally{
			if (null != cstmt) {
			    try {
			    	cstmt.close();
			    	cstmt = null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (null != dbConnection) {
			    try {
			    	dbConnection.close();
			    	dbConnection = null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		return counter;
	}
	
	private static void selectRecordsFromTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement prepStmt = null;
        Statement stmt = null;
        ResultSet res = null;
		String selectSQL = "SELECT A1.MSISDN as MSISDN,A1.CUST_STATUS as CUS1,A2.CUST_STATUS as CUS2,A1.CREATED_ON as cr1,A2.CREATED_ON as cr2 from"
				+ " t_sub_service_info A1 INNER JOIN t_sub_service_info A2 on A1.MSISDN = A2.MSISDN "
				+ " and A1.service_type = A2.service_type and A1.service_type = 'Z0031' and A1.CREATED_ON < A2.CREATED_ON ";
		String deleteSQL1 = "DELETE FROM t_sub_service_info WHERE CUST_STATUS = ? and service_type = 'Z0031' and MSISDN = ? "
				+ " and trunc(CREATED_ON) = trunc(to_date(?,'yyyy-MM-dd'))";
		int count = 0;
		try {
			dbConnection = getDBConnection();
			prepStmt = dbConnection.prepareStatement(deleteSQL1);
			stmt = dbConnection.createStatement();
			//preparedStatement.setInt(1, 1001);

			// execute select SQL stetement
			res = stmt.executeQuery(selectSQL);
			//ResultSet rs = preparedStatement.executeQuery();
			JioSecurityDeleteVo jsDelVo = new JioSecurityDeleteVo();
			
			while (res.next()) {
			
				try {
					jsDelVo.setCreatedOn((res.getDate("cr1")));
					jsDelVo.setMsisdn((res.getString("MSISDN")));
					jsDelVo.setCreatedOn1((res.getDate("cr2")));
					jsDelVo.setCuststatus((res.getString("CUS1")));
					jsDelVo.setCuststatus1((res.getString("CUS2")));

					if("A".equals(jsDelVo.getCuststatus()) && "I".equals(jsDelVo.getCuststatus1())){
					 prepStmt.setString(1, "I"); //substitute first occurrence of ? with
					 prepStmt.setString(2, jsDelVo.getMsisdn());
					 
					 prepStmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(jsDelVo.getCreatedOn1()));
					 prepStmt.addBatch();
					 //int result = prepStmt.executeUpdate();
					 //conn.commit();
					 System.out.println("Record Picked having MSISDN ="+jsDelVo.getMsisdn()+" and Customer_Status =I and CREATED_ON= "+jsDelVo.getCreatedOn1());
					 //System.out.println("Record deleted successfully "+result);
					 }
					 else if("I".equals(jsDelVo.getCuststatus()) && "A".equals(jsDelVo.getCuststatus1())){
					prepStmt.setString(1, "I"); //substitute first occurrence of ? with
					 prepStmt.setString(2, jsDelVo.getMsisdn());
					 prepStmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(jsDelVo.getCreatedOn()));
					 prepStmt.addBatch();
					 //int result = prepStmt.executeUpdate();
					 //conn.commit();
					  System.out.println("Record Picked having MSISDN ="+jsDelVo.getMsisdn()+" and Customer_Status =I and CREATED_ON= "+jsDelVo.getCreatedOn());
					 //System.out.println("Record deleted successfully "+result);
					 }
					 else if("A".equals(jsDelVo.getCuststatus()) && "A".equals(jsDelVo.getCuststatus1())){
					 prepStmt.setString(1, "A"); //substitute first occurrence of ? with
					 prepStmt.setString(2, jsDelVo.getMsisdn());
					 prepStmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(jsDelVo.getCreatedOn()));
					 prepStmt.addBatch();
					//int result = prepStmt.executeUpdate();
					 //conn.commit();
					  System.out.println("Record Picked having MSISDN ="+jsDelVo.getMsisdn()+" and Customer_Status =A and CREATED_ON= "+jsDelVo.getCreatedOn());
					  //System.out.println("Record deleted successfully "+result);
					 }
					 else if("I".equals(jsDelVo.getCuststatus()) && "I".equals(jsDelVo.getCuststatus1())){
					 prepStmt.setString(1, "I"); //substitute first occurrence of ? with
					 prepStmt.setString(2, jsDelVo.getMsisdn());
					 prepStmt.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(jsDelVo.getCreatedOn()));
					 prepStmt.addBatch();
					// int result = prepStmt.executeUpdate();
					 //conn.commit();
					  System.out.println("Record Picked having MSISDN ="+jsDelVo.getMsisdn()+" and Customer_Status =I and CREATED_ON= "+jsDelVo.getCreatedOn());
            //System.out.println("Record deleted successfully "+result);
   }
					              //res.deleteRow();
					              count = count + 1;
					              if(count % 3 == 0){
					               int[] result = prepStmt.executeBatch();
					               dbConnection.commit();
					               System.out.println("No of CREATED_ON record deleted ="+result.length);
					                      count = 0;
					              }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (prepStmt != null) {
				prepStmt.close();
			}
			if (res != null) {
				res.close();
			}
			if (stmt != null) {
				stmt.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                             DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}