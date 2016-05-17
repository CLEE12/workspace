<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<f:setLocale value="ja_jp" />
	<f:setBundle basename="intro" />
	<h2>
		<f:message key="title"></f:message>
	</h2>
	greet :
	<f:message key="greet"></f:message>
	<p>
		body :
		<f:message key="body"></f:message>
	<p>
		company :
		<f:message key="company"></f:message>
	<p>
</body>
</html>