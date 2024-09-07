package com.geek.generics;

public class WildCardGenerics {
public static void main(String[] args) {
	//lower bound
accept1(new Department<ContractEmp>());

//upper bound Employee and its base class
accept2(new Department<Object>());

}
//wild card
static void accept(Department<?> e) {
	
}
static void accept1(Department<? extends Employee> e) {
	
}

static void accept2(Department<? super Employee> e) {
	
}
}

class Department<E>{
	private E emps;
	
}

class Employee{
	
}

class PerEmp extends Employee{
	
}
class ContractEmp extends Employee{
	
}