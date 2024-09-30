package com.geek.repository;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.geek.entity.Address;
import com.geek.entity.Emp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component

public class EmpDao {
	@PersistenceContext
private EntityManager em;
	@Transactional
	public void addEmp(Emp e) {
		em.persist(e); //saving in the DB
		e.setEmpName("Bala Ram");
		System.out.println("ADDED EMP");
	}
	public void updateEmp(String newName,int id) {
     Emp e=em.find(Emp.class, id);
     e.setEmpName(newName);
     System.out.println("updated ....");
	}
	@Transactional
	public void getEmp(int id) {
	     Emp e=em.find(Emp.class, id);
	     System.out.println(e.getEmpName());
	     //proxy object
	     List<Address> address=e.getAddress();
	     System.out.println("-----------");
	     for(Address a:address) {
	    	 System.out.println(a.getPlaceName());
	     }
		}
}
