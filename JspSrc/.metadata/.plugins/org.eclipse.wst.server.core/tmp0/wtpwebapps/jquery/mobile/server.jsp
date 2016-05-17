<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
	<div data-role="page">
		<div data-role="header">
			<h2>결과 확인</h2>
		</div>
		<div data-role="content">
			이름 :
			<%=request.getParameter("name")%><p>
				주소 :
				<%=request.getParameter("addr")%>
		</div>
		<div data-role="footer" data-position="fixed">
			<h2>바닥글</h2>
		</div>
	</div>
</body>
</html>