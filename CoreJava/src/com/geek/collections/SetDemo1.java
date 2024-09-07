package com.geek.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
public static void main(String[] args) {
	HashSet<String> set1=new HashSet<>();
	set1.add("Bangalore");
	set1.add("Mysore");
	set1.add("Agra");
	set1.add("Bangalore");
	set1.add("Delhi");
	set1.add("Mangalore");
	System.out.println(set1);
	
	TreeSet<String> set2= new TreeSet<>();
	set2.add("Bangalore");
	set2.add("Mysore");
	set2.add("Agra");
	set2.add("Bangalore");
	set2.add("Delhi");
	set2.add("Mangalore");
	System.out.println(set2);
	
	LinkedHashSet<String> set3= new LinkedHashSet<>();
	set3.add("Bangalore");
	set3.add("Mysore");
	set3.add("Agra");
	set3.add("Bangalore");
	set3.add("Delhi");
	set3.add("Mangalore");
	
	System.out.println(set3);
}
}
 