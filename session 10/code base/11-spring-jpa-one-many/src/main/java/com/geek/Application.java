package com.geek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.geek.entity.Department;
import com.geek.entity.EmpRepository;
import com.geek.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
	EmpRepository repo=ctx.getBean(EmpRepository.class);
//	Department d=new Department();
//	d.setDeptId(9002);
//	d.setDeptName("Accounts");
//	repo.addDepartment(d);
	Employee e=new Employee();
//	e.setEmpId(103);
	e.setEmpName("RAJ");
	repo.addNewEmp(e, 9002);
	}

}
