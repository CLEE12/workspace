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
	<c:url var="url" value="for2.jsp">
		<c:param name="num" value="7"></c:param>
	</c:url>
	<c:set var="k" value="http://www.choongang.co.kr"></c:set>
	<c:redirect url="${url}"></c:redirect>
</body>
</html>