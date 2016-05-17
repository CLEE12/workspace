<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String path = application.getRealPath("/WEB-INF/bbs/");
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		Date date = new Date();
		long dt = date.getTime();
		String file = path + dt + ".txt";
		String str = "제목 : " + title + "\r\n작성자 : " + writer + "\r\n내용 : " + content;
		FileWriter fw = new FileWriter(file);
		fw.write(str);
		fw.close();
	%>
	출력성공
</body>
</html>