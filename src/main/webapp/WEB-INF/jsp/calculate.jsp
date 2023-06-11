<%--
  Created by IntelliJ IDEA.
  User: alexey
  Date: 09.06.2023
  Time: 07:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<link rel="stylesheet" href="mysite.css">
<link rel="stylesheet" href="http://www.htmlbook.ru/main.css">
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculate" method="post">
    a <input type="text" name="a"/>
    <br><br>
    <%--    <input type="button" name="method" value="addition" >--%>
    <select name="method">
        <option value="addition">Плюс</option>
        <option value="subtraction">Минус</option>
        <option value="multiplication">Умножить</option>
        <option value="division">Разделить</option>
    </select>
    <br><br>
    b <input type="text" name="b"/>
    <br><br>
    <p>
        <input type="submit" value="Равно">
    </p>
</form>
<h3>${result}</h3>
</body>
</html>