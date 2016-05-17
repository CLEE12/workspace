<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%!PrintWriter jspLog;

	public void jspInit() {
		try {
			jspLog = new PrintWriter(new FileWriter("c:/gov/jspLog.txt"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void jspDestroy() {
		if (jspLog != null)
			jspLog.close();
	}%>
<%
	String name = request.getParameter("name");
	GregorianCalendar gc = new GregorianCalendar();
	String date = String.format("%TF%TT", gc, gc);
	String msg = "안녕하세요" + name + "님 \t" + date + "\r\n";
	jspLog.write(msg);
%>
</head>
<body>

</body>
</html>