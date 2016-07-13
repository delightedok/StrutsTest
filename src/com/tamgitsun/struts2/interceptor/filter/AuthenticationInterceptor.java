package com.tamgitsun.struts2.interceptor.filter;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthenticationInterceptor extends AbstractInterceptor{
	
	public String intercept(ActionInvocation invocation) throws Exception{
		Map session=ActionContext.getContext().getSession();
		Object user=session.get("user");
		if(user==null){
			ActionSupport action=(ActionSupport)invocation.getAction();
			action.addActionError("you havn't login");
			return Action.LOGIN;
		}else{
			return invocation.invoke();
		}
	}

}
