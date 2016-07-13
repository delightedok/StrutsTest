package com.tamgitsun.struts2.interceptor.filter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.tamgitsun.struts2.interceptor.listener.MyListener;

public class Timer extends AbstractInterceptor{

	private String year;
	private String month;
	private String day;
	
	public void setYear(String year){
		this.year=year;
	}
	public void setMonth(String month){
		this.month=month;
	}
	public void setDay(String day){
		this.day=day;
	}
	public String getYear(){
		return year;
	}
	public String getMonth(){
		return month;
	}
	public String getDay(){
		return day;
	}
	
	public String intercept(ActionInvocation invocation) throws Exception{
		invocation.addPreResultListener(new MyListener());
		long startTime=System.currentTimeMillis();
		String result=invocation.invoke();
		long endTime=System.currentTimeMillis();
		long executeTime=endTime-startTime;
		System.out.println("the times action cost is "+executeTime);
		System.out.println("default time is "+year+"-"+month+"-"+day);
		return result;
	}
	
}
