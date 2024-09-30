package com.geek.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class CustomerId {
private long phoneNo;
private String email;
//@ManyOne
//private Order order;

public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
