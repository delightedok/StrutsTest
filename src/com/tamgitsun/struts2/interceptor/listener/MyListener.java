package com.tamgitsun.struts2.interceptor.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class MyListener implements PreResultListener{
	
	public void beforeResult(ActionInvocation invocation,String resultCode){
		System.out.println(resultCode);
	}

}
