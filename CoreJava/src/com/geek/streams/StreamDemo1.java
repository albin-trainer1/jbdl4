package com.geek.streams;

import java.util.ArrayList;
import java.util.List;

import com.geek.lambda.Product;

public class StreamDemo1 {
public static void main(String[] args) {

	Product p1= new Product(101, "Laptop", 50000, 4.5f);
	Product p2= new Product(102, "Watch", 4000, 4.2f);
	Product p3= new Product(103, "Mouse", 1000, 4.7f);
	Product p4= new Product(104, "T Shirt", 2000, 3.5f);
	Product p5= new Product(105, "Mobile", 20000, 4.1f);
	ArrayList<Product> plist= new ArrayList<>();
	plist.add(p1);
	plist.add(p2);
	plist.add(p3);
	plist.add(p4);
	plist.add(p5);
	List<Product> topProducts=topRatingsProduct(plist, 3);
	topProducts.forEach(p->System.out.println(p.getProductName()));
}
static List<Product> topRatingsProduct(List<Product> plist, int n){
	List<Product> list=
	plist.stream().
	sorted((pr1,pr2)->pr1.getRatings()<pr2.getRatings()?1:-1).
	limit(n).toList();
	return list;
}
static double findTotalPrice(List<Product> plist) {
	return plist.stream().mapToDouble(p->p.getPrice()).sum();
}
}
