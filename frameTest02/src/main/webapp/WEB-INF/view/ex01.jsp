<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8" import="java.util.*, com.bit.model.entity.*" %>
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
		<%
			ArrayList list=(ArrayList)request.getAttribute("list");
			for(int i=0; i<list.size(); i++) {
				DeptVo bean=(DeptVo)list.get(i);
		%>
		<tr>
			<td><%=bean.getDeptno() %></td>
			<td><%=bean.getDname() %></td>
			<td><%=bean.getLoc() %></td>
		</tr>
		<%
			}
		 %>
	</table>
</body>
</html>