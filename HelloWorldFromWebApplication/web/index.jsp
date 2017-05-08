<%@ page import="edu.HelloWorld" %><%--
  Created by IntelliJ IDEA.
  User: thinhdbui
  Date: 7/5/17
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web application with 14CK4</title>
  </head>
  <body>
    <h1><%= HelloWorld.getMessage()%></h1>
    <a href="/member.jsp">Click here to go to member page</a>
    <form action="MemberServlet" method="POST">
      Name: <input type="text" name="name" /></br>
      Password: <input type="password" name="password" /></br>
      <input type="submit" value="login" />
    </form>
  </body>
</html>
