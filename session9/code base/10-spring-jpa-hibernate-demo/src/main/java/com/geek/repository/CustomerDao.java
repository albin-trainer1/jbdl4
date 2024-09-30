package com.geek.repository;

import java.util.List;

import com.geek.entity.Customer;

public interface CustomerDao {
void addNewCustomer(Customer c);
Customer searchById(int cid);
Customer search(int cid);
List<Customer> allCustomers();
List<Customer> searchByName(String name);
void updataCustEmail(String newEmail,int cid);

}
