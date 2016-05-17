<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="../DBError.jsp" import="ch10.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int dno = Integer.parseInt(request.getParameter("dno"));
		String dname = request.getParameter("dname");
		String phone = request.getParameter("phone");
		String position = request.getParameter("position");
		MyProce mp = new MyProce();
		mp.setDno(dno);
		mp.setDname(dname);
		mp.setPhone(phone);
		mp.setPosition(position);
		int result = mp.insert();
		if (result > 0)
			out.println("입력 성공");
		else {
	%>
	<script type="text/javascript">
		alert("에이그 에러야 !");
		history.back();
	</script>
	<%
		}
	%>
</body>
</html>