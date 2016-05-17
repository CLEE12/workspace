<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch11.*" errorPage="../DBError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="mem" class="ch11.Member"></jsp:useBean>
	<jsp:setProperty property="*" name="mem" />
	<%
		MemberDao md = new MemberDao();
		int result = md.insert(mem);
		if (result > 0) {
	%>
	<script type="text/javascript">
		alert("입력 성공");
		location.gref = "loginForm.jsp";
	</script>
	<%
		} else {
	%>
	<script type="text/javascript">
		alert("입력 실패");
		history.back();
	<%}%>
		
	</script>
</body>
</html>