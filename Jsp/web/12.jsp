<%--
  Created by IntelliJ IDEA.
  User: wym
  Date: 2017/11/2
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>验证页</title>
    <meta charset="UTF-8"/>
</head>
<body>
<%
    String rand=session.getAttribute("rand").toString().trim();//返回时object,所以转换String
    String gess=request.getParameter("gess").trim();
    if(gess.length()==0)
    {
%>
<form method="post" action="12.jsp" name="form" id="form">
    请输入你要猜的字母：<br/><input type="text" name="gess"/>
    <input type="submit" value="确认"/>
<%
    }
    else if(gess.equalsIgnoreCase(rand)){
        %>
    恭喜你，猜对了！该字母是 <%=gess%>
    <%
    }
    else{
        %>
    很遗憾，猜错了！<a href="11.jsp">请重新猜</a>
    <%
    }
%>

</body>
</html>
