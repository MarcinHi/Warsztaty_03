<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User groups</title>
</head>
<body>
	<%@include file="/WEB-INF/parts/header.jspf"%>

	<h3>User groups</h3>
	<table>
		<tr>
			<th>id</th>
			<th>Name</th>
		</tr>
		<c:forEach items="${groups}" var="group">
			<tr>
				<td>${group.id}</td>
				<td>${group.name}</td>
				<td><a href="removeGroup?id=${group.id}">Remove group</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="addNewGroup">Add new group</a>

	<%@include file="/WEB-INF/parts/footer.jspf"%>

</body>
</html>