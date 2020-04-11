<%--
  Created by IntelliJ IDEA.
  User: Doremy
  Date: 2020/4/8
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单提交</title>
</head>
<body>
<div>
    <form action="submit">
        <div>
            <label for="user">用户信息</label>
            <input type="text" id="user" name="user">
        </div>
        <div>
            <label for="pwd">文本信息</label>
            <input type="password" id="pwd" name="pwd">
        </div>
        <div><label>你正在使用什么语言？</label></div>
        <label for="check-a"><input type="checkbox" name="check" value="a">A.C++</label>
        <label for="check-b"><input type="checkbox" name="check" value="b">B.Java</label>
        <label for="check-c"><input type="checkbox" name="check" value="c">C.Golang</label>
        <label for="check-d"><input type="checkbox" name="check" value="d">D.C#</label>
        <button type="submit">提交</button>
    </form>
</div>
</body>
</html>