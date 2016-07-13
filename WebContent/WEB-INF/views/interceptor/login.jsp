<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Login Page</title>
</head>
<body>

<s:form action="login">
	<s:textfield name="username"></s:textfield>
	<s:password name="password"></s:password>
	<s:submit value="login"></s:submit>
</s:form>

<s:form action="login2">
	<s:actionerror/>
	<s:textfield name="user.username"></s:textfield>
	<s:password name="user.password"></s:password>
	<s:submit value="login"></s:submit>
</s:form>

</body>
</html>