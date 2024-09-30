package com.geek.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Entity
public class Emp {
	@Id
private int empId;
private String empName;

@CreationTimestamp
private LocalDateTime dateOfCreation;
@UpdateTimestamp
private LocalDateTime lastUpdate;

@ElementCollection
@JoinTable(name = "EMPLOYEE_ADDRESS",joinColumns = @JoinColumn(name="EMPID"))
private List<Address> address;

public LocalDateTime getDateOfCreation() {
	return dateOfCreation;
}

public void setDateOfCreation(LocalDateTime dateOfCreation) {
	this.dateOfCreation = dateOfCreation;
}

public LocalDateTime getLastUpdate() {
	return lastUpdate;
}

public void setLastUpdate(LocalDateTime lastUpdate) {
	this.lastUpdate = lastUpdate;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public List<Address> getAddress() {
	return address;
}

public void setAddress(List<Address> address) {
	this.address = address;
}


}
