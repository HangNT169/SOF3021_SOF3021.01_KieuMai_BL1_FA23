<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Category ID</th>
        <th>Category Code</th>
        <th>Category Name</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${ds}" var="ds">
    <tr>
        <td>${ds.id1}</td>
        <td>${ds.categoryCode}</td>
        <td>${ds.categoryName}</td>
        <td>
            <button><a>Edit</a></button>
            <button><a>Remove</a></button>
        </td>
    </tr>
    </c:forEach>
    </thead>
</table>

</body>
</html>