<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<c:if test="${not empty msg}"><font color="red">
	${msg}
</font></c:if>
<form action="update.do" method="post">
	<input type="hidden" name="id" value="${board.id }">
<table border="1">
	<caption><h2>게시판 수정</h2></caption>
	<tr><th>제목</th><td><input type="text" name="title"
		required="required" value="${board.title }"></td></tr>
	<tr><th>작성자</th><td><input type="text" name="writer"
		required="required" value="${board.writer }"></td></tr>
	<tr><th>내용</th><td><textarea rows="5" cols="40" 
		name="content" required="required">${board.content }</textarea></td></tr>
	<tr><td colspan="2" align="center">
		<input type="submit" value="확인"></td></tr>
</table></form>
</body>
</html>