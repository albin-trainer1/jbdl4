package com.geek.collections;

import java.util.HashMap;

public class MapDemo {
public static void main(String[] args) {
	HashMap<String, String> map1= new HashMap<>();
	map1.put("Bangalore", "Kannada");
	map1.put("Mysore", "Kannada");
	map1.put("Hyderabad", "Telugu");
	map1.put("Delhi", "Hindi");
	System.out.println(map1);
	 String lang=map1.get("Delhi");
	 System.out.println(lang);

}
}
