<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">


		<!--this is a part where input for the login is contained  -->
		<div class="formDiv">
			<h1>Sign In</h1>

			<form action="../LoginServlet" method="post">
				<input type="text" name="userName" placeholder="Enter Username">
				<input type="password" name="password" placeholder="Enter Password">
				<input type="submit" class="loginButton" value="Login">
			</form>

			<small>Do not have an account? <a href="signup.jsp">Create
					One</a>
			</small>
		</div>

		<!--this is a part where image for the login is contained  -->
		<div class="imgdiv">
			<img src="../img/cssImg/Picture1.png" class="img-fluid"
				alt="Responsive image">
		</div>

	</div>

</body>
</html>