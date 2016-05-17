<%@page import="ch12.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ include file="sessionChk.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="comm.css">
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>주소</th>
			<th>전화</th>
			<th>등록일</th>
		</tr>
		<%
			List<Member> list = null;
			MemberDao md = MemberDao.getInstance();
			if (id != null && id.equals("master")) {
				list = md.selectList();
				for (Member mem : list) {
		%>
		<tr>
			<td><%=mem.getId()%></td>
			<td><%=mem.getName()%></td>
			<td><%=mem.getAddress()%></td>
			<td><%=mem.getTel()%></td>
			<td><%=mem.getReg_date()%></td>
		</tr>
		<%
			}
				out.println("</table>");
			} else {
		%>
		<script type="text/javascript">
			alert("권한이 없습니다.");
			history.go(-1);
		</script>
		<%
			}
		%>
	
</body>
</html>