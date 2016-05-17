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
		String id = "";
		Cookie[] cook = request.getCookies();
		if (cook != null) {
			for (Cookie ck : cook) {
				if (ck.getName().equals("id")) {
					ck.setMaxAge(0);
					response.addCookie(ck);
					response.sendRedirect("main.jsp");
				}
			}
		} else
			response.sendRedirect("loginForm.jsp");
	%>
</body>
</html>