/**
 * 
 */
package com.java.restapi.microservices.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.db.connection.utils.service.ConnectionService;
import com.java.db.utils.connection.service.impl.ConnectionServiceImpl;
import com.java.microservices.MicroServicesDao;
import com.java.restapi.microservice.dto.Customer;
import com.java.restapi.microservice.dto.Order;
import com.java.restapi.microservice.dto.Product;
import com.java.restapi.microservices.constants.SQLQueryUtils;

/**
 * @author subbu
 *
 */
public class MicroServiceDaoImpl implements MicroServicesDao{
	
	Connection connection = null;
	String dbName;
	ConnectionService connServcie = new ConnectionServiceImpl();
	
	public MicroServiceDaoImpl(String dbname){
		System.out.println("MicroServiceDaoImpl DB Name:::"+dbname);
		this.dbName = dbname;
		//connServcie = (ConnectionService)new ConnectionServiceImpl().getDBConnection(dbName);
		connection = connServcie.getDBConnection(dbName);
	}
public MicroServiceDaoImpl(){};

	public List<Customer> getAllCustomers(String dbName) {
		System.out.println(MicroServiceDaoImpl.class.getName()+"::getAllCustomers()");
		List<Customer> customersList = new ArrayList<Customer>();
		Customer customer = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(SQLQueryUtils.GET_ALL_CUSTOMERS);
			while(resultSet.next()){
				customer = new Customer();
				customer.setcId(resultSet.getInt(1));
				customer.setC_fname(resultSet.getString(2));
				customer.setC_lName(resultSet.getString(3));
				customer.setC_addressLine1(resultSet.getString(4));
				customer.setC_addressLine2(resultSet.getString(5));
				customer.setZip_code(resultSet.getInt(6));
				
				System.out.println("Customer details::: "
						+ "CID::"+customer.getcId()
						+ "::: C Fname::"+customer.getC_fname()
						+ "::C Lname::"+customer.getC_lName()
						+ ":::C AddressLine1:::"+customer.getC_addressLine1()
						+ "::: C AddressLine2::"+customer.getC_addressLine2()
						+ "::: C Zip Code::"+customer.getZip_code());
				customersList.add(customer);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return customersList;
	}


	public Customer getCustomer(String customerId, String dbName) {
		Customer customer = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(SQLQueryUtils.GET_CUSTOMER+customerId);
			while(resultSet.next()){
				customer = new Customer();
				customer.setcId(resultSet.getInt(1));
				customer.setC_fname(resultSet.getString(2));
				customer.setC_lName(resultSet.getString(3));
				customer.setC_addressLine1(resultSet.getString(4));
				customer.setC_addressLine2(resultSet.getString(5));
				customer.setZip_code(resultSet.getInt(6));
				System.out.println("Customer details::: "
						+ "CID::"+customer.getcId()
						+ "::: C Fname::"+customer.getC_fname()
						+ "::C Lname::"+customer.getC_lName()
						+ ":::C AddressLine1:::"+customer.getC_addressLine1()
						+ "::: C AddressLine2::"+customer.getC_addressLine2()
						+ "::: C Zip Code::"+customer.getZip_code());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return customer;
	}


	public List<Product> getAllProducts(String dbName) {
		System.out.println(MicroServiceDaoImpl.class.getName()+"::getAllProducts");
		List<Product> productsList = new ArrayList<Product>();
		Product product = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(SQLQueryUtils.GET_ALL_PRODUCTS);
			while(resultSet.next()){
				product = new Product();
				product.setpId(resultSet.getInt(1));
				product.setpName(resultSet.getString(2));
				product.setpCategory(resultSet.getString(3));
				product.setpDescription(resultSet.getString(4));
				product.setpManufactuingDate(resultSet.getDate(5).toString());
				product.setpExpirationDate(resultSet.getDate(6).toString());
				product.setpManufacturer(resultSet.getString(7));
				product.setpManufacturer_AddressLine1(resultSet.getString(8));
				product.setpManufacturer_AddressLine2(resultSet.getString(9));
				product.setpManf_zip_code(resultSet.getInt(10));
				
				System.out.println("Customer details::: "
						+ "PID::"+product.getpCategory()
						+ "::: PNAME::"+product.getpName()
						+ "::Category::"+product.getpCategory()
						);
				productsList.add(product);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return productsList;
	}


	public Product getProduct(Long productId, String dbName) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Order> getAllOrders(String dbName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Order getOrder(Long orderId, String dbName) {
		// TODO Auto-generated method stub
		return null;
	}
	
/*	public static void main(String[] args) {
	MicroServiceDaoImpl impl = new MicroServiceDaoImpl("customerdb");
	
	impl.getCustomer("001","customerdb");
	
	
	
	}*/
	

}
