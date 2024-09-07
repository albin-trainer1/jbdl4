package com.geek.lambda;
public class Ex1 {
public static void main(String[] args) {
	Calculator c= new CalImpl();
	System.out.println(c.add(10, 20));
	
	Calculator c1= (float x, float y) ->{
		return x+y;
	};
	System.out.println(c1.add(8, 7));
	
	Calculator c2=(a, b)-> a+b;
	System.out.println(c2.add(6, 6));
	
}
}

class CalImpl implements Calculator{
	@Override
	public float add(float x, float y) {
		return x+y;
	}
}
