<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,ch10.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Dept> list = (ArrayList<Dept>) request.getAttribute("list");
	%>
	<table border="1">
		<caption>
			<h2>부서 리스트</h2>
		</caption>
		<tr>
			<th>부서코드</th>
			<th>부서명</th>
			<th>근무지</th>
			<th>수정여부</th>
			<th>삭제여부</th>
		</tr>
		<%
			for (Dept d : list) {
		%>
		<tr>
			<td><%=d.getDeptno()%></td>
			<td><%=d.getDname()%></td>
			<td><%=d.getLoc()%></td>
			<td><a href="oraUpdateForm.jsp?deptno=<%=d.getDeptno()%>">수정</a>
			</td>
			<td><a href="oraDelete.jsp?deptno=<%=d.getDeptno()%>">삭제</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>