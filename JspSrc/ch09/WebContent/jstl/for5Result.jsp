<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>오늘의 색</h2>
	<c:forEach var="col" begin="0" end="7" items="${color }">
		<c:forEach var="i" begin="0" end="7">
			<font size="${i }" color="${col }">야호</font>
		</c:forEach>
		<p>
	</c:forEach>
	<%-- <font size="${10-cnt }">야 호~</font><p> 큰걸로 시작해서 줄이는 방법 --%>
</body>
</html>