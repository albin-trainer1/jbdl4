package com.geek.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.geek.exceptions.ApplicationException;
import com.geek.model.Product;
@Component
public class ProductServiceImpl implements ProductService {
	//DUMMY data
	List<Product> products;
	{
		products=new ArrayList<>();
		products.add(new Product(101,"Mobile",20000));
		products.add(new Product(102,"Laptop",50000));
		products.add(new Product(103,"Mouse",500));
		products.add(new Product(104,"Toy",400));
		products.add(new Product(105,"T Shirt",1000));
	}
	@Override
	public List<Product> getAllProducts() {
		return products;
	}
	@Override
	public Product findById(int id) {
		return products.stream().
				filter(p->p.getProductId()==id)
				.findFirst().
				orElseThrow(
						()->new ApplicationException("The resource "+id+" not found"));
	}

	@Override
	public Product addNewProduct(Product p) {
		products.add(p);
		return p;
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> searchByName(String name) {
		return products.stream().
				filter(p->p.getProductName().
						equals(name)).toList();

	}

}
