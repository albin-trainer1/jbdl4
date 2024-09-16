package com.bean.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.bean.repo.AccountRepository;
public class AccountServiceImpl implements AccountService {
	private AccountRepository rep;
	@Autowired
	@Qualifier("savings")
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
