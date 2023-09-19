<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <form action="">
        Tên: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/sinh-vien/view-add">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>

       <c:forEach items="${list}" var="sv" varStatus="i">
           <tr>
           <td>${i.index}</td>
           <td>${sv.maSV}</td>
           <td>${sv.ten}</td>
           <td>${sv.tuoi}</td>
           <td>${sv.diaChi}</td>
           <td>${sv.gioiTinh}</td>
           <td>
               <button><a href="/sinh-vien/remove/${sv.maSV}">Remove</a></button>
               <button><a href="/sinh-vien/view-update/${sv.maSV}">Update</a></button>
               <button><a href="/sinh-vien/detail/${sv.maSV}">Detail</a></button>
<%--               <button><a href="/sinh-vien/detail?ma=${sv.maSV}">Detail</a></button>--%>
           </td>
           </tr>
       </c:forEach>

    </tbody>
</table>
</body>
</html>
