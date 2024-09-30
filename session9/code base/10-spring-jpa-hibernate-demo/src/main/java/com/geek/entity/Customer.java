package com.geek.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//mandatory
@Table(name="custInfo")
@DynamicUpdate
@DynamicInsert//creates insert query exect null cols
//Entity object
public class Customer {
	@Id//mandatory
 private int custId;
	@Column(name="cname",length = 20)
 private String custName;
	@Column(length = 30,unique = true)
 private String email;
	@Embedded //value object
 private Address address;
 
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
 
 
}
