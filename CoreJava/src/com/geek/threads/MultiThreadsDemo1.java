package com.geek.threads;

public class MultiThreadsDemo1 {
public static void main(String[] args) {
	MyTask task=new MyTask();
	Thread t1=new Thread(task); //new state
	t1.start(); //Runnable
	//depends on scheduler
	for(int i=1;i<=1000;i++) {
		System.out.println("Main : "+i);
	}
}
}


class MyTask implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			System.out.println("Child : "+i);
		}
	}
	
}