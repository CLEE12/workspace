<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*" errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	String dno = request.getParameter("dno");
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
	String sql = "delete from division where dno=" + dno;
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "root", "mysql");
	Statement stmt = conn.createStatement();
	int result = stmt.executeUpdate(sql);
	stmt.close();
	conn.close();
%>
<script type="text/javascript">
	alert("삭제 성공");
	location.gref = "mysqlUpdateSelect.jsp";
</script>
</head>
<body>

</body>
</html>