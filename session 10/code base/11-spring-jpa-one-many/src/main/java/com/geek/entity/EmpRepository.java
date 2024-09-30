package com.geek.entity;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
@Transactional
public class EmpRepository {
	@PersistenceContext
private EntityManager em;
	public void addDepartment(Department d) {
		em.persist(d);
		System.out.println("Dept added");
	}
	public void addNewEmp(Employee e,int deptId ) {
		Department d=em.find(Department.class, deptId);
		if(d!=null) {
			e.setDept(d);
			em.persist(e);
			System.out.println("Emp added");
		}
		else {
			System.out.println("dept not found");
		}
	}
}
