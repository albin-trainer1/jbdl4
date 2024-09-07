package com.geek.generics;

public class GenericsDemo1 {
public static void main(String[] args) {
	MyData<Integer> o1=new MyData<>();
	o1.setVal(100);
	
	MyData<String> o2= new MyData<>();
	o2.setVal("Blr");
	int x=o1.getVal();//Casting not req
	String s=o2.getVal();
	System.out.println(x);
	System.out.println(s);
}
void f1(MyData<String> d) {
	
}/*
	 * void f1(MyData<Integer> d) {
	 * 
	 * }
	 */
}

class MyData<E>{
	private E val;

	public E getVal() {
		return val;
	}

	public void setVal(E val) {
		this.val = val;
	}
	
	
}
