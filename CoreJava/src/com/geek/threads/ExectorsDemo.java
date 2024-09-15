package com.geek.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExectorsDemo {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	/*
	 * ExecutorService service= Executors.newFixedThreadPool(2); MyTask6 task=new
	 * MyTask6(); service.execute(task); service.execute(task);
	 * service.execute(task); Thread.sleep(5000); service.shutdown();
	 */
	
	MyTask7 task=new MyTask7();
	ExecutorService service=Executors.newFixedThreadPool(2);
	 Future<Integer> result=service.submit(task);
	 //similar like join ...
	 System.out.println("Main Waiting ....");
	int r= result.get();
	System.out.println(r);
	service.shutdown();
}
}
class MyTask6 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running ...");
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class MyTask7 implements Callable<Integer>{
	public Integer call() throws Exception {
		int i=1;
		int s=0;
		for(;i<=100;i++) {
			Thread.sleep(100);
			s=s+i;
		}
		return i;
	}
	
}