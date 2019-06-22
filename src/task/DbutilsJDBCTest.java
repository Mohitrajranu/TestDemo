package task;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List; 
import java.util.Map; 

import org.apache.commons.dbutils.DbUtils; 
import org.apache.commons.dbutils.QueryRunner; 
import org.apache.commons.dbutils.handlers.BeanListHandler; 




import bean.Book;



public class DbutilsJDBCTest { 
	Connection conn = null; 
	String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
	String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	String selectTableSQL = "SELECT *  FROM (SELECT t.*, ROWNUM rn  FROM t_sub_service_info t ";
  
	PreparedStatement preparedStatement = null;
	ResultSet rs =null;
	String limitRecords = null;
	int startRecords = 1;
	//public List<Book> getData()
	public void getData()
	{
		StringBuffer queryStrBuff = null;
		int renewalFetchLimit = 0;
		int limitSize = 0;
		//List<Book> lBeans = new ArrayList<Book>();
try { 
DbUtils.loadDriver (jdbcDriver); 
conn = DriverManager.getConnection (jdbcURL, "system", "Welcome#123"); 
limitRecords = "   ";
try {
	renewalFetchLimit = Integer.parseInt(limitRecords);
	limitSize = Integer.parseInt(limitRecords);
} 
catch (Exception e) {
	// TODO Auto-generated catch block
	if(e instanceof NumberFormatException){
		System.out.println("NFE");
	renewalFetchLimit = 0;
	limitSize = 0;
}}
while(true){
try {
	queryStrBuff = new StringBuffer(selectTableSQL);
	
    if(limitRecords.trim().length() > 0 && !("0").equals(limitRecords))
    {
    	queryStrBuff.append(" Where ROWNUM <= "+renewalFetchLimit+")"+" Where rn >= "+startRecords);
    	
    }
    else  {
    	queryStrBuff.append(")");
    }
    preparedStatement=conn.prepareStatement(queryStrBuff.toString(),ResultSet.TYPE_SCROLL_SENSITIVE, 
	        ResultSet.CONCUR_UPDATABLE);            
	rs=preparedStatement.executeQuery();
	System.out.println(queryStrBuff.toString());
	int rowCount=0;
	 if (!rs.first())
     {
//	           rsLoadUsers.beforeFirst();
       // checkRows = false;
        System.out.println("result set is empty");
        break;
     }
     else{
      rs.beforeFirst();
	while(rs.next())
	{
	    ++rowCount;
	    System.out.println(rowCount);
	    //System.out.println(rs.getString("NAME"));
	    if(limitSize > 0){
	    if(rowCount % limitSize == 0){ 
	    	startRecords = startRecords + limitSize;
		  renewalFetchLimit = renewalFetchLimit + limitSize;
		  }
	    }
	}
	if(rowCount < limitSize){
		  startRecords = startRecords + limitSize;
		  renewalFetchLimit = renewalFetchLimit + limitSize;
	  }
     }
	 queryStrBuff.setLength(0);
	// startRecords = startRecords + renewalFetchLimit;
	  //renewalFetchLimit = renewalFetchLimit * 2;
	 } catch (Exception e) {
		 e.printStackTrace();
}
finally{
	 queryStrBuff.setLength(0);
}
System.out.println("Mohit Raj");
}
System.out.println("I am Legend");
/*QueryRunner qRunner = new QueryRunner (); 
System.out.println ("*** Using BeanListHandler ***"); 
 lBeans = (ArrayList) qRunner.query (conn, "select title,authors,substype from books", new BeanListHandler (Book.class)); 
System.out.println ("title ------------- authors"); 
for (int i = 0; i <lBeans.size (); i++) { 
Book vals = (Book) lBeans.get (i); 
System.out.println (vals.getTitle()); 
String subsType = String.valueOf(vals.getSubstype());
if (GenericConstants.SUBSCRIBER_TYPE.PREPAID.toString().equals(subsType) || (GenericConstants.SUBSCRIBER_TYPE.PREPAID.getValue() + "").equals(subsType)) {
	 vals.setSubscript_type(GenericConstants.SUBSCRIBER_TYPE.PREPAID);
	} else if (GenericConstants.SUBSCRIBER_TYPE.POSTPAID.toString().equals(subsType) || (GenericConstants.SUBSCRIBER_TYPE.POSTPAID.getValue() + "").equals(subsType)) {
		vals.setSubscript_type(GenericConstants.SUBSCRIBER_TYPE.POSTPAID);
} else if (GenericConstants.SUBSCRIBER_TYPE.HYBRID.toString().equals(subsType) || (GenericConstants.SUBSCRIBER_TYPE.HYBRID.getValue() + "").equals(subsType)) {
	vals.setSubscript_type(GenericConstants.SUBSCRIBER_TYPE.HYBRID);
}
*/
//} 
//System.out.println(lBeans.toString());
} catch (SQLException ex) { 
ex.printStackTrace (); 
} finally { 
DbUtils.closeQuietly (conn); 
if (rs != null) {
    try {
		rs.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if (preparedStatement != null) {
    try {
		preparedStatement.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

} 

	//	return lBeans;
	}

public static void main (String [] args) { 
	DbutilsJDBCTest dbx=new DbutilsJDBCTest();
    dbx.getData();
} 
} 