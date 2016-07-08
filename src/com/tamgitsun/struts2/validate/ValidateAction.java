package com.tamgitsun.struts2.validate;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport{
	
	private String errTip;
	public void setErrTip(String errTip){
		this.errTip=errTip;
	}
	public String getErrTip(){
		return errTip;
	}
	
	public String execute() throws Exception{
		
		HttpServletRequest request=ServletActionContext.getRequest();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String age=request.getParameter("age");
		String birthday=request.getParameter("birthday");
		
		String errStr="";
		if(username.trim().equals("")||username==null){
			errStr+="\nyour username can't be blank";
		}else if(!Pattern.matches("\\w{4,25}", username.trim())){
			errStr+="\nyour username should be number or letter,and it should be longer than 4 and shorter than 25";
		}
		if(password.trim().equals("")||password==null){
			errStr+="\nyour password can't be blank";
		}else if(!Pattern.matches("\\w{4,25}", password.trim())){
			errStr+="\nyour password should be number or letter,and it should be longer than 4 and shorter than 25";
		}
		int agei=0;
		if(age.trim().equals("")||age==null){
			errStr+="\nyour age can't be blank";
		}else{
			try{
				agei=Integer.parseInt(age);
				if(agei>150&&agei<=0){
					errStr+="\nyour age is invalidate";
				}
			}catch(Exception e){
				errStr+="\nyour age should be a Integer";
			}
		}
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		Date birth=null;
		if(birthday.trim().equals("")||birthday==null){
			errStr+="\nyour birthday can't be blank";
		}else{
			try{
				birth=(Date)sdf.parse(birthday);
				if(birth.after(sdf.parse("2050-02-21"))||birth.before(sdf.parse("1900-01-01"))){
					errStr="\nyour birthday is invalidate";
				}
			}catch(Exception e){
				errStr+="\nthe format of your birthday should be YYYY-MM-DD";
			}
		}
		
		if(errStr==""){
			setErrTip("");
			UserBean user=new UserBean(username,password,agei,birth);
			return SUCCESS;
		}else{
			setErrTip(errStr);
			System.out.println(errStr);
			return ERROR;
		}
		
	}

}
