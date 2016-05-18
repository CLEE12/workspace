<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>배경색 선택</h2>
<form action="color.do" method="post">
	<label for="c1">빨강</label>
	<input type="radio" value="red" name="color" id="c1"><br>
	<label for="c2">주황</label>
	<input type="radio" value="orange" name="color" id="c2"><br>
	<label for="c3">노랑</label>
	<input type="radio" value="yellow" name="color" id="c3"><br>
	<label for="c4">초록</label>
	<input type="radio" value="green" name="color" id="c4"><br>
	<label for="c5">파랑</label>
	<input type="radio" value="blue" name="color" id="c5"><br>
	<label for="c6">남색</label>
	<input type="radio" value="navy" name="color" id="c6"><br>
	<label for="c7">보라</label>
	<input type="radio" value="violet" name="color" id="c7"><p>
	<input type="submit" value="확인">	
</form>
</body>
</html>