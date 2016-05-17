<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,ch10.*"
	errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function chk() {
		if (!frm.dname.value) {
			alert("부서명 ?");
			frm.dname.focus();
			return false;
		}
		if (!frm.loc.value) {
			alert("근무지 ?");
			frm.loc.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<%
		String deptno = request.getParameter("deptno");
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "select * from dept where deptno=" + deptno;
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "scott", "tiger");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		String dname = "", loc = "";
		if (rs.next()) {
			dname = rs.getString("dname");
			loc = rs.getString("loc");
		} else {
			out.println("없는 데이타");
		}
		;
		rs.close();
		stmt.close();
		conn.close();
	%>
	<h2>수정할 정보</h2>
	<!-- <form action="oraUpdate.jsp" name="frm" onsubmit="return chk()"> -->
	<form action="oraUpdate2.jsp" name="frm" onsubmit="return chk()">
		부서코드 :
		<%=deptno%><p>
			<input type="hidden" name="deptno" value="<%=deptno%>"> 부서명 :
			<input type="text" name="dname" value="<%=dname%>">
		<p>
			근무지 : <input type="text" name="loc" value="<%=loc%>">
		<p>
			<input type="submit" value="확인">
	</form>
</body>
</html>