package com.geek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.geek.model.Product;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ProductRepositoryImpl implements ProductRepository {
	@Value("${db.url}")
private String url;
	@Value("${db.driver}")
	private String driverClass;
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	private Connection con;
	@PostConstruct
	public void init() {
		//load the driver
		//estabilish connection
		System.out.println("init ....");
		try {
			Class.forName(driverClass);
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connected with DB...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void testURL() {
		System.out.println(url);
	}
	@Override
	public void addNewProduct(Product p) {
		String sql="insert into product values(?,?,?)";
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, p.getProductId());
			pstmt.setString(2, p.getProductName());
			pstmt.setFloat(3, p.getPrice());
		int c=	pstmt.executeUpdate();
		con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@PreDestroy
	public void destroy() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
