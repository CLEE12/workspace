<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<table border="1">
	<caption><h2>게시판 상세</h2></caption>
	<tr><th>제목</th><td>${board.title }</td></tr>
	<tr><th>작성자</th><td>${board.writer }</td></tr>
	<tr><th>작성일</th><td>${board.regDate }</td></tr>
	<tr><th>조회수</th><td>${board.hit }</td></tr>
	<tr><th>내용</th><td><pre>${board.content }</pre></td></tr>	
</table>
<button onclick="location.href='update.do?id=${board.id}'">수정</button>
<button onclick="location.href='delete.do?id=${board.id}'">삭제</button>
<button onclick="location.href='list.do'">목록</button>
</body>
</html>