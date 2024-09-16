package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.bean.repo.AccountRepository;
import com.bean.repo.SavingsAccRepImpl;
import com.bean.service.AccountService;
import com.bean.service.AccountServiceImpl;
@Configuration//replace xml
@ComponentScan(basePackages = "com.bean")
@ImportResource("beans.xml")
public class JavaConfig {
//in xml <bean>
	@Bean("myservice")
	public AccountService getAccService() {
		return new AccountServiceImpl();
	}
}
