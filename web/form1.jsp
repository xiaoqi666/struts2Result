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
<form action="${pageContext.request.contextPath}/Demo8Action">
    用户名:<input type="text" name="name"><br>
    年龄:<input type="text" name="age"><br>
    生日:<input type="text" name="birthday"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
