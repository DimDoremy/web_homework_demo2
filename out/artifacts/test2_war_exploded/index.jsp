<%--
  Created by IntelliJ IDEA.
  User: Doremy
  Date: 2020/4/7
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>实验二</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/rdservlet">
    <button>编写一个servlet，测试获取请求行相关信息的方法，熟悉各方法的含义</button>
</a>
<br />
<a href="${pageContext.request.contextPath}/rfservlet">
    <button>利用Referer头字段实现防盗链</button>
</a>
<br />
<a href="${pageContext.request.contextPath}/form.jsp">
    <button>编写Servlet，测试获取客户端表单中的文本框、复选框的信息</button>
</a>
<br />
<a href="${pageContext.request.contextPath}/cookie">
    <button>显示用户上次访问时间</button>
</a>
<br />
<a href="${pageContext.request.contextPath}/lbservlet">
    <button>实现模拟购物车</button>
</a>
<br />
<a href="${pageContext.request.contextPath}/rdservlet">
    <button>实验带图形验证码的用户登陆</button>
</a>
<br />
</body>
</html>
