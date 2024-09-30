package com.geek;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.geek.entity.Address;
import com.geek.entity.Customer;
import com.geek.entity.Emp;
import com.geek.repository.CustomerDao;
import com.geek.repository.CustomerDaoImpl;
import com.geek.repository.EmpDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		
	CustomerDao cdao=ctx.getBean(CustomerDaoImpl.class);
//		Customer c1=new Customer();
//		c1.setCustId(101);
//		c1.setCustName("Raj");
//		c1.setEmail("raj@abc.com");
//		Address add=new Address("Bangalore",566434);
//		c1.setAddress(add);
//		cdao.addNewCustomer(c1);
	//Customer c=cdao.searchById(101);
	//cdao.updataCustEmail("raj@abc.com",101);
	//cdao.search(101);
//		System.out.println(c.getCustName()+"\t"+c.getEmail());
//		 List<Customer> clist= cdao.allCustomers();
//		 clist.forEach(c->System.out.println(c.getCustName()));
		EmpDao edao=ctx.getBean(EmpDao.class);
//		Emp e=new Emp();//new state
//		e.setEmpId(102);
//		e.setEmpName("Balu");
//		Address a1=new Address("HSR", 45666);
//		Address a2=new Address("Koramangala", 555);
//		
//		e.setAddress(Arrays.asList(a1,a2));
//		edao.addEmp(e);
//		e.setEmpName("XXX");//Detached
		//edao.updateEmp("A1", 101);
		edao.getEmp(101);
	}
}
