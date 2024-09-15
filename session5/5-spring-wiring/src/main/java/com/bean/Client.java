package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.service.AccountService;

public class Client {
public static void main(String[] args) {
	ApplicationContext ctx=
			new ClassPathXmlApplicationContext("beans.xml");
	AccountService service= (AccountService) ctx.getBean("service");
	System.out.println(service.creditService(10000));
	
	
}
}
