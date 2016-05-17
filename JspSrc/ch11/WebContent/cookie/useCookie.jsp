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
		Cookie[] cooks = request.getCookies();
		if (cooks == null) {
	%>
	<script type="text/javascript">
		alert("쿠키를 먼저 생성하시오");
		location.href = "createCookie.jsp";
	</script>
	<%
		}
		if (cooks != null)
			for (int i = 0; i < cooks.length; i++) {
				if (cooks[i].getName().equals("id")) {
					out.println("쿠키이름 : " + cooks[i].getName() + "<br>");
					out.println("쿠키값 : " + cooks[i].getValue());
				}
			}
	%>
</body>
</html>