<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
request.setCharacterEncoding("UTF-8");
String contextPath=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/js/prototype.js" type="text/javascript"></script>
<script type="text/javascript">
function gotClick(){
	//请求的地址
	var url="JSONExample.action";
	//将form1表单域的值转换为请求参数
	var params=Form.serialize('form1');
	//创建Ajax.Request对象,对应于发送请求
	var myAjax=new Ajax.Request(
		url,
		{
		method:'post',//请求方式：post
		parameters:params,//请求参数
		onComplete:processResponse,//指定回掉函数
		asynchronous:true//是否异步发送请求
	});
}
function processResponse(request){
	var res=request.responseText.evalJSON();
	alert(res);
	for(var propName in res){
		$("show").innerHTML+=propName+"-->"+res[propName]+"<br>";
	}
}
</script>
</head>
<body>

<s:form id="form1">
	<s:textfield name="field1" label="Field 1"></s:textfield>
	<s:textfield name="field2" label="Field 2"></s:textfield>
	<s:textfield name="field3" label="Field 3"></s:textfield>
	<tr><td colspan="2"><input type="button" value="submit" onclick="gotClick();"></td></tr>
</s:form>
<div id="show"></div>
</body>
</html>