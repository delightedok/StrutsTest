package com.tamgitsun.struts2.typeconvert;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{
	
	private User user;
	private String tip;
	private Map users;
	private List usersl;
	private User userc;//调用UserConverter
	private Set userss;
	
	public void setUser(User user){
		this.user=user;
	}
	public void setTip(String tip){
		this.tip=tip;
	}
	public void setUsers(Map users){
		this.users=users;
	}
	public void setUsersl(List usersl){
		this.usersl=usersl;
	}
	public void setUserc(User userc){
		this.userc=userc;
	}
	public void setUserss(Set userss){
		this.userss=userss;
	}
	
	public User getUser(){
		return user;
	}
	public String getTip(){
		return tip;
	}
	public Map getUsers(){
		return users;
	}
	public List getUsersl(){
		return usersl;
	}
	public User getUserc(){
		return userc;
	}
	public Set getUserss(){
		return userss;
	}
	
	public String execute() throws Exception{
		return "success";
	}
	
	public String login() throws Exception{
		if(getUser().getName().equals("tamgitsun")&&getUser().getPass().equals("123456")){
			setTip("登录成功");
			return "success";
		}else{
			setTip("登录失败");
			return "error";
		}
	}
	
	public String login_map() throws Exception{
		System.out.println(getUsers());
		User u=(User)getUsers().get("one");
		if(u.getName().equals("tamgitsun")&&u.getPass().equals("123456")){
			setTip("登录成功");
			return "success";
		}else{
			setTip("登录失败");
			return "error";
		}
	}
	
	public String login_list() throws Exception{
		System.out.println(getUsersl());
		User u=(User)getUsersl().get(0);
		if(u.getName().equals("tamgitsun")&&u.getPass().equals("123456")){
			setTip("登录成功");
			return "success";
		}else{
			setTip("登录失败");
			return "error";
		}
	}
	
	public String login_converter() throws Exception{
		if(getUserc().getName().equals("tamgitsun")&&getUserc().getPass().equals("123456")){
			setTip("登录成功");
			return "success";
		}else{
			setTip("登录失败");
			return "error";
		}
	}
	
	public String login_set() throws Exception{
		return "success";
	}
	
}
