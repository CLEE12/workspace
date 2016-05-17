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
		String info = application.getServerInfo();
		int major = application.getMajorVersion();
		int minor = application.getMinorVersion();
		String real = application.getRealPath("/");
		application.log("대박이야 ㅋㅋ");
	%>
	컨테이너 :
	<%=info%><p>
		버전 :
		<%=major%>.<%=minor%>
	<p>
		실제경로 :
		<%=real%>
</body>
</html>