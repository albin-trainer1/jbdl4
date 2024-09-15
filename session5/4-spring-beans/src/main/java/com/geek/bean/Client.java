package com.geek.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		//initialize spring container
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Spring container initialized");
  	  GreetingBean bean1=(GreetingBean) ctx.getBean("g1");
  	  GreetingBean bean2=(GreetingBean) ctx.getBean("g1");
  	  System.out.println(bean1==bean2);
	//	System.out.println(bean.wish("Albin"));
	}
}
