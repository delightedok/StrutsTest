package com.tamgitsun.struts2.typeconvert;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{
	
	private User user;
	private String tip;
	
	public void setUser(User user){
		this.user=user;
	}
	public void setTip(String tip){
		this.tip=tip;
	}
	
	public User getUser(){
		return user;
	}
	public String getTip(){
		return tip;
	}
	
	public String execute() throws Exception{
		System.out.println("username:"+user.getName());
		System.out.println("password:"+user.getPass());
		return "success";
	}

}
