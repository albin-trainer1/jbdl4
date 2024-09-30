package com.geek.entity;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Department {
	@Id
private int deptId;
private String deptName;
@OneToMany(mappedBy = "dept",fetch = FetchType.EAGER)
private List<Employee> employees;

public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}


}
