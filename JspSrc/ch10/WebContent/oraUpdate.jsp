<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*" errorPage="DBEror.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = String.format("update dept set dname='%s'," + "loc='%s' where deptno=%s", dname, loc, deptno);
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
	%>
	<script type="text/javascript">
		alert("수정 성공");
		location.href = "updateSelect.jsp";
	</script>
</body>
</html>