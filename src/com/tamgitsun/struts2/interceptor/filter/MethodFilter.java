package com.tamgitsun.struts2.interceptor.filter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodFilter extends MethodFilterInterceptor{
	
	public String doIntercept(ActionInvocation invocation) throws Exception{
		String result=invocation.invoke();
		return result;
	}
	public void setExcludeMethods(String excludeMethods){//设置过滤方法的白名单
		
	}
	public void setIncludeMethods(String includeMethods){//设置过滤方法的黑名单
		
	}

}
