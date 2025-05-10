<%--
  Created by IntelliJ IDEA.
  User: hamza bettaibi
  Date: 5/7/2025
  Time: 9:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="setting" method="get">
    nom:<input type="text"name="nom"><br>
    prenom:<input type="text"name="prenom"><br>
    email:<input type="text"name="email"><br>
    password:<input type="text"name="password"><br>
    type cin u wanna change:<input type="text"name="cin1"><br>
    <input type="submit"value="save">
</form>
<form action="delete" method="get">
    type cin u wanna delete: <input type="text"name="cin2"><br>
    <input type="submit"value="DELETE" onclick="window.location.href='affiche.jsp';">
</form>
</body>
</html>
