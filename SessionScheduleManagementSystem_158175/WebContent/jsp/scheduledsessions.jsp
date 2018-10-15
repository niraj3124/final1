<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${!data.isEmpty()}">
<table border="1px">
	<tr>
		<td>id</td>
		<td>name</td>
		<td>duration</td>
		<td>faculty</td>
		<td>mode1</td>
	</tr>
	<c:forEach items="${data}" var="d">
		<tr>
		<td>${d.getId()}</td>
		<td>${d.getName()}</td>
		<td>${d.getDuration()}</td>
		<td>${d.getFaculty()}</td>
		<td>${d.getMode1()}</td>
		<td><a href="success.do">Enroll Me</a></td>
	</tr>
	</c:forEach>
</table>
</c:if>
<c:if test="${data.isEmpty()}">
<h3>No data found in our system</h3>
</c:if>


</body>
</html>