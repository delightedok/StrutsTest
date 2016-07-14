package com.tamgitsun.struts2.ajax;

import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;

import org.apache.commons.io.input.ReaderInputStream;

import com.opensymphony.xwork2.ActionSupport;

public class GuessNumberAction extends ActionSupport{
	
	private int num;
	private String name;
	
	public void setNum(int num){
		this.num=num;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getNum(){
		return num;
	}
	public String getName(){
		return name;
	}
	
	private InputStream inputStream;/*
	public void setInputStream(InputStream inputStream){
		this.inputStream=inputStream;
	}*/
	public InputStream getInputStream(){
		return inputStream;
	}
	
	public String execute() throws Exception{
		System.out.println("--"+getName());
		long result=Math.round(Math.random()/7);
		if(result==num){
			//inputStream=new StringBufferInputStream("true$"+result);
			inputStream=new ReaderInputStream(new StringReader("true$"+result));
		}else{
			//inputStream=new StringBufferInputStream("false$"+result);
			inputStream=new ReaderInputStream(new StringReader("false$"+result));
		}
		return SUCCESS;
	}

}
