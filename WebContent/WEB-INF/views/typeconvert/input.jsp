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

<s:form action="typeconvert-login">
	<s:textfield name="user.name" label="username"></s:textfield>
	<s:textfield name="user.pass" label="password"></s:textfield>
	<tr>
		<td colspan="2"><s:submit value="convert" theme="simple"></s:submit></td>
		<s:reset value="reset" theme="simple"></s:reset>
	</tr>
</s:form>

</body>
</html>