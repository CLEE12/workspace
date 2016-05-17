<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*" errorPage="DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String dno = request.getParameter("dno");
		String dname = request.getParameter("dname");
		String phone = request.getParameter("phone");
		String position = request.getParameter("position");
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
		String sql = String.format("insert into division values(%s,'%s','%s','%s')", dno, dname, phone, position);
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "root", "mysql");
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);
		if (result > 0)
			out.println("입력 성공 ㅋㅋ");
		else
			out.println("입력 실패 ㅠㅠ");
		stmt.close();
		conn.close();
	%>
</body>
</html>