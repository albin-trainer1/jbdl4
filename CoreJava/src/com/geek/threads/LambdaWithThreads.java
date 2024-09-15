package com.geek.threads;

import java.util.stream.Stream;

public class LambdaWithThreads {
public static void main(String[] args) {
	LambdaWithThreads h= new LambdaWithThreads();
	Task4 task=new Task4();
	Thread t= new Thread(task);
	t.start();
	//Runnable r=()->hello();
	Thread t2=new Thread(()->h.hello());
	t2.start();
	//MethodReference --> instead of lambda 
	Thread t3= new Thread(h::hello);
	t3.start();
	Stream.of(1,2,3,4,5).forEach( i-> System.out.println(i));
	//it works since the println signature & accept method signature are same
	Stream.of(1,2,3,4,5).forEach(System.out::println);
	
	Thread t4= new Thread(LambdaWithThreads::new);
	t4.start();
}
 void hello() {
	System.out.println("HELLO****");
}
 LambdaWithThreads(){ //since it has the same signature of run()
	 System.out.println("hi ..."+Thread.currentThread().getName());
 }
}

class Task4 implements Runnable{
	public void run() {
			System.out.println("Another thread...");
	}
}