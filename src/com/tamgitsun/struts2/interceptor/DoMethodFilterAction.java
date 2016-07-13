package com.tamgitsun.struts2.interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class DoMethodFilterAction extends ActionSupport{
	
	public String execute() throws Exception{
		return SUCCESS;
	}
	public String input() throws Exception{
		return "input";
	}
	public String cancel() throws Exception{
		return "cancel";
	}
	public String back() throws Exception{
		return "back";
	}

}
