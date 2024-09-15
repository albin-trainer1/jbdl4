package com.geek.threads;

public class SynchronizationEx {
public static void main(String[] args) throws InterruptedException {
	BankingService bankService=new BankingService();
	Thread t1=new Thread(bankService);
	t1.setName("UPI");
	t1.start();
	
	Thread t2=new Thread(bankService);
	t2.setName("ATM");
	t2.start();
	
	t1.join(); //blocks the current thread, untile t1 finishes the task
	t2.join();
	System.out.println(bankService.getBalance());
}
}
class BankingService implements Runnable{
	private float balanceAmt=5000;
	@Override
	public void run() {
		debit(3000);
	}
	
	private  void debit(float amt) {
		System.out.println(Thread.currentThread().getName()+" trying to debit");
		if(amt<=balanceAmt) {
			System.out.println(Thread.currentThread().getName()+" abt  to debit");
			try {
				Thread.sleep(5000);
				//wait(2000);//obj lock ll get released & thread goes to block state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balanceAmt=balanceAmt-amt;
			System.out.println(Thread.currentThread().getName()+" Transaction Success");
		}
		else
			System.out.println(Thread.currentThread().getName()+" Insufficient funds");
	}
	float getBalance() {
		return balanceAmt;
	}
}