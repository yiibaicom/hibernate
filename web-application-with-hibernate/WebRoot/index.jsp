<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册表单</title>
</head>
<body>
	<form action="register.jsp" method="post">
		<h2>用户注册表单</h2>
		<hr/>
		Name:<input type="text" name="name" /><br>
		<br /> Password:<input type="password" name="password" /><br>
		<br /> Email:<input type="text" name="email" /><br>
		<br /> <input type="submit" value="注册" />
	</form>
</body>
</html>