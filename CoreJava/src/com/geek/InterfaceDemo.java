package com.geek;

public class InterfaceDemo {
public static void main(String[] args) {
	Driveable driver= getCar("BMW");
	driver.gear();
}
static Driveable getCar(String car) {
	if(car.equals("Alto"))
		return new Alto();
	else
		return new BMW();
}
}
interface Driveable{
	void gear();//public abstract void gear();
}
class Alto implements Driveable{
	//while overriding cant reduce the visibility of the mthod
	public void gear() {
		System.out.println("Alto gear...");
	}
}
class BMW implements Driveable{
	//while overriding cant reduce the visibility of the mthod
	public void gear() {
		System.out.println("BMW gear...");
	}
}