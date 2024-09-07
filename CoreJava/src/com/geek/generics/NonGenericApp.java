package com.geek.generics;

public class NonGenericApp {
public static void main(String[] args) {
	Data data1=new Data();
	data1.setVal(100);
	Data data2=new Data();
	data2.setVal("Bangalore");
	int x=(Integer)data1.getVal();
	//while retriving ll get class cast exception
	String s=(String)data1.getVal();
	System.out.println(x);
	System.out.println(s);
}
}
//boz to store all kind of object
class Data{
	private Object val;
	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}
	
	
	
}