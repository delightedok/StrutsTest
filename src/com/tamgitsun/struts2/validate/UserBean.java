package com.tamgitsun.struts2.validate;

import java.util.Date;

public class UserBean {

	private String username;
	private String password;
	private int age;
	private Date birthday;
	
	public UserBean(){}
	public UserBean(String username,String password,int age,Date birthday){
		this.username=username;
		this.password=password;
		this.age=age;
		this.birthday=birthday;
	}
	
	public void setUsername(String username){
		this.username=username;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}
	
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	public int getAge(){
		return age;
	}
	public Date getBirthday(){
		return birthday;
	}
	
}
