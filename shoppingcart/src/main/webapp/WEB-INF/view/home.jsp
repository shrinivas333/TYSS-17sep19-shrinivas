<%@page import="com.tyss.shoppingcart.DTO.Product"%>
<%@page import="com.tyss.shoppingcart.DTO.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Retailer bean = (Retailer) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2> Welcome <%=bean.getName()%></h2>
	<fieldset>
		<legend>Search Product</legend>
		<form action="./search" method="post">
			<table >
				<tr>
					<td>ID:</td>
					<td><input name = "id" type = "number"></td>
					<td><input type = "submit" value = "Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<br>
<%
	Product product = (Product)request.getAttribute("bean");
%>
<%
	if(product != null){
%>
	<table style="border: solid 1px black">
		<tr style="border: solid 1px black">
			<th>PID</th>
			<th>PName</th>
			<th>price</th>
			
		</tr>
		<tr style="border: solid 1px black">
			<td><%=product.getPid()%></td>
			<td><%=product.getPname()%></td>
			<td><%=product.getPrice()%></td>
			<td><a href="./order">Order Now</a>	</td>
		</tr>
	
	</table>
<%
	}
%>
	<h3>${msg}</h3>
</body>
</html>