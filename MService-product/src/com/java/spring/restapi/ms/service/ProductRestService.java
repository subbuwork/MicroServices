/**
 * 
 */
package com.java.spring.restapi.ms.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.java.microservices.MicroServicesDao;
import com.java.restapi.microservice.dto.Product;
import com.java.restapi.microservices.constants.SQLQueryUtils;
import com.java.restapi.microservices.dao.impl.MicroServiceDaoImpl;

/**
 * @author subbu
 *
 */
@Path("/ProductRestService")
public class ProductRestService {
    MicroServicesDao microServiceDao =  new MicroServiceDaoImpl(SQLQueryUtils.DB_NAME_PRODUCT);
	
    @GET
	@Path("/getAllProducts")
	public List<Product> getAllProduct(){
		System.out.println("Entering:::"+ProductRestService.class.getSimpleName()+"::getAllProduct()");
		List<Product> products = new ArrayList<Product>();
		products = microServiceDao.getAllProducts(SQLQueryUtils.DB_NAME_PRODUCT);
		System.out.println("Exiting:::"+ProductRestService.class.getSimpleName()+"::getAllProduct()::Number of products::"+products.size());
		return products;
	}

}
