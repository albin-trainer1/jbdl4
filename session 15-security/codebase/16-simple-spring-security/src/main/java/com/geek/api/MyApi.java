package com.geek.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
	@GetMapping("/home/admin")
public String  hello() {
	return  "Hello Admin";
}
	
	@GetMapping("/home/user")
	public String  hello2() {
		return  "Hello User";
	}
}
