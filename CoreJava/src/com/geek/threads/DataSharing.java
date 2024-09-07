package com.geek.threads;
public class DataSharing {
public static void main(String[] args) throws InterruptedException {
	MyTask2 task= new MyTask2();
	Thread t1= new Thread(task);
	Thread t2= new Thread(task);
	Thread t3= new Thread(task);
	t1.start();t2.start();t3.start();
	
	System.out.println("Main waiting for other threads to finish the task");
	t1.join();t2.join();t3.join();
	System.out.println(task.getData());
}
}
class MyTask2 implements Runnable{
	int data=0;
	@Override
	public void run() {
		for(int i=1;i<=100000;i++) {
			//synchronized(this) {
					update(); // 1. read+2. update+ 3.write
			//}
		}
	}
	synchronized  void update() {
		data++;
	}
	int getData() {
		return data;
	}
}