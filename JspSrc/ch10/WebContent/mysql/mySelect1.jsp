<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="../DBError.jsp" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "root", "mysql");
		if (conn != null) {
			out.println("연결 성공 ㅋㅋ");
			conn.close();
		} else
			out.println("ㅠㅠ");
	%>
</body>
</html>