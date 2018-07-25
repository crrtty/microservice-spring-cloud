package com.ly.cloud.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String username;
	private String name;
	private int age;
	private BigDecimal balance;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public User() {
		super();
	}
	
	public User(Long id, String username, String name) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
	}
	public User(Long id, String username, String name, int age, BigDecimal balance) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", age=" + age + ", balance=" + balance
				+ "]";
	}
}
