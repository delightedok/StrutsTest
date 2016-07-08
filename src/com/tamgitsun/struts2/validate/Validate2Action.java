package com.tamgitsun.struts2.validate;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class Validate2Action extends ActionSupport{
	
	private String username;
	private String password;
	private int age;
	private Date birthday;
	
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
	
	public String execute() throws Exception{
		return SUCCESS;
	}
/*
	public void validate(){//手动完成输入校验
		addFieldError("user","your username must....");//设置FieldError属性的值,可传递到最终的视图中显示
	}
	
	public void validateXxx(){//struts.xml中需加入<action name="***" class="org.crazyit.app.action.RegistAction" method="xxx">

		addFieldError("user","your username must....");
	}
	*/
	
}
