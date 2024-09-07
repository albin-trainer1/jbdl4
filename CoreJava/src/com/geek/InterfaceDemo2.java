package com.geek;

public class InterfaceDemo2 {
public static void main(String[] args) {
	C c=new C();
	c.hello();
	B.f1();
	
}
}
interface A{
	default void hello() {
		System.out.println("I m coming from A");
	}
}
interface B{
	default void hello() {
		System.out.println("I m coming from B");
	}
	static void f1() {
		System.out.println("f1 method of B");
		f2();
	}
	private static void f2() {
		System.out.println("f2 method of B");
	}
}
class C implements A,B{
   static void f1() {
	   
   }
	@Override
	public void hello() {
		B.super.hello();
		B.f1();
	}
	
	
}