<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html><html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">div { color: red; }</style>
</head><body>
<c:if test="${msg !=null }"><div>${msg}</div></c:if>
<form action="mailSend.do" method="post">
	<table><caption>메일보내기</caption>
	<tr><th>받는 사람</th><td><input type="text" name="email" 
		required="required"></td></tr>
	<tr><th>제목</th>
		<td><input type="text" name="title" 
			required="required"></td></tr>
	<tr><th>내용</th>
		<td><textarea rows="7" cols="50" name="content" 
			required="required"></textarea></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인"></td>
		</tr>
	</table>
</form>
</body>
</html>