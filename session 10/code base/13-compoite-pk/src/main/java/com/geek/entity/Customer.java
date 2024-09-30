package com.geek.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//mandatory
@Table(name="cust1")
public class Customer {
	@EmbeddedId
	private CustomerId custId;
	@Column(name="cname",length = 20)
 private String custName;
	@Column(length = 30,unique = true)
 private String email;
	
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
