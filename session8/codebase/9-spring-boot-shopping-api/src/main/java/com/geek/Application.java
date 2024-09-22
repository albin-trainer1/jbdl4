package com.geek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.geek.dao.ProductRepository;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		ProductRepository repo= ctx.getBean(ProductRepository.class);
		for(String s:ctx.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
