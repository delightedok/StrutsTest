package com.tamgitsun.struts2.typeconvert;

public class User {
	
	private String name;
	private String pass;
	
	public void setName(String name){
		this.name=name;
	}
	public void setPass(String pass){
		this.pass=pass;
	}
	
	public String getName(){
		return name;
	}
	public String getPass(){
		return pass;
	}

}
