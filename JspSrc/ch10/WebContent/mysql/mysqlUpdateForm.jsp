<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*,ch10.*"%>
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
		String dno = request.getParameter("dno");
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/test";
		String sql = "select * from division where dno=" + dno;

		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, "root", "mysql");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		String dname = "", Position = "", phone = "";
		if (rs.next()) {
			phone = rs.getString("phone");
			dname = rs.getString("dname");
			Position = rs.getString("Position");
		} else {
			out.println("없는 데이타");
		}
		;
		rs.close();
		stmt.close();
		conn.close();
	%>
	<h2>수정할 정보</h2>
	<form action="mysqlUpdate.jsp" name="frm" onsubmit="return chk()">
		부서코드 :
		<%=dno%><p>
			<input type="hidden" name="dno" value="<%=dno%>"> 부서명 : <input
				type="text" name="dname" value="<%=dname%>">
		<p>
			연락처 : <input type="text" name="phone" value="<%=phone%>">
		<p>
			근무지 : <input type="text" name="Position" value="<%=Position%>">
		<p>
			<input type="submit" value="확인">
	</form>
</body>
</html>