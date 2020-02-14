<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>TEST page</h1>
	<table>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>location</th>
		</tr>
		<c:forEach items="${list }" var="bean"></c:forEach>
		<tr>
			<td>${bean.deptno }</td>
			<td>${bean.dname }</td>
			<td>${bean.location }</td>
		</tr>
	</table>
</body>
</html>