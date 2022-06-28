
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
    <h2 align="center">学生管理系统Beta1.0</h2>
</head>
<body style="background-color: azure">
<a href="search.jsp">返回搜索界面</a>
<table align="center" width="600px" border="1px">
    <tr align="center">
        <td>id</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>地址</td>
        <td>电话</td>
    </tr>
    <tr align="center">
        <td>${stuList.id}</td>
        <td>${stuList.name}</td>
        <td>${stuList.age}</td>
        <td>${stuList.address}</td>
        <td>${stuList.phone}</td>
    </tr>
</table>

</body>
</html>

