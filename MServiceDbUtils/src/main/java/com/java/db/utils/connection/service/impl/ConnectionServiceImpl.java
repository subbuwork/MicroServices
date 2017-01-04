/**
 * 
 */
package com.java.db.utils.connection.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.db.connection.utils.service.ConnectionService;

/**
 * @author subbu
 *
 */
public class ConnectionServiceImpl implements ConnectionService {
	
    public static final String jandi_name_customer= "jndi/customerdb";
    public static final String jandi_name_products= "jndi/productsdb";
    public static final String jandi_name_orders= "jndi/ordersdb";
    
    InitialContext context = null;
    DataSource dataSource = null;
    Connection conn = null;
	public Connection getDBConnection(String db_name) {
		try {
			context = new InitialContext();
			if(db_name.equalsIgnoreCase("customerdb")){
				System.out.println("Creating connection to customer data base.....");
			    dataSource = (DataSource)context.lookup(jandi_name_customer);
			}else if(db_name.equalsIgnoreCase("productsdb")){
				System.out.println("Creating connection to products data base.....");
				dataSource = (DataSource)context.lookup(jandi_name_products);
			}else{
				System.out.println("Creating connection to orders data base.......");
				dataSource = (DataSource)context.lookup(jandi_name_orders);
			}
			conn = dataSource.getConnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//closeConnection(conn);
		return conn;
	}


	public void closeConnection(Connection connection) {
		// TODO Auto-generated method stub
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
