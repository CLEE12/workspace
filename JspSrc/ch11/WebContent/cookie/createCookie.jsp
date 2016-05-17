<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cook = new Cookie("id", "kang");
		cook.setValue("kim");
		cook.setMaxAge(-1);
		/* 	-1은 창을 닫으면 쿠키를 사용하지 마라.
			0은 그냥 아예 사용하지 마라. */
		response.addCookie(cook);
	%>
	쿠키가 저장되었습니다
	<br>
	<br>
	<a href="useCookie.jsp">쿠키보기</a>
</body>
</html>