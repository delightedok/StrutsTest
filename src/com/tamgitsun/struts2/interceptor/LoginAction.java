package com.tamgitsun.struts2.interceptor;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.tamgitsun.struts2.object.User;

public class LoginAction extends ActionSupport implements SessionAware{
	
	private User user;
	private Map session;
	public void setUser(User user){
		this.user=user;
	}
	public void setSession(Map session){
		this.session=session;
	}
	public User getUser(){
		return user;
	}
	public Map getSession(){
		return session;
	}
	
	public String execute() throws Exception{
		if("tamgitsun".equals(user.getUsername())&&"123456".equals(user.getPassword())){
			session.put("user", user);
			return SUCCESS;
		}else{
			addActionError("login failed");
			return INPUT;
		}
	}
	
	public String input() throws Exception{
		return INPUT;
	}

}
