<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>컬러 선택</h2>
	<form action="color.jsp">
		<label for="m1">빨강</label><input type="checkbox" name="color" id="m1"
			value="빨강"><br> <label for="m2">주황</label><input
			type="checkbox" name="color" id="m2" value="주황"><br> <label
			for="m3">노랑</label><input type="checkbox" name="color" id="m3"
			value="노랑"><br> <label for="m4">파랑</label><input
			type="checkbox" name="color" id="m4" value="파랑"><br> <label
			for="m5">초록</label><input type="checkbox" name="color" id="m5"
			value="초록">
		<p>
			<input type="submit" value="확인">
	</form>
</body>
</html>