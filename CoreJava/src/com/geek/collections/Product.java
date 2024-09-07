package com.geek.collections;
//image not real
public class Product {
	//instance variables....
private int productId;
private String productName;
private float price;
private float ratings;

public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int productId, String productName, float price, float ratings) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.ratings = ratings;
}


public float getRatings() {
	return ratings;
}
public void setRatings(float ratings) {
	this.ratings = ratings;
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
	if(price>0)
	 this.price = price;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", ratings="
			+ ratings + "]";
}


}
