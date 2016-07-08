package com.tamgitsun.struts2.typeconvert;

import java.util.Map;

import ognl.DefaultTypeConverter;

public class UserConverter extends DefaultTypeConverter{
	
	public Object convertValue(Map context,Object value,Class toType){
		System.out.println("in UserConverter");
		if(toType==User.class){
			String[] params=(String[])value;
			for(String x:params){
				System.out.println(x);
			}
			User user=new User();
			String[] uservalues=params[0].split("-");
			user.setName(uservalues[0]);
			user.setPass(uservalues[1]);
			return user;
		}else if(toType==String.class){
			User user=(User)value;
			return "<"+user.getName()+","+user.getPass()+">";
		}
		return null;
	}

}
