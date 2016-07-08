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

<s:form action="typeconvert-login_map">
	<s:textfield name="users['one'].name" label="the one username"></s:textfield>
	<s:textfield name="users['one'].pass" label="the one password"></s:textfield>
	<s:textfield name="users['two'].name" label="the two username"></s:textfield>
	<s:textfield name="users['two'].pass" label="the two password"></s:textfield>
	<tr>
		<td colspan="2"><s:submit value="convert" theme="simple"></s:submit></td>
		<s:reset value="reset" theme="simple"></s:reset>
	</tr>
</s:form>

<s:form action="typeconvert-login_list">
	<s:textfield name="usersl[0].name" label="the 0 username"></s:textfield>
	<s:textfield name="usersl[0].pass" label="the 0 password"></s:textfield>
	<s:textfield name="usersl[1].name" label="the 1 username"></s:textfield>
	<s:textfield name="usersl[1].pass" label="the 1 password"></s:textfield>
	<tr>
		<td colspan="2"><s:submit value="convert" theme="simple"></s:submit></td>
		<s:reset value="reset" theme="simple"></s:reset>
	</tr>
</s:form>

<s:form action="typeconvert-login_converter">
	<s:textfield name="userc" label="username-password"></s:textfield>
	<tr>
		<td colspan="2"><s:submit value="convert" theme="simple"></s:submit></td>
		<s:reset value="reset" theme="simple"></s:reset>
	</tr>
</s:form>

</body>
</html>