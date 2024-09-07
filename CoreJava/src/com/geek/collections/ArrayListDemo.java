package com.geek.collections;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Integer> list= new ArrayList<>();
	list.add(10);
	list.add(16);
	list.add(15);
	list.add(17);
	list.add(18);
	list.add(19);
	System.out.println(list);
	
//	list.contains(18); //to search element
	list.set(1, 20);//replace the element in the 1st index
	//how to iterate
	//1. traditional for loop
	//Prior to JDK 5
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	//in jdk5 for each introduced
  System.out.println("****For each");
  for(int val:list) {
	  System.out.println(val);
  }
  System.out.println("****JDK 8 style of iteration");
  Consumer<Integer> c= i->System.out.println(i);
  list.forEach(c);
   
   Predicate<Integer> p= i-> i%2==0;
   list.removeIf(p);
   System.out.println(list);
   
  
}
}
