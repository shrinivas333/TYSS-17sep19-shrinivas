<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page session="false" %>
<!DOCTYPE html>
<html>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%

String id="";
Cookie[] cookies=request.getCookies();
if(cookies!=null) {
	for (Cookie cookie : cookies) {
		if(cookie.getName().equals("alwaysRember")) {
			id=cookie.getValue();
		}
	}
}

%>
<body>

	<h4><%=msg%></h4>
<fieldset align='center'>
<legend align='center'>Login</legend>
	<form action='./login' method='post' '>
		<table align='center' >
		<tr>
			<td>id:</td>
			<td><input type='number' name='id' value="<%=id%>"></td>
		</tr>
		<tr>
			<td>password:</td>
			<td><input type='password' name='password'></td>
		</tr>
		<tr>
			<td>Rember me:</td>
			<td><input type='checkbox' name='remberme' value='check'></td>
			</tr>
		<tr>
			<td><input type='submit' value='Login'></td>
			<td><input type='reset' value='Reset'></td>
		</tr>
		<tr>
			<td></td>
			<td><a href='register.html'>Register</a></td>
		</tr>
		</table>
		</form>
</fieldset>
		
		
</body>
</html>