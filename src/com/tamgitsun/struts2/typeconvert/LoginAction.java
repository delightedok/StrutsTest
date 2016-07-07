package com.tamgitsun.struts2.typeconvert;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{
	
	private User user;
	private String tip;
	private Map<String,User> users;
	private List<User> usersl;
	
	public void setUser(User user){
		this.user=user;
	}
	public void setTip(String tip){
		this.tip=tip;
	}
	public void setUsers(Map<String,User> users){
		this.users=users;
	}
	public void setUsersl(List<User> usersl){
		this.usersl=usersl;
	}
	
	public User getUser(){
		return user;
	}
	public String getTip(){
		return tip;
	}
	public Map<String,User> getUsers(){
		return users;
	}
	public List<User> getUsersl(){
		return usersl;
	}
	
	public String execute() throws Exception{
		return "success";
	}
	
	public String login() throws Exception{
		System.out.println("username:"+user.getName());
		System.out.println("password:"+user.getPass());
		return "success";
	}
	
	public String login_map() throws Exception{
		System.out.println(getUsers());
		if(getUsers().get("one").getName().equals("tamgitsun")&&getUsers().get("one").getPass().equals("123456")){
			setTip("登录成功");
			return "success";
		}else{
			setTip("登录失败");
			return "error";
		}
	}
	
	public String login_list() throws Exception{
		System.out.println(getUsersl());
		User u=getUsersl().get(0);
		if(u.getName().equals("tamgitsun")&&u.getPass().equals("123456")){
			setTip("登录成功");
			return "success";
		}else{
			setTip("登录失败");
			return "error";
		}
	}
	
}
