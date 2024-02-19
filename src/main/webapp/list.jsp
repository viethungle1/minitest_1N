<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<center>
    <h2>Home Page</h2>
</center>
<br>
<div align="center">
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Provice</th>
        </tr>
        <c:forEach items="${list1}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.address}</td>
                <td>${customer.email}</td>
                <td>${customer.phone}</td>
                <td>${customer.provice}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
