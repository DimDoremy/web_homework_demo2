<%--
  Created by IntelliJ IDEA.
  User: Doremy
  Date: 2020/4/22
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>login</title>
    <meta http-equiv="Content-Type" content="text/html;chatset=utf-8"/>
</head>
<body>
<form action="${pageContext.request.contextPath}/loginservlet" method="post" name="reg">
    <label for="username">
        <text>用户名：</text>
        <input type="text" name="username" id="username">
    </label>
    <br>
    <label for="password">
        <text>密码：</text>
        <input type="text" name="password" id="password">
    </label>
    <br>
    <label for="check_code">
        <text>验证码：</text>
        <input type="text" name="check_code" id="check_code">
        <img src="${pageContext.request.contextPath}/checkservlet" alt="验证码">
    </label>
    <br>
    <input type="submit" value="提交" id="bt">
</form>
</body>
</html>
