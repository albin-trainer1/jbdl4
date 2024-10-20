package com.geek.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.geek.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
@Component
public class UserDaoImpl implements UserDao {
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private PasswordEncoder pwdEncoder;
	@Transactional
	public User registerNewUser(User user) {
		String encodedPwd=pwdEncoder.encode(user.getPassword());
		user.setPassword(encodedPwd);
		 em.persist(user);
		 return user;
	}
	
	public User searchByUserName(String userName) {
	Query q=em.createQuery("select user from User user where user.userName= :n");
	q.setParameter("n", userName);
		List<User>  users=q.getResultList();
		if(users.size()>0)
		return  users.get(0);
		else return null;
	}
}
