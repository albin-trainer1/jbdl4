package com.geek2;

import com.geek3.App3;

public class App2 {
public void helloApp2() {
	System.out.println("I m coming from App2");
App3 app3=new App3();
System.out.println(app3.hello3());
}

public static void main(String[] args) {
new App2().helloApp2();
}
}
