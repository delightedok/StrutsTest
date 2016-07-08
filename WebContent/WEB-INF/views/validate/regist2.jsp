<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
<s:head/>
</head>
<body>

<s:form action="Validate2" validate="true">
	<s:textfield label="username" name="username"></s:textfield>
	<s:password label="password" name="password"></s:password>
	<s:textfield label="age" name="age"></s:textfield>
	<s:textfield label="birthday" name="birthday"></s:textfield>
	<s:submit></s:submit>
</s:form>

</body>
</html>