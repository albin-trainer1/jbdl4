package com.geek;
//image not real
public class Product {
	//instance variables....
private int productId;
private String productName;
private float price;

//static variable
private static float discount;

public static float getDiscount() {
	return discount;
}
public static void setDiscount(float discount) {
	Product.discount = discount;
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


}
