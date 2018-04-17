<%--
  Created by IntelliJ IDEA.
  User: wsblsonzs
  Date: 2018/4/9
  Time: 上午10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="userAction!login">
        <p>账号：<input type="text" name="userInfo.username"/></p>
        <p>密码：<input type="password" name="userInfo.password"/></p>
        <p>
            <input type="submit" value="登录"/>
            <input type="reset" value="取消"/>
        </p>
    </form>

</body>
</html>
