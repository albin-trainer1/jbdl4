package com.geek.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.geek.entity.Product;
import com.geek.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{
   @Autowired
	private Environment env;
	
	public List<Product> allProducts(){
		String port=env.getProperty("local.server.port");
		
		Product p1=new Product(101, "TShirt", 1000, port);
		Product p2=new Product(102, "Jeans", 5000, port);
		Product p3=new Product(103, "Mobile", 30000, port);
		Product p4=new Product(104, "Laptop", 60000, port);
		Product p5=new Product(105, "tv", 50000, port);
		
		return Arrays.asList(p1,p2,p3,p4,p5);
	}
}
