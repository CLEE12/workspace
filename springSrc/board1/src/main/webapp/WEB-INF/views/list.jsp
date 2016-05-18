<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table border="1">
	<caption><h2>게시판 리스트</h2></caption>
	<tr><th>아이디</th><th>제목</th><th>작성자</th>
		<th>조회수</th><th>작성일</th></tr>
<c:forEach var="bd" items="${list }">
	<tr><td>${bd.id}</td>
		<td><a href="view.do?id=${bd.id}">${bd.title}</a></td>
		<td>${bd.writer }</td><td>${bd.hit }</td>
		<td>${bd.regDate }</td></tr>
</c:forEach>
</table>
<a href="write.do">입력</a>
</body>
</html>