package com.model;

public class Product {
	
	private int productID;
	private String productName;
	private String productDesc;
	private int category_id;
	private int unitPrice;
	
	public Product() {
		super();
	}
	
	public Product(int productID, String productName, String productDesc, int category_id, int unitPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productDesc = productDesc;
		this.category_id = category_id;
		this.unitPrice = unitPrice;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	

}
