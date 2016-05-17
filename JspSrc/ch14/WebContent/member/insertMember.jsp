<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="ch12.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberDao md = MemberDao.getInstance();
		for (int i = 1; i < 150; i++) {
			Member mem = new Member();
			mem.setId("kk" + i);
			mem.setPasswd("kk" + i);
			mem.setName("길동" + i);
			mem.setAddress("강남" + i + "가");
			mem.setTel("010-1111-11" + i);
			md.insert(mem);
		}
	%>
	입력 완료
</body>
</html>