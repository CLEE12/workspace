<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch12.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="mem" class="ch12.Member"></jsp:useBean>
	<jsp:setProperty property="*" name="mem" />
	<%
		MemberDao md = MemberDao.getInstance();
		int result = md.insert(mem);
		if (result > 0) {
	%>
	<script type="text/javascript">
		alert("입력 성공");
		location.href = "loginForm.jsp";
	</script>
	<%
		} else {
	%>
	<script type="text/javascript">
		alert("잘~해봐라");
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>