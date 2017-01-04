/**
 * 
 */
package com.java.restapi.microservice.dto;

import java.io.Serializable;

/**
 * @author subbu
 *
 */
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long order_id;
	private Long product_id;
	private Long cusotmer_id;
	private Long quantity;
	private String delivery_date;
	private Double amount;
	
	private Customer customer;
	private Product product;
	
	
	public Order(){}


	/**
	 * @param order_id
	 * @param product_id
	 * @param cusotmer_id
	 * @param quantity
	 * @param delivery_date
	 */
	public Order(Long order_id, Long product_id, Long cusotmer_id,
			Long quantity, String delivery_date,Double amount,Customer customer, Product product) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.cusotmer_id = cusotmer_id;
		this.quantity = quantity;
		this.delivery_date = delivery_date;
		this.amount = amount;
		this.customer = customer;
		this.product = product;
	}


	public Long getOrder_id() {
		return order_id;
	}


	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}


	public Long getProduct_id() {
		return product_id;
	}


	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}


	public Long getCusotmer_id() {
		return cusotmer_id;
	}


	public void setCusotmer_id(Long cusotmer_id) {
		this.cusotmer_id = cusotmer_id;
	}


	public Long getQuantity() {
		return quantity;
	}


	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}


	public String getDelivery_date() {
		return delivery_date;
	}


	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
