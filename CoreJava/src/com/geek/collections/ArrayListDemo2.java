package com.geek.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.function.Predicate;

import com.geek.lambda.Product;

public class ArrayListDemo2 {
public static void main(String[] args) {
	Vector<String> v= new Vector<>();
	v.add("Hello");
	
	ArrayList<String> list= new ArrayList<>();
	list.add("Bangalore");
	list.add("Delhi");
	list.add("Chennai");
	list.add("Agra");
	list.add("Hyd");
	list.add("Mangalore");
	Collections.sort(list);
	System.out.println(list);
	
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
	plist.forEach(p->System.out.println(p));
	Collections.sort(plist);//Natural Order of sorting
	System.out.println("****After Sorting****");
	plist.forEach(p->System.out.println(p));
	 Comparator<Product> c=(Product pr1, Product pr2)-> {
			return p1.getRatings()<p2.getRatings()?1:-1;
		};
	Collections.sort(plist,(pr1,pr2)->  pr1.getRatings()<pr2.getRatings()?1:-1); //Custom way 
	System.out.println("**** Sorting by Ratings****");
	plist.forEach(p->System.out.println(p));
	Predicate<Product> removeCondition=p->p.getRatings()<4;
	plist.removeIf(removeCondition);
	

}
}

class RatingSort implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getRatings()<p2.getRatings()?1:-1;
	}
	
}
