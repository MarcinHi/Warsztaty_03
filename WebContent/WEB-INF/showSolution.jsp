<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Solution id: ${solution.id }</title>
</head>
<body>

<%@include file="/WEB-INF/parts/header.jspf" %>
Details of solution no. ${solution.id }
<div>${solution.description}</div>
<div>${solution.created}</div>
<div>${solution.updated }</div>
<div>${solution.exerciseId }</div>
<div>${solution.userId }</div>

<%@include file="/WEB-INF/parts/footer.jspf" %>

</body>
</html>