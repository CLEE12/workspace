<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
/* 	function idCheck() {
		if (!frm.id.value) { alert('아이디를 입력하고 중복체크하세요');
			frm.id.focus(); return false; 	}
		location.href="idCheck.do?id="+frm.id.value;
	} */
	function chk() {
		if (frm.pass.value != frm.pass2.value) {
			alert("암호를 확인하세요");
			frm.pass.focus();	return false;	}
		return true;
	}
	$(function() {		
		$('#idCheck').click(function() {
			if ($('#id').val()=="") {
				alert("아이디를 입력한 후에 체크하세요");
				$('#id').focus();
				return false;
			}
			var sendData='id='+$('#id').val();
			$.post('idCheck.do',sendData,function(msg){
				alert(msg);
			});
			return false;
		});
	});
</script></head><body>
<%-- <c:if test="${not empty msg}">
	<script type="text/javascript">
		alert("${msg}");
	</script>
</c:if> --%>
<form action="join.do" method="post" onsubmit="return chk()"
	name="frm">
<table border="1">
	<caption><h2>회원가입</h2></caption>
	<tr><th>아이디</th><td><input type="text" name="id"
		required="required" <%-- value="${id } --%> id="id">
		<input type="button" value="중복체크" id="idCheck"></td></tr>
	<tr><th>암호</th><td><input type="password" name="pass"
		required="required"></td></tr>
	<tr><th>암호확인</th><td><input type="password" name="pass2"
		required="required"></td></tr>
	<tr><th>이름</th><td><input type="text" name="name"
		required="required"></td></tr>
	<tr><th>전화번호</th><td><input type="tel" name="tel"
		required="required"></td></tr>
	<tr><th>주소</th><td><input type="text" name="addr"
		required="required"></td></tr>
	<tr><td colspan="2" align="center">
		<input type="submit" value="확인"></td></tr>
</table></form>
</body>
</html>