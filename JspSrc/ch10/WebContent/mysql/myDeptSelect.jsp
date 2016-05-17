<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*" errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>부서 정보</h2>
	<%
		String dno = request.getParameter("dno");
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String sql = "select * from division where dno=" + dno;
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "root", "mysql");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			String dname = rs.getString(2);
			String phone = rs.getString(3);
			String position = rs.getString(4);
			out.println("부서코드 : " + dno + "<p>");
			out.println("부서명 : " + dname + "<p>");
			out.println("전화번호 : " + phone + "<p>");
			out.println("근무지 : " + position);
			rs.close();
		} else
			out.println("없는 부서네 ㅠㅠ");
		stmt.close();
		conn.close();
	%>
</body>
</html>