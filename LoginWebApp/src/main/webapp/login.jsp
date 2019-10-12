<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	${logonerror}
	<form action="login" method="get">
		<input type="text"  name="username" placeholder="enter username">
		<input type="text" name="password" placeholder="enter password">
		<button type="submit">Login</button>
	</form>
</body>
</html>