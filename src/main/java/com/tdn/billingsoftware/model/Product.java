package com.tdn.billingsoftware.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String productName;
	@Column
	private String productCode;
	@Column
	private String productDescription;
	@Column
	private float productPrice;
	

	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(long id, String productName, String productCode, String productDescription, float productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public float getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}


}