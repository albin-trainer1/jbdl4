package com.geek.lambda;

import java.util.function.Consumer;

public class LambaEx2 {
public static void main(String[] args) {
	Product p1= new Product(101, "Laptop", 50000, 4.5f);
	Product p2= new Product(102, "Watch", 4000, 4.2f);
	Product p3= new Product(103, "Mouse", 1000, 4.7f);
	Product p4= new Product(104, "T Shirt", 2000, 3.5f);
	Product p5= new Product(105, "Mobile", 20000, 4.1f);
	Product products[]= {p1,p2,p3,p4,p5};
	//filterProducts(products, p->p.getRatings()>=4);
	ProductFilter filter=p-> p.getPrice()<30000 && p.getRatings()>=4;
	Consumer<Product> consumer= (p)-> System.out.println(p.getProductName());
	filterProducts(products, filter,consumer);
}
  static void filterProducts(Product products[],ProductFilter filter,Consumer<Product> c) {
	  for(Product p:products) {
		  if(filter.check(p)) {
			    // System.out.println(p);
			  c.accept(p);
		  }
	  }
  }
}/*
	 * class ProductFilterImpl implements ProductFilter{ public boolean
	 * check(Product p) { return p.getPrice()<30000 && p.getRatings()>=4; } } class
	 * ProductFilterByRatings implements ProductFilter{ public boolean check(Product
	 * p) { return p.getRatings()>=4; } }
	 */