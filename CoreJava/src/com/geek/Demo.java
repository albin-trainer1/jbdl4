package com.geek;

public class Demo {
public static void main(String[] args) {
	new C1().hello();
}
}

class P1{
	public void hello() {
		 f1();
	}
private void f1() {
		System.out.println("I m coming from Parent");
	}
}
class C1 extends P1{
	
	void f1() {
		System.out.println("I m coming from Child");
	}
}