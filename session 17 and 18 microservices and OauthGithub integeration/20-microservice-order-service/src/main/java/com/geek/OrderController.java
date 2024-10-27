package com.geek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geek.model.Order;
import com.geek.proxy.ProductCatalogueProxy;

@RestController

public class OrderController {
	@GetMapping("/order/{pid}/{quantity}")
 public ResponseEntity<Order> doOrder(@PathVariable int pid,@PathVariable int quantity){
		String url="http://localhost:8100/products/"+pid;
		RestTemplate restTemplate= new RestTemplate();
		Order order=  restTemplate.getForObject(url, Order.class);
		order.setPrice(order.getPrice()*quantity);
		order.setQuantity(quantity);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
 }
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/orderwithloadbalancer/{pid}/{quantity}")
 public ResponseEntity<Order> doOrderWithLoadBalancing(@PathVariable int pid,@PathVariable int quantity){
		String url="http://product-catalogue/products/"+pid;
		Order order=  restTemplate.getForObject(url, Order.class);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
 }
	@Autowired
	private ProductCatalogueProxy proxy;
	@GetMapping("/orderwithFeign/{pid}/{quantity}")
 public ResponseEntity<Order> doOrderWithFeign(@PathVariable int pid,@PathVariable int quantity){
		Order order=  proxy.orderProduct(pid);
		return new ResponseEntity<Order>(order,HttpStatus.OK);
 }
	
	
}
