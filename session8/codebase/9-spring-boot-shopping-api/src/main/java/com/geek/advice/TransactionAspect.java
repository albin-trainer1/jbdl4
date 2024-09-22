package com.geek.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class TransactionAspect {
	@Pointcut("execution(public * getAllProductsService())")
	private void myMethod() {
		
	}
	
	//@Before("execution(public * getAllProductsService())")
	@Before("myMethod()")
	public void transaction() {
		System.out.println("****Transaction Aspect****");
	}
}
