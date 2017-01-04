/**
 * 
 */
package com.java.ms.rest.spring.boot;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONWriter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.java.restapi.microservice.dto.Customer;
import com.java.restapi.microservice.dto.Order;

/**
 * @author subbu
 *
 */
@Named
@Path("/")
public class OrderRestService {
	private static final String REST_URI ="http://localhost:9090/MService-customer/restapi/microservices/Customerrestservices/getAllCustomers";
	private long id = 1;
	
	@Inject
	public RestTemplate restTemplate;
	
	
	@GET
	@Path("/getOrder")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrder(){
		Order order = new Order();
		
		List<Customer> response = (List<Customer>) restTemplate.getForObject(REST_URI,Customer.class);
		//JSONObject jsonObject = (JSONObject)response.getEntity();
		
		//JSONArray jsonArray= jsonObject.getJSONArray("");
		//System.out.println("Customer details from Order servcie...."+jsonArray.getJSONObject(1).toString());
		
		
		
		order.setCusotmer_id(id);
		order.setProduct_id(new Long(10002));
		order.setOrder_id(new Long(001));
		order.setQuantity(new Long(100));
		
		System.out.println("Customer details from tomcat server console:::"+response.size());
		
		return order;
		
	}

}
