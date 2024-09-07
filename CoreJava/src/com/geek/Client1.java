package com.geek;

public class Client1 {
	public static void main(String[] args) {
		Product.setDiscount(100);
		int x=10;
		//new to allocate memory dynamically
		Product p;
		p= new Product();
		//p.productId=101;
		//p.productName="Head phones";
		//p.price=2000;
		p.setProductId(101);
		p.setProductName("Head phones");
		p.setPrice(2000);
		display(p);
		  //object/instance
		Product p2= new Product();
		p2.setProductId(102);
		p2.setProductName("Shoes");
		p2.setPrice(3000);
		display(p2);
		System.out.println(p.getDiscount());
		System.out.println(p2.getDiscount());
		p.setDiscount(200);
		System.out.println(p2.getDiscount());
	//	System.out.println(p.price);
	}
	static void display(Product product) {
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		//product.price=-1000;
	}
}
