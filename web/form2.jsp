<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/7
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Demo9Action">
    用户名:<input type="text" name="user.name"><br>
    年龄:<input type="text" name="user.age"><br>
    生日:<input type="text" name="user.birthday"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
