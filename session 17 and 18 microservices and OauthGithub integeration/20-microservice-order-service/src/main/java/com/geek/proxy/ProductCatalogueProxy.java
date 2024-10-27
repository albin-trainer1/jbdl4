package com.geek.proxy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.geek.model.Order;
//@FeignClient(name="anyname",url ="http://localhost:8100") //with out load balancing ....
@FeignClient(name="product-catalogue") //with load balancing ....
public interface ProductCatalogueProxy {
	   @GetMapping("/products/{pid}")
		Order orderProduct(@PathVariable("pid")  int pid);
}
