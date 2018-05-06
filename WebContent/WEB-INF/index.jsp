<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main page</title>
</head>
<body>
	<%@include file="/WEB-INF/parts/header.jspf"%>

	<h3>Latest solutions</h3>
	<table>
		<tr>
			<th>Description</th>
			<th>Creation date</th>
			<th>Modification date</th>
			<th>User id</th>
			<th>Task id</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${solutions}" var="solution">
			<tr>
				<td>${solution.description}</td>
				<td>${solution.created}</td>
				<td>${solution.updated }</td>
				<td>${solution.exerciseId }</td>
				<td>${solution.userId }</td>
				<td><a href="show-solution?id=${solution.id }">Show details</a></td>
			</tr>
		</c:forEach>
	</table>
	<%@include file="/WEB-INF/parts/footer.jspf"%>
</body>
</html>