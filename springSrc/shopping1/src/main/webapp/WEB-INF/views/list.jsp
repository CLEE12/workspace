<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html><html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/comm.css">
</head><body>
	<h2>상품 목록</h2>
<table border="1">
	<tr><th>번호</th><th>이름</th><th>가격</th><th>설명</th></tr>
<c:forEach var="item" items="${itemList}">
	<tr><td>${item.itemId}</td><td>${item.itemName}</td>
		<td>${item.price}</td><td>${item.description}</td>
	</tr>
</c:forEach>	
</table>
</body>
</html>