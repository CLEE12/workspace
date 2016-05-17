<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="date" value="<%=new Date()%>"></c:set>
	<h2>한국</h2>
	날짜 :
	<f:formatDate value="${date}" type="both" dateStyle="full"
		timeStyle="full" />
	<br> 금액 :
	<f:formatNumber value="1000" type="currency" />
	<br>
	<f:setLocale value="en_us" />
	<h2>미국</h2>
	날짜 :
	<f:formatDate value="${date}" type="both" dateStyle="full"
		timeStyle="full" />
	<br> 금액 :
	<f:formatNumber value="1000" type="currency" />
	<br>
	<f:setLocale value="ja_jp" />
	<h2>일본</h2>
	날짜 :
	<f:formatDate value="${date}" type="both" dateStyle="full"
		timeStyle="full" />
	<br> 금액 :
	<f:formatNumber value="1000" type="currency" />
	<br>
</body>
</html>