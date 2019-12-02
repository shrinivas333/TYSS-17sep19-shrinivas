<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
<a href="./logout" style="float: right;">Logout</a>
<br>
<fieldset>
<legend align="center">Change Password</legend>

	<form action="./changepassword" method="post">
	<table align="center">
<		<tr>
			<td>Enter a password</td>
			<td><input type="password" name="password"></td>
		</tr>	
	
		<tr>
			<td>Confirm password</td>
			<td><input type="password" name="confirmpassword"></td>
		</tr>	
		
			<tr>
					
					<td><input type = "reset" value = "Reset"></td>
					<td><input type = "submit" value = "Changepassword"></td>
			</tr>
	</table>
	
	
	</form>

</fieldset>

</body>
</html>