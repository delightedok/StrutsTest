<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>

<s:fielderror></s:fielderror>

<form method="post" action="Validate2">
	username:<input type="text" name="username" />
	pass&nbsp;word:<input type="password" name="password" />
	age:<input type="text" name="age" />
	birthday:<input type="text" name="birthday" />
	<input type="submit" value="sign up" />
</form>


</body>
</html>