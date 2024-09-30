package com.geek.advice;

import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.geek.model.Product;
@Aspect
@Component
@Order(2)
public class LoggingAspect {
	@Pointcut("execution(public * getAllProductsService())")
	private void myMethod() {
		
	}
	//@Before("execution(public * getAllProductsService())")
	@Before("myMethod()")
	public void logs1() {
		System.out.println("****Logs1 Before****");
	}
	//@After("execution(public * getAllProductsService())")
	@After("myMethod()")
	public void logs2() {
		System.out.println("****Logs2 After****");
	}
	@Around("myMethod()")
	public  List<Product> logs3(ProceedingJoinPoint jp){
		System.out.println("Around before");
		 List<Product> list=null;
		try {
			list = (List<Product>) jp.proceed();
			System.out.println(list);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Around After");
		 return list;
	}
}
