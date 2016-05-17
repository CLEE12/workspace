<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,java.util.*,ch10.*"
	errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Personal> list = (ArrayList<Personal>) request.getAttribute("list");
	%>
	<table border="1">
		<caption>
			<h2>직원정보</h2>
		</caption>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>업무</th>
			<th>급여</th>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getPno()%></td>
			<td><%=list.get(i).getPname()%></td>
			<td><%=list.get(i).getJob()%></td>
			<td><%=list.get(i).getPay()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>