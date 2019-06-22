package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.DbUtils;

public class ValidityExtension{
	public static void main(String[] args) {
		ValidityExtension ve = new ValidityExtension();
	    ve.Start();
	}
public ValidityExtension()
{
}
	public void Start() {
		// TODO Auto-generated method stub
       String planId= null;
       String valType= null;
       String ValDet= null;
       String conv =null;
       Connection dbConnection = null;
	   PreparedStatement preparedStatement = null;
	   ResultSet rs =null;
	   String sql = "select  distinct PLAN_ID as PID from t_sub_service_info where trunc(ACT_START_DATE) between to_char(to_date('01-03-17','dd-MM-yyyy'))" 
		        +"and to_char(to_date('31-03-17','dd-MM-yyyy')) and CUST_STATUS in('A','E');";
					
		    try {
		    	Map<String, Validitydetails> objectMap = this.getPlan_name();
		    	String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		    	String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		    	DbUtils.loadDriver (jdbcDriver); 
		    	dbConnection = DriverManager.getConnection (jdbcURL, "system", "Welcome#123"); 
				preparedStatement = dbConnection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE, 
				        ResultSet.CONCUR_UPDATABLE);
				rs=preparedStatement.executeQuery();
				while(rs.next())
				{
					   planId =rs.getString("PID").trim();
			    	   valType = objectMap.get(planId).getValType().trim();
			    	   ValDet = objectMap.get(ValDet).getValDet().trim();
			    	   conv =  getPlanValidity(ValDet, valType);
			    	   if(valType.length() > 0 && !("0").equals(valType) && valType.length() > 0 && !("0").equals(valType))
			    	   {
			    		   this.updateRenewDate(planId, conv);
			    	   }
			    	   else
			    	   {
			    		   System.out.println("There are no PlanId on which update is to be performed");
			    	   }
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		   	finally {
		   		try{
    	            if(dbConnection!=null) {
    	            	dbConnection.close();
    	            	dbConnection =null;
    	            }
    	        }catch(Exception ex){
    	        }
    	        try{
    	            if(rs!=null) {
    	            	rs.close();
    	                rs =null;
    	            }
    	        }catch(Exception ex){
    	        }
    	        
    	        try{
    	            if(preparedStatement!=null) {
    	            	preparedStatement.close();
    	            	preparedStatement =null;
    	            }
    	        }catch(Exception ex){
    	        }
    	    		   	}

/*       
       for (String key :  objectMap.keySet()) {
    	   planId = key;
    	   valType = objectMap.get(key).getValType();
    	   ValDet = objectMap.get(key).getValDet();
    	   //this.updateRenewDate(planId,valType,ValDet);
           System.out.println(planId);
           System.out.println(valType);
           System.out.println(ValDet);
           System.out.println(count++);
           //DD,MM,YY,HH
            
       }
       */
	}
	private String getPlanValidity(String ValDet,String valType){
		String output = null;
	       Calendar cal;
	       SimpleDateFormat sdf;
	       int days;
		try {
			 char Valconv[] = ValDet.toCharArray();
	           switch(Valconv[0]){
	              case 'D' :
	               days = Integer.parseInt(valType);
	          	    sdf = new SimpleDateFormat("dd-MM-yy");
	          		cal = Calendar.getInstance(); 
	          		cal.set(Calendar.DAY_OF_MONTH, 1);
	          		cal.set(Calendar.MONTH, 3);
	          		cal.add(Calendar.DAY_OF_MONTH, days);
	          	    output = sdf.format(cal.getTime());
	          		System.out.println(output);
	                 break;
	              case 'M' :
	                  days = Integer.parseInt(valType) * 30;
	             	    sdf = new SimpleDateFormat("dd-MM-yy");
	             		cal = Calendar.getInstance(); 
	             		cal.set(Calendar.DAY_OF_MONTH, 1);
	             		cal.set(Calendar.MONTH, 3);
	             		cal.add(Calendar.DAY_OF_MONTH, days);
	             	    output = sdf.format(cal.getTime());
	             		System.out.println(output);
	                 break;
	              case 'Y' :
	                  days = Integer.parseInt(valType) * 365;
	             	    sdf = new SimpleDateFormat("dd-MM-yy");
	             		cal = Calendar.getInstance(); 
	             		cal.set(Calendar.DAY_OF_MONTH, 1);
	             		cal.set(Calendar.MONTH, 3);
	             		cal.add(Calendar.DAY_OF_MONTH, days);
	             	    output = sdf.format(cal.getTime());
	             		System.out.println(output);
	              case 'H' :
	             	    sdf = new SimpleDateFormat("dd-MM-yy");
	             		cal = Calendar.getInstance(); 
	             		cal.set(Calendar.DAY_OF_MONTH, 1);
	             		cal.set(Calendar.MONTH, 3);
	             		cal.add(Calendar.DAY_OF_MONTH, 1);
	             	    output = sdf.format(cal.getTime());
	             		System.out.println(output);
	                 break;
	              default :
	                 System.out.println("Invalid ");
	           }
	       
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return output.trim();
		
	}
	private void updateRenewDate(String planId , String output)
	{
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		final int BATCH_SIZE = 1000;
		ResultSet rs =null;
		List<String> users = null;
		String sql = "update t_sub_service_info set RENEWAL_DATE= to_char(to_date('"+output+"','dd-MM-yy')) where trunc(ACT_START_DATE) between to_char(to_date('01-03-17','dd-MM-yy'))" 
		        +"and to_char(to_date('31-03-17','dd-MM-yy')) and PLAN_ID ='"+planId+"' and CUST_STATUS in('A','E') and SUBSCRIPTION_ID = ?";
				
				
		   String query = "select SUBSCRIPTION_ID from t_sub_service_info where trunc(ACT_START_DATE) between to_char(to_date('01-03-17','dd-MM-yyyy'))" 
			        +"and to_char(to_date('31-03-17','dd-MM-yyyy')) and CUST_STATUS in('A','E') and PLAN_ID ='"+planId+"'";
						
			    try {
			    	users = new ArrayList<String>();
			    	String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
			    	String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
			    	DbUtils.loadDriver (jdbcDriver); 
			    	dbConnection = DriverManager.getConnection (jdbcURL, "system", "Welcome#123"); 
					preparedStatement = dbConnection.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE, 
					        ResultSet.CONCUR_UPDATABLE);
					rs=preparedStatement.executeQuery();
					while(rs.next())
					{
					users.add(rs.getString("SUBSCRIPTION_ID"));	
					}
					
					if(users.size() > 0)
					{
					    try {
						    	preparedStatement = dbConnection.prepareStatement(sql);
						    	for (int i = 0; i < users.size() ; i++) {
									
									
						    		preparedStatement.setString(1, users.get(i));
						    		preparedStatement.addBatch();
									  if (i % BATCH_SIZE == BATCH_SIZE - 1)
										  preparedStatement.executeBatch();
									}
									if (users.size() % BATCH_SIZE != 0)
										preparedStatement.executeBatch();
								
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						   	finally {
						    if(preparedStatement != null) {
						        try {
									preparedStatement.close();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						    }

						   	}
			    }
					else{
						System.out.println("No records to update");
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			   	finally {
			    if(preparedStatement != null) {
			        try {
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    }
			   	}

		
				}
	

	private HashMap<String,Validitydetails> getPlan_name(){
		
		HashMap<String, Validitydetails> planMap = null;
		 Connection dbConnection = null;
		    PreparedStatement preparedStatement = null;
            ResultSet rs =null;
		    String selectTableSQL = null;
		    String p =null;
            Validitydetails vt =new Validitydetails(p, p);
		    try {
		    	planMap = new HashMap<String, Validitydetails>();
		    	String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		    	String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		    	DbUtils.loadDriver (jdbcDriver); 
		    	dbConnection = DriverManager.getConnection (jdbcURL, "system", "Welcome#123"); 
		    	//connects to ICORE database
		    	selectTableSQL = "Select PM.PLAN_ID as PLAN_ID , PL.VALIDITY_TYPE as VALIDITY_TYPE, PL.VALIDITY as VALIDITY from T_D_CNF_PLAN_LIFECYCLE PL,"
                                 +"T_D_CNF_PLAN_MASTER PM where PL.LIFECYCLE_ID = PM.LIFECYCLE_ID and PL.VALIDITY_TYPE not in('MI','LT','SS')";
		        preparedStatement = dbConnection.prepareStatement(selectTableSQL,ResultSet.TYPE_SCROLL_SENSITIVE, 
                        ResultSet.CONCUR_UPDATABLE);
		        // execute select SQL statement
		        rs = preparedStatement.executeQuery();
		        while(rs.next())
		        {
		        	vt.setValType(rs.getString("VALIDITY_TYPE").trim());
		        	vt.setValDet(String.valueOf(rs.getInt("VALIDITY")));
		        	Validitydetails s1 = new Validitydetails(vt.getValType(),vt.getValDet());
		        	//pList.add(bBean);
		        	planMap.put(rs.getString("PLAN_ID").trim(), s1);
		        }
		    }
		    catch (SQLException e) {

		        System.out.println(e.getMessage());

		    } finally {
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

		         if (dbConnection != null) {
		             try {
						dbConnection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		             System.out.println("Database Connection is closed");
		         }

		    }
		return planMap;
		
	}
	

}
