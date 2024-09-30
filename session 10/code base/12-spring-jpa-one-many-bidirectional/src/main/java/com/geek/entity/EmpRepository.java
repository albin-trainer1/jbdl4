package com.geek.entity;

import java.util.List;

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
	public Department getDept(int id) {
		Department d=em.find(Department.class, id);
		System.out.println(d.getDeptName());
		System.out.println("---------");
		//returns proxy
		//List<Employee> emps=d.getEmployees();
	//	System.out.println("*****");
		//emps.forEach(e->System.out.println(e.getEmpName()));
		return d;
	}
}
