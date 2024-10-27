package com.geek.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geek.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductApi {
	@Autowired
	private ProductService productService;
	
 @GetMapping("/{pid}")
	public ResponseEntity<Product> getProduct(@PathVariable int pid,
		@RequestHeader("loggedInUser") String uname
			){
	 System.out.println(uname);
	 List<Product> list=productService.allProducts();
	 Product product=list.stream().filter(p->p.getProductId()==pid).findFirst().get();
	 return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
}
