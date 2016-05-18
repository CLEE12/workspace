<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head><body>
<h2>아이템 목록</h2>
<table border="1">
	<tr><th>번호</th><th>상품명</th><th>상품가격</th><th>상품설명</th></tr>
<c:forEach var="item" items="${list }">
	<tr><td>${item.itemId }</td>
		<td><a href="detail.do?itemId=${item.itemId}">
			${item.itemName}</a></td>
		<td>${item.price}</td><td>${item.description }</td></tr>
</c:forEach>	
</table>
</body>
</html>