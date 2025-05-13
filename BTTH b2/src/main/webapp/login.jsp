<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>

<h2>Form Đăng Nhập</h2>
<form action="login" method="post">
    <label for="username">Tên đăng nhập:</label>
    <input type="text" name="username" id="username"><br><br>

    <label for="password">Mật khẩu:</label>
    <input type="password" name="password" id="password"><br><br>

    <input type="submit" value="Đăng nhập">
</form>

<!-- Thông báo lỗi -->
<% 
    String message = (String) request.getAttribute("message");
    if (message != null && !message.isEmpty()) {
%>
    <p style="color:red;"><%= message %></p>
<% } %>

</body>
</html>
