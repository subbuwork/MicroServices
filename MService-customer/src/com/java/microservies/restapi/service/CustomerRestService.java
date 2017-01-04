package com.java.microservies.restapi.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.java.microservices.MicroServicesDao;
import com.java.restapi.microservice.dto.Customer;
import com.java.restapi.microservices.dao.impl.MicroServiceDaoImpl;

/**
 * @author subbu
 *
 */
@Path("/Customerrestservices")
public class CustomerRestService {
	MicroServicesDao microServicesDao = new MicroServiceDaoImpl("customerdb");
	
	@GET
	@Path("/getAllCustomers")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCustomers(){
		List<Customer> customersList = new ArrayList<Customer>();
		customersList = microServicesDao.getAllCustomers("");
		System.out.println("Cusotmers List size::"+customersList.size());
		return Response.ok().entity(new GenericEntity<List<Customer>>(customersList){}).build();
	}
	
	@GET
	@Path("/getCustomer/{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomer(@PathParam("customerId")String customerId){
		Customer customer = microServicesDao.getCustomer(customerId,"customerdb");
		return Response.ok().entity(customer).build();
	}

}
