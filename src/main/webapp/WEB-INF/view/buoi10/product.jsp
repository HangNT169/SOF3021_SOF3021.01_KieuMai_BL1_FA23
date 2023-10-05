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
        <th>Product ID</th>
        <th>Category Code</th>
        <th>Category Name</th>
        <th>Product Code</th>
        <th>Product Name</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${products}" var="ds">
        <tr>
            <td>${ds.id}</td>
            <td>${ds.c.categoryCode}</td>
            <td>${ds.c.categoryName}</td>
            <td>${ds.productCode}</td>
            <td>${ds.productName}</td>
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