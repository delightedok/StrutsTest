package com.tamgitsun.struts2.ajax;

import java.util.HashMap;
import java.util.Map;

//import com.googlecode.jsonplugin.annotations.JSON;
import org.apache.struts2.json.annotations.JSON;
import com.opensymphony.xwork2.Action;

public class JSONExample {

	//模拟处理结果的属性
	private int[] ints={10,20};
	private Map<String,String> map=new HashMap<String,String>();
	private String customName="customer";
	
	//封装请求参数的三个属性
	private String field1;
	private transient String field2;//transient修饰的属性不会被序列化
	//没有setter和getter方法的属性不会被序列化
	private String field3;
	
	public String execute(){
		map.put("name", "tamgitsun");
		System.out.println("hello");
		return Action.SUCCESS;
	}
	
	//使用注释语法来改变该属性序列化后的属性名
	@JSON(name="newName")
	public Map<String,String> getMap(){
		return map;
	}
	@JSON(name="newInts")
	public int[] getInts(){
		return ints;
	}
	@JSON(name="newCustomName")
	public String getCustomName(){
		return customName;
	}
	@JSON(name="newField1")
	public String getField1(){
		return field1;
	}
	@JSON(name="newField2")
	public String getField2(){
		return field2;
	}
	@JSON(name="newField3")
	public String getField3(){
		return field3;
	}
	public void setField1(String field1){
		this.field1=field1;
	}
	public void setField2(String field2){
		this.field2=field2;
	}
	public void setField3(String field3){
		this.field3=field3;
	}
	
}
