package com.bean.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCardAccRepImpl implements AccountRepository{
public CreditCardAccRepImpl() {
	System.out.println("credit card constructor");
}
	@Override
	public String credit(float amt) {
		// TODO Auto-generated method stub
		return "amt of "+amt+" credtied in CREDIT CARD...";
	}

}
