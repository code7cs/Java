<%--
  Created by IntelliJ IDEA.
  User.User: fanoh
  Date: 2019-11-30
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*" %>
<%@ page import="User.User" %>

<html>
<head>
    <title>info</title>
</head>
<body>
<%
    User user = new User();
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String id = request.getParameter("id");
    String pwd = request.getParameter("passsword");

    user.setFirstName(firstName);
    user.setLastName(lastName);
    user.setId(id);
    user.setPassword(pwd);
%>
<h2>
    <% out.println(user); %>
</h2>

<hr/>
<%
    try {
        String nameOfTextFile = "/usr/local/User.txt";
        PrintWriter pw = new PrintWriter(new FileOutputStream(nameOfTextFile));
        pw.println(user);
        pw.close();
        out.println("Success write to file:" + nameOfTextFile);
    } catch (IOException e) {
        out.println(e.getMessage());
    }
%>
</body>
</html>
