package com.geek.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.geek.model.Product;
import com.geek.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductsApi {
	@Autowired
	private ProductService productService;
   @GetMapping("/test")
	public String test() {
		return "TEST";
	}
   @GetMapping(value =  "/sample",produces = {"application/xml","application/json"})
   public Product sample() {
	    Product p=new Product(101, "Toy", 500);
	    return p;
   }
   @GetMapping
   public List<Product> getAllProducts(){
	 return  productService.getAllProducts();
   }
   
   @GetMapping("/{prodId}") // 101
   public Product searchById(@PathVariable("prodId")  int pid){
	 return productService.findById(pid);
   }
   @PostMapping(produces = "application/xml",consumes = {"application/xml","application/json"})
   public ResponseEntity<Product> addNewProduct(@RequestBody  Product p) {
	   return  new  ResponseEntity<>(productService.addNewProduct(p),HttpStatus.CREATED);
   }
   
   @GetMapping("/search")// /search?name=zzzz
   public  ResponseEntity<List<Product>> searchByName(@RequestParam("name")  String name){
	   List<Product> products=productService.searchByName(name);;
	   if(products.size()==0) {
		   return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	   }
	   return  new ResponseEntity<List<Product>>(products,HttpStatus.OK);
   }
}
