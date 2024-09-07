package com.geek;
public class CasingDemo {
public static void main(String[] args) {
	notifiation(new Email()); 
	notifiation(new WhatsApp());  new Message();
}
static void notifiation(Message m) {
	m.info(); //polymorphism , dynamic dispatch ...
}
}
 class Message{
	void info() {
		System.out.println("u hv a MESSAGE");
	}
}
class Email extends Message{
void info() {
		System.out.println("u hv a Email");
	}
}
class WhatsApp extends Message{
void info() {
		System.out.println("u hv a WhatsApp msg");
	}
}