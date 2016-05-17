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
	<f:formatNumber value="1234567"></f:formatNumber>
	<p>
		<f:formatNumber value="1.345764" pattern="#.##" />
	<p>
		<f:formatNumber value="1.3" pattern="#.##" />
	<p>
		<f:formatNumber value="1.3" pattern="#.00" />
	<p>
		<f:formatNumber value="1.3" type="percent" />
	<p>
		<f:formatNumber value="100" type="currency" />
	<p>
</body>
</html>