<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$('#dnochk').click(function(){
			if ($('#deptno').val().length!=2) {
				alert("부서코드를 입력하고 체크하시오");
				$('#deptno').focus();	return false;	}
			var sendData='deptno='+$('#deptno').val();
			$.post('deptnoCheck.do',sendData,function(msg){
				alert(msg);
			});
			return false;
		});
	});
</script></head><body>
<form action="deptInsert.do" method="post">
<table><caption>부서정보 입력</caption>
	<tr><th>부서코드</th><td><input type="number" name="deptno"
		required="required" id="deptno" maxlength="2" size="2">
		<button id="dnochk">중복체크</button></td></tr>
	<tr><th>부서명</th><td><input type="text" name="dname"
		required="required"></td></tr>
	<tr><th>근무지</th><td><input type="text" name="loc"
		required="required"></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인"></td></tr>	
</table></form>
</body>
</html>