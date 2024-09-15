package com.geek.bean;
//Spring container shud make this obj
public class GreetingBeanImpl implements GreetingBean {
	private String msg;
	public GreetingBeanImpl(String msg) {
		System.out.println("constructor....");
		this.msg=msg;
	}
	//setter shud called by the Spring container....
	/*
	 * public void setMsg(String msg) { this.msg=msg;
	 * System.out.println("setter...."); }
	 */
	public String wish(String name) {
		return "Hello "+name+" "+msg;
	}
}
