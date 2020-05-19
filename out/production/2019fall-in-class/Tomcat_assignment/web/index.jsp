<%--
  Created by IntelliJ IDEA.
  User.User: fanoh
  Date: 2019-11-30
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hanfan Wang Tomcat Assignment</title>
  </head>
  <body>
    <h1>Tomcat Assignment</h1>
    <form action="main.jsp" method="post">
      First Name: <input type="text" name="firstName"><br/>
      Last Name: <input type="text" name="lastName"><br/>
      ID: <input type="text" name="id"><br/>
      Password: <input type="password" name="password"><br/>
      <button type="submit" value="submit">Write to file</button>
    </form>
  </body>
</html>
