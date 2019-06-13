<%--
  Created by IntelliJ IDEA.
  model.User: abenezer
  Date: 6/13/19
  Time: 11:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>controller.Welcome</title>
    <style>
        h1{
            text-align: center;
        }
        div{
            width: 100px;
            margin: auto;
        }
    </style>
</head>
<body>
    <h1>Welcome, ${uname} </h1>
    <div>
<form action="/logout" method="post">
    <input type="submit" value="Logout">
</form></div>
</body>
</html>
