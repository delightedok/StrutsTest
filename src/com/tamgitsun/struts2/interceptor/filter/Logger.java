package com.tamgitsun.struts2.interceptor.filter;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.tamgitsun.struts2.interceptor.DoLoginAction;

public class Logger implements Interceptor{

	public void init(){
		
	}
	
	public String intercept(ActionInvocation invocation) throws Exception{
		System.out.println("in Logger interceptor");
		DoLoginAction action=(DoLoginAction)invocation.getAction();
		System.out.println(action.getTarget());
		String result=invocation.invoke();
		System.out.println("out Logger interceptor");
		return result;
	}
	
	public void destroy(){
		
	}
	
}
