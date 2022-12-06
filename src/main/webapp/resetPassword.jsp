<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" type="image/x-icon" href="images/favicon.ico" sizes="32x32">
<title>Insert title here</title>
<style>
body {
	background: #f6f5f7;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	font-family: 'Montserrat', sans-serif;
	height: 100vh;
	margin: -20px 0 50px;
}

p {
	margin: 25 px 0 50px;
	text-align: center;
}

input {
	background-color: #eee;
	border: none;
	padding: 12px 10px;
	margin: 8px 0;
	width: 90%;
}

form {
	text-align: center;
}

#buttonReset {
	background: linear-gradient(to right, #FF4B2B, #FF416C) !important;
	color: white !important;
	box-shadow: none !important;
	border-radius: 20px;
	border: 2px solid #FFFFFF;
	background: white;
	color: #FFFFFF;
	font-size: 12px;
	font-weight: bold;
	padding: 12px 45px;
	letter-spacing: 1px;
	text-transform: uppercase;
	transition: transform 80ms ease-in;
	width: 90%;
	margin-top: 20px;
}

#buttonReset:active {
	transform: scale(0.95);
}

#buttonReset:focus {
	outline: none;
}

#buttonReset.ghost {
	background-color: transparent;
	border-color: #FFFFFF;
}

#form-container.sign-in-container {
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>
	<div class="form-container sign-in-container">
		<form action="ResetPasswordServlet" method="post">
			<img src="https://cdn-icons-png.flaticon.com/512/4516/4516580.png"
				width="230" height="230">
			<h1>Password reset</h1>
			<p>An email token has been sent! Check your email!</p>
			<input type="text" name="token" placeholder="Token" size="5" /> <input
				type="password" name="newPassword" placeholder="New Password"
				size="5" />
			<button class="ghost" id="buttonReset" type="submit">
				<a>Change Password</a>
			</button>
		</form>
</body>
</html>