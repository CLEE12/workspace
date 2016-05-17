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
	<c:forEach var="cnt" begin="1" end="10" step="2">
		<!-- step은 증가 함수 -->
		<font size="${cnt }">야 호~</font>
		<p>
			<%-- <font size="${10-cnt }">야 호~</font><p> 큰걸로 시작해서 줄이는 방법 --%>
	</c:forEach>
</body>
</html>