<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Food Menu</title>
<style>
	table {
	  border-collapse: collapse;
	}
	
	table, th, td {
	  border: 1px solid black;
	}
	th, td{
		height:30px;
		padding:5px 10px;
	}
	th{
		background:lightblue;
	}
	td:nth-child(3){
		text-align: right;
	}
	tr:nth-child(even) {background: #CCC}
	
</style>
</head>
<body>
	<h2>Food Items</h2>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Item</th>
				<th>Unit Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="items" items="${foodItems}">
				<tr>
					<td>${items.id}</td>
					<td>${items.item}</td>
					<td>${items.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>