<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>당첨자 발표</h2>
	${winner[0] } ${winner[1] } ${winner[2] } ${winner[3] }
	<h2>당첨자 명단</h2>
	<%
		String[] winner = (String[]) request.getAttribute("winner");
		if (winner != null) {
			for (String st : winner) {
				out.println(st + " ");
			}
		}
	%>
</body>
</html>