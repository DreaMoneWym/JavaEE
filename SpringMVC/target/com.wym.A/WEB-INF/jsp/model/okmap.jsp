<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/31
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <c:forEach items="${map}" var="m">
       ${m.key}---${m.value.username}
   </c:forEach>
</body>
</html>
