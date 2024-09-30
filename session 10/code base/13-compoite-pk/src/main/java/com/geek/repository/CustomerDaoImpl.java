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
	
}
