<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Kết quả</title></head>
<body>

<%
    String message = (String) request.getAttribute("message");
    if (message != null && !message.isEmpty()) {
%>
    <p><%= message %></p>
<%
    } else {
%>
    <p>Không có thông báo.</p>
<%
    }
%>

<a href="login.jsp">Quay lại</a>
</body>
</html>
