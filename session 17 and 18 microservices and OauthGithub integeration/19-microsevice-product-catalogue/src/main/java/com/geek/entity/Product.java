package com.geek.entity;

public class Product {
private int productId;
private String productName;
private float price;
private String portNo;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int productId, String productName, float price, String portNo) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.portNo = portNo;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getPortNo() {
	return portNo;
}
public void setPortNo(String portNo) {
	this.portNo = portNo;
}



}
