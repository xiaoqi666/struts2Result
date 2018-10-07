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
<form action="${pageContext.request.contextPath}/Demo11Action" method="post">
    list:<input type="text" name="list"><br>
    list:<input type="text" name="list[1]"><br>
    map:<input type="text" name="map['haha']"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
