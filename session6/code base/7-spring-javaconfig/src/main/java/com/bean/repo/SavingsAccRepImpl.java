package com.bean.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("savings")
public class SavingsAccRepImpl implements AccountRepository {
	public SavingsAccRepImpl() {
		System.out.println("savings acc rep constructor");
	}
	public String credit(float amt) {
		return "Hi, the amt of "+amt +" credited in ur savings Acc";
	}

}
