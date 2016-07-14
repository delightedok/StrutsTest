<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%
request.setCharacterEncoding("UTF-8");
String contextPath=request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Index Page</title>
<script src="js/prototype.js" type="text/javascript"></script>
<script type="text/javascript">
function guess(){
	$("guessNum").request({
		//指定回掉函数
		onComplete:function(request){
			var show=$('show');
			if(request.responseText.startsWith(true)){
				show.innerHTML="you are right";
			}else{
				show.innerHTML="sorry,you are wrong";
				show.innerHTML+="<br>server number is: "+request.responseText.split("$")[1];
			}
		}
	});
}
</script>
</head>
<body>

<form id="guessNum" action="<%=contextPath %>/StrutsTest/guess.action" method="post">
	<table align="center">
		<caption>
			please guess a number between 0 and 7: 
		</caption>
		<tr>
			<td>your number:<input type="text" name="num" value="0" /><br>
			simple chinese param:<input type="text" name="name" /></td>
		</tr>
		<tr align="center">
			<td><input type="button" value="guess" onclick="guess();"/></td>
		</tr>
	</table>
</form>
<div id="show"></div>
</body>
</html>