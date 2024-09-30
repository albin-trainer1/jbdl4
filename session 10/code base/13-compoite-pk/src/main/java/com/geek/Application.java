package com.geek;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.geek.entity.Customer;
import com.geek.repository.CustomerDao;
import com.geek.repository.CustomerDaoImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		
	CustomerDao cdao=ctx.getBean(CustomerDaoImpl.class);

	}
}
