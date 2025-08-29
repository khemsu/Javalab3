<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Display Form Data</title>
</head>
<body>
    <h2>Form Data Submitted</h2>
    <p><b>Name:</b> <%= request.getParameter("name") %></p>
    <p><b>Email:</b> <%= request.getParameter("email") %></p>
    <p><b>Age:</b> <%= request.getParameter("age") %></p>
</body>
</html>
