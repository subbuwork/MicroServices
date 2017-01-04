package com.java.restapi.microservice.dto;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cId;
	private String c_fname;
	private String c_lName;
	private String c_addressLine1;
	private String c_addressLine2;
	private Integer zip_code;
	
	public Customer(){}

	public Customer(Integer cId, String c_fname, String c_lName,
			String c_addressLine1, String c_addressLine2, Integer zip_code) {
		super();
		this.cId = cId;
		this.c_fname = c_fname;
		this.c_lName = c_lName;
		this.c_addressLine1 = c_addressLine1;
		this.c_addressLine2 = c_addressLine2;
		this.zip_code = zip_code;
	}


	public Integer getcId() {
		return cId;
	}


	public void setcId(Integer cId) {
		this.cId = cId;
	}


	public String getC_fname() {
		return c_fname;
	}


	public void setC_fname(String c_fname) {
		this.c_fname = c_fname;
	}


	public String getC_lName() {
		return c_lName;
	}


	public void setC_lName(String c_lName) {
		this.c_lName = c_lName;
	}


	public String getC_addressLine1() {
		return c_addressLine1;
	}


	public void setC_addressLine1(String c_addressLine1) {
		this.c_addressLine1 = c_addressLine1;
	}


	public String getC_addressLine2() {
		return c_addressLine2;
	}


	public void setC_addressLine2(String c_addressLine2) {
		this.c_addressLine2 = c_addressLine2;
	}


	public Integer getZip_code() {
		return zip_code;
	}


	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}
	
	
	
	
	
	
	

}
