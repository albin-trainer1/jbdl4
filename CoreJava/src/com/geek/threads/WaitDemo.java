package com.geek.threads;

public class WaitDemo {
public static void main(String[] args) throws InterruptedException {
	TaskWait task= new TaskWait();
	Thread t=new Thread(task);
	t.start();
	Thread.sleep(500);//block for .5 sec
	synchronized(task) {
		task.notifyAll();
		System.out.println("notifiedd....");
		Thread.sleep(5000);
	}
	System.out.println("Main Ends ....");
}
}
class TaskWait implements Runnable{
	public void run() {
		hello();
	}
	synchronized void hello() {
		System.out.println("I m waiting");
		try {
			wait();
			System.out.println("I m Back");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}