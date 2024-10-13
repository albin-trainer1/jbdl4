package com.geek.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geek.entity.Product;
import com.geek.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
private ProductService prodService;
  @PostMapping
	public Product addNewProduct(@RequestBody Product p) {
		return prodService.addNewProduct(p);
	}
  @GetMapping
  public List<Product> allProducts() {
		return prodService.allProducts();
	}
	@GetMapping("/{id}")
	public Product searchById(@PathVariable  int id) {
		System.out.println("Calling service...");
		return prodService.searchById(id);
	}
}
