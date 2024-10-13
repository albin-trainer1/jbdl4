package com.geek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.geek.entity.Product;
import com.geek.entity.ProductRep;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
	@Autowired
private ProductRep prodRep;
	@CachePut(key = "#p.id",value = "prod")
	public Product addNewProduct(Product p) {
		return prodRep.save(p);
	}
	
	public List<Product> allProducts() {
		return prodRep.findAll();
	}
	
	@Cacheable(key = "#id",value = "prod")
	public Product searchById(int id) {
		System.out.println("CONNECTING DB....");
		//chek in cache
			//if not available get frm DB
			//store in the cache
		//if its available in cache
		   //get from cache, no hits to DB....
		return prodRep.findById(id).get();
	}
	//@CachePut //to edit the cache
	//@CacheEvict //to remove cache data
}
