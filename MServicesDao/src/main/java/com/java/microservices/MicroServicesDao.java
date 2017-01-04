/**
 * 
 */
package com.java.microservices;

import java.util.List;

import com.java.restapi.microservice.dto.*;

/**
 * @author subbu
 *
 */
public interface MicroServicesDao {
	public List<Customer> getAllCustomers(String dbName);
	public Customer getCustomer(String customerId,String dbName);
	
	public List<Product> getAllProducts(String dbName);
	public Product getProduct(Long productId,String dbName);
	
	public List<Order> getAllOrders(String dbName);
	public Order getOrder(Long orderId,String dbName);

}
