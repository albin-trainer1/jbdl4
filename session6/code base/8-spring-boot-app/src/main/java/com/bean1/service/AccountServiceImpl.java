package com.bean1.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean1.repo.AccountRepository;
@Component("myservice") //replacing <bean> in xml
public class AccountServiceImpl implements AccountService {
	//@Autowired //can apply in fields, setters & constructors 
	private AccountRepository rep;
	@Autowired
	public void setRep(AccountRepository rep) {
		this.rep = rep;
		System.out.println("setter");
	}
	public AccountServiceImpl() {
		System.out.println("Acc Service Constructor");
	}
	@Override
	public String creditService(float amt) {
		return rep.credit(amt);
	}

}
