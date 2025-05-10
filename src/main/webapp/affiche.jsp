<%@ page import="com.example.demo.connction.DbConnect" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 4/17/2025
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=request.getAttribute("etudiants")%>
<input type="submit" value="setting" onclick="window.location.href='setting.jsp';"><br>
<a href="index.jsp">add membre</a>
</body>
</html>
