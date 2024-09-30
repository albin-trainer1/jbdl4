package com.geek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.geek.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceUnit;
import jakarta.persistence.Query;
@Component
@Transactional
public class CustomerDaoImpl implements CustomerDao{
  // @PersistenceUnit(name="default")
	//private EntityManagerFactory emf;
	@PersistenceContext
	private EntityManager em;
	//@Transactional
	public void addNewCustomer(Customer c) {
		//start the transaction
	//	EntityManager em=emf.createEntityManager();
		em.persist(c);
		System.out.println("Customer added ...:)");
		//commit the transaction
	}
	//@Transactional
	public Customer searchById(int cid) {
		//EntityManager em1=emf.createEntityManager();
		Customer c=em.find(Customer.class, cid);
		System.out.println("------------");
		Customer c5=em.find(Customer.class, cid);
		return c;
	}
	public List<Customer> allCustomers() {
		String jpql="select c from Customer c";
		Query q=em.createQuery(jpql);
		List<Customer> clist=q.getResultList();
		return clist;
	}
	public List<Customer> searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Customer search(int cid) {
		// TODO Auto-generated method stub
		
		Customer c=em.find(Customer.class, cid);
		System.out.println(em.contains(c));
		Customer c2=em.find(Customer.class, cid);
		return null;
	}
	@Override
	
	public void updataCustEmail(String newEmail, int cid) {
		// TODO Auto-generated method stub
		Customer c=em.find(Customer.class, cid);
		c.setEmail(newEmail);
		System.out.println("updated...");
	}
}
