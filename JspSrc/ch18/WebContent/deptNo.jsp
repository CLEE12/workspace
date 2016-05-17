<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch18.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		DeptDao dd = DeptDao.getInstance();
		List<Dept> list = dd.selectList(0);
	%>
	<h2>부서코드 선택</h2>
	<!-- <form action="EmpList"> -->
	<!-- <form action="XmlList"> -->
	<form action="JsonList">
		<select name="deptno">
			<option value="0">모두</option>
			<%
				for (Dept d : list) {
					out.println("<option value=" + d.getDeptno() + ">" + d.getDname() + "</option>");
				}
			%>
		</select>
		<p>
			<input type="submit" value="확인">
	</form>
</body>
</html>