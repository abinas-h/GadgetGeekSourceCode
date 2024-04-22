<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../signup" method="post">
	<input type="text" name="firstName" placeholder="Enter First Name">
	<input type="text" name="lastName" placeholder="Enter Last Name">
	<input type="text" name="userName" placeholder="Enter Username">
	<input type="date" name="dob">
	<input type="email" name="email" placeholder="Enter Email">
	<input type="text" name="gender" placeholder="Enter gender">
	<input type="text" name="phoneNumber" placeholder="Enter Phone number">
	<input type="password" name="password" placeholder="Enter Password">
	<input type="password" name="confirmPassword" placeholder="Confirm Password">
	<input type="submit" value="Sign In">
	</form>
	

</body>
</html>