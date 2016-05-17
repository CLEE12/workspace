<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch11.*" errorPage="../DBError.jsp"%>
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
					id = ck.getValue();
					break;
				}
			}
			if (id.equals(""))
				response.sendRedirect("loginForm.jsp");
		} else
			response.sendRedirect("loginForm.jsp");
		MemberDao md = new MemberDao();
		String name = md.select(id);
	%>
	<%=name%>님 격하게 환영합니다
	<p>
		<button onclick="location.href='logout.jsp'">로그아웃</button>
</body>
</html>