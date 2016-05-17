<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag body-content="empty"%>
<%@ tag dynamic-attributes="attrs"%>
<font color="${attrs.color }"> <%
 	java.util.Map attrs = (java.util.Map) jspContext.getAttribute("attrs");
 	int size = Integer.parseInt(attrs.get("size").toString());
 	for (int i = 0; i < size; i++) {
 		out.print("=");
 	}
 %>
</font>
<br>
