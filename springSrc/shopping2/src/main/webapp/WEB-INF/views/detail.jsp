<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>상세 정보</h2>
<table border="1">
	<tr><td><img alt="" src="img/${item.pictureUrl}"></td>
		<td>
			<table border="1">
				<tr><th>번호</th><td>${item.itemId}</td></tr>
				<tr><th>이름</th><td>${item.itemName}</td></tr>
				<tr><th>가격</th><td>${item.price}</td></tr>
				<tr><th>설명</th><td>${item.description}</td></tr>
			</table>
		</td></tr>
</table>
<a href="index.do">목록</a>
</body>
</html>