package com.bean.service;

import com.bean.repo.AccountRepository;

public class AccountServiceImpl implements AccountService {
	private AccountRepository rep;
	public void setRep1(AccountRepository rep) {
		System.out.println("setter....");
		this.rep = rep;
	}
	public AccountServiceImpl() {
		System.out.println("Acc Service Constructor");
	}
	@Override
	public String creditService(float amt) {
		return rep.credit(amt);
	}

}
