/**
 * 
 */
package com.java.restapi.microservices.constants;

/**
 * @author subbu
 *
 */
public class SQLQueryUtils {
	
	public static final String DB_NAME_CUSTOMER = "customerdb";
	public static final String DB_NAME_PRODUCT = "productdb";
	public static final String DB_NAME_ORDER = "orderdb";
	
	public static final String GET_ALL_CUSTOMERS = "SELECT * FROM my_customers.customer;";
	public static final String GET_CUSTOMER ="SELECT * FROM my_customers.customer where cid =";
	
	//Products fetching query...
	public static final String GET_ALL_PRODUCTS ="select * from my_products.product;";

}
