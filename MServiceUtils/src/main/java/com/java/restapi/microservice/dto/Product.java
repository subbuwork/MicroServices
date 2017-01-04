package com.java.restapi.microservice.dto;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer pId;
	private String pName;
	private String pCategory;
	private String pDescription;
	private String pManufactuingDate;
	private String pExpirationDate;
	private String pManufacturer;
	private String pManufacturer_AddressLine1;
	private String pManufacturer_AddressLine2;
	private Integer pManf_zip_code;
	
	
	public Product(){}


	/**
	 * @param pId
	 * @param pName
	 * @param pCategory
	 * @param pDescription
	 * @param pManufactuingDate
	 * @param pExpirationDate
	 * @param pManufacturer
	 * @param pManufacturer_AddressLine1
	 * @param pManufacturer_AddressLine2
	 * @param pManf_zip_code
	 */
	public Product(Integer pId, String pName, String pCategory,
			String pDescription, String pManufactuingDate,
			String pExpirationDate, String pManufacturer,
			String pManufacturer_AddressLine1,
			String pManufacturer_AddressLine2, Integer pManf_zip_code) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCategory = pCategory;
		this.pDescription = pDescription;
		this.pManufactuingDate = pManufactuingDate;
		this.pExpirationDate = pExpirationDate;
		this.pManufacturer = pManufacturer;
		this.pManufacturer_AddressLine1 = pManufacturer_AddressLine1;
		this.pManufacturer_AddressLine2 = pManufacturer_AddressLine2;
		this.pManf_zip_code = pManf_zip_code;
	}


	public Integer getpId() {
		return pId;
	}


	public void setpId(Integer pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public String getpCategory() {
		return pCategory;
	}


	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}


	public String getpDescription() {
		return pDescription;
	}


	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}


	public String getpManufactuingDate() {
		return pManufactuingDate;
	}


	public void setpManufactuingDate(String pManufactuingDate) {
		this.pManufactuingDate = pManufactuingDate;
	}


	public String getpExpirationDate() {
		return pExpirationDate;
	}


	public void setpExpirationDate(String pExpirationDate) {
		this.pExpirationDate = pExpirationDate;
	}


	public String getpManufacturer() {
		return pManufacturer;
	}


	public void setpManufacturer(String pManufacturer) {
		this.pManufacturer = pManufacturer;
	}


	public String getpManufacturer_AddressLine1() {
		return pManufacturer_AddressLine1;
	}


	public void setpManufacturer_AddressLine1(String pManufacturer_AddressLine1) {
		this.pManufacturer_AddressLine1 = pManufacturer_AddressLine1;
	}


	public String getpManufacturer_AddressLine2() {
		return pManufacturer_AddressLine2;
	}


	public void setpManufacturer_AddressLine2(String pManufacturer_AddressLine2) {
		this.pManufacturer_AddressLine2 = pManufacturer_AddressLine2;
	}


	public Integer getpManf_zip_code() {
		return pManf_zip_code;
	}


	public void setpManf_zip_code(Integer pManf_zip_code) {
		this.pManf_zip_code = pManf_zip_code;
	}
	
	
	
	
	

}
