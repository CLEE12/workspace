<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
input {
	background-color: #5CD1E5
}

textarea {
	background-color: #5CD1E5
}
</style>
</head>
<body bgcolor="#BDBDBD">
	<%
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		GregorianCalendar gc = new GregorianCalendar();
		String data = String.format("%TF %TT", gc, gc);
	%>
	<form action="board.jsp" name="frm" onsubmit="return chk()">
		<center>
			<table border="1" bgcolor="#5CD1E5" width="300" height="100">
				<caption>
					<h2>게시판</h2>
				</caption>
				<tr>
					<th>제목</th>
					<td><%=title%></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><%=writer%></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><%=content%></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="확인"></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>