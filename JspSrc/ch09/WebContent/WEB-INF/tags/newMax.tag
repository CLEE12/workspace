<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ tag body-content="empty"%>
<%@ attribute name="num1" type="java.lang.Integer" required="true"%>
<%@ attribute name="num2" type="java.lang.Integer" required="true"%>
<%@ attribute name="var" required="true" rtexprvalue="false"%>
<%@ variable name-from-attribute="var" alias="maximum" scope="AT_END"
	variable-class="java.lang.Integer"%>
<%
	int result = 0;
	if (num1 > num2)
		result = num1;
	else
		result = num2;
%>
<c:set var="maximum" value="<%=result%>"></c:set>