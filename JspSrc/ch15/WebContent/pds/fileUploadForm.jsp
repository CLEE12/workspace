<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일 업로드</h2>
	<form action="upload.action" method="post"
		enctype="multipart/form-data">
		파일 : <input type="file" name="file" required="required">
		<p>
			설명 : <input type="text" name="description" required="required">
		<p>
			<input type="submit" value="확인">
	</form>
	<p>
		<a href="list.action">자료실</a>
</body>
</html>