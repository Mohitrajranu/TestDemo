package dbPool;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class CreateDatasource {
	public CreateDatasource() {
		//
        // First we load the underlying JDBC driver.
        // You need this if you don't use the jdbc.drivers
        // system property.
        //
        System.out.println("Loading underlying JDBC driver.");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
	}
	
	public DataSource setupDataSource(String connectURI, String userName, String passwrd) {
//        Properties a= new Properties();
//        a.s
		//
        // First, we'll create a ConnectionFactory that the
        // pool will use to create Connections.
        // We'll use the DriverManagerConnectionFactory,
        // using the connect string passed in the command line
        // arguments.
        //
//        ObjectPool connectionPool = null;
//        PoolingDataSource dataSource = null;
//        try{
//        ConnectionFactory ConnectionFactory = new DriverManagerConnectionFactory(connectURI, userName, passwrd);
// 
		//
//        // Next we'll create the PoolableConnectionFactory, which wraps
//        // the "real" Connections created by the ConnectionFactory with
//        // the classes that implement the pooling functionality.
//        //
//        PoolableConnectionFactory poolableConnectionFactory =
//            new PoolableConnectionFactory(ConnectionFactory, connectionPool, null, null, false, false);
//
//        //
//        // Now we'll need a ObjectPool that serves as the
//        // actual pool of connections.
//        //
//        // We'll use a GenericObjectPool instance, although
//        // any ObjectPool implementation will suffice.
//        //
//        connectionPool = new GenericObjectPool(poolableConnectionFactory);
//
//        //
//        // Finally, we create the PoolingDriver itself,
//        // passing in the object pool we created.
//        //
//        dataSource = new PoolingDataSource(connectionPool);
//        }catch (Exception e) {
//			// TODO: handle exception
//        	e.printStackTrace();
//		}
//
//        return dataSource;
		
//		basic datasource style
		BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername(userName);
        ds.setPassword(passwrd);
        ds.setAccessToUnderlyingConnectionAllowed(true);
        ds.setDefaultAutoCommit(true);
        ds.setInitialSize(1);
        ds.setMaxActive(50);
        ds.setMaxIdle(1);
        ds.setMinEvictableIdleTimeMillis(1000);
//        ds.setMinIdle();
        ds.setUrl(connectURI);
        ds.setDefaultAutoCommit(true);
        ds.setLogAbandoned(false);
//        ds.setMaxOpenPreparedStatements(500);
        ds.setMaxWait(3000);
      
//        ds.setNumTestsPerEvictionRun(1);
        ds.setPoolPreparedStatements(true);
        ds.setRemoveAbandoned(true);
        ds.setLogAbandoned(true);
        ds.setTestOnBorrow(true);
        ds.setTimeBetweenEvictionRunsMillis(10000);
        return ds;
    }
}
