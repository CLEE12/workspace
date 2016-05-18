<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="customer/header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>파일 업로드</h2>
	<c:if test="${not empty msg}"><font color="red">
		${msg}			
	</font></c:if><br>
<form action="fileupload" method="post" 
		enctype="multipart/form-data">
	파일 : <input type="file" name="upLoadFile"><p>
	<input type="submit" value="확인">
</form>
</body>
</html>