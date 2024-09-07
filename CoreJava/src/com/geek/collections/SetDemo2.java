package com.geek.collections;

import java.util.HashSet;

import com.geek.lambda.Product;

public class SetDemo2 {
public static void main(String[] args) {
	Product p1= new Product(101, "Laptop", 50000, 4.5f);
	Product p2= new Product(102, "Watch", 4000, 4.2f);
	Product p3= new Product(103, "Mouse", 1000, 4.7f);
	Product p4= new Product(104, "T Shirt", 2000, 3.5f);
	Product p5=  new Product(101, "Laptop", 50000, 4.5f);
	
	HashSet<Product> set= new HashSet<>();
	set.add(p1);
	set.add(p2);
	set.add(p5);
	set.add(p3);
	set.add(p4);

	System.out.println(p1.equals(p5));
	System.out.println(set.size());
	//System.out.println(p1.hashCode());
	//System.out.println(p5.hashCode());
	
	int n=16;
	//System.out.println((n - 1) & p1.hashCode());
}
}
