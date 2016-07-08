<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Input Validate Page</title>
<script type="text/javascript">
function validate(form){
	var errStr="";
	var username=trim(form.username.value);
	var password=trim(form.password.value);
	var age=trim(form.age.value);
	var birthday=trim(form.birthday.value);
	if(username==""||username==null){
		errStr+="\nyour username must be signed in";
	}else if(!/^\w{4,25}$/.test(username)){
		errStr+="\nyour username must be letter or number,and the length should be longer than 4 and shorter than 25";
	}
	if(password==""||password==null){
		errStr+="\nyour password must be signed in";
	}else if(!/^\w{4,25}$/.test(password)){
		errStr+="\nyour password must be letter or number,and the length should be longer than 4 and shorter than 25";
	}
	if(age==""||age==null){
		errStr+="\nyour age must be signed in";
	}else if(!/^[0-1]?[0-9]?[0-9]$/.test(age)){
		errStr+="\nyour age must be a Integer number,and it should be a valuable number";
	}
	if(birthday==""||birthday==null){
		errStr+="\nyour birthday must be signed in";
	}else if(!/^19\d\d\-[0-1]?\d\-[0-3]?\d$/.test(birthday)&&!/^20[0-1]\d\-[0-1]\d\-[0-3]\d$/.test(birthday)){
		errStr+="\nthe format of your birthday is invalidate,which should be YYYY-MM-DD";
	}
	if(errStr==""){
		return true;
	}else{
		alert(errStr);
		return false;
	}
}
function trim(s){
	return s.replace("/^\s*","").replace("/\s*$/","");
}
</script>
</head>
<body>
<form onsubmit="return validate(this);" action="input" method="post">
	username:<input type="text" name="username" />
	pass&nbsp;word:<input type="password" name="password" />
	age:<input type="text" name="age" />
	birthday:<input type="text" name="birthday" />
	<input type="submit" value="sign up" />
</form>
</body>
</html>