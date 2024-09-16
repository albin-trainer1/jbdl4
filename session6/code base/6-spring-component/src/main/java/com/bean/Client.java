package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.repo.AccountRepository;
import com.bean.service.AccountService;

public class Client {
public static void main(String[] args) {
	ApplicationContext ctx=
			new ClassPathXmlApplicationContext("beans.xml");
	AccountService service= (AccountService) ctx.getBean("myservice");
	System.out.println(service.creditService(10000));
	String beans[]=ctx.getBeanDefinitionNames();
	for(String b:beans) {
		System.out.println(b);
	}
}
}
