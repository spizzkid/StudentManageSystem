<%--
  Created by IntelliJ IDEA.
  User: spizz
  Date: 6/25/2022
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>全部学生</title>
    <h2 align="center">学生管理系统Beta1.0</h2>

</head>
<body style="background-color: azure">
    <table align="center" width="600px" border="1px">
        <a href="mainPage.jsp">返回主界面</a>
        <tr align="center">
            <td>id</td><td>姓名</td><td>年龄</td><td>地址</td><td>电话</td></tr>
        <c:forEach items="${stuList}" var="stu">
            <tr align="center"><td>${stu.id}</td><td>${stu.name}</td>
                <td>${stu.age}</td><td>${stu.address}</td><td>${stu.phone}</td>
                <td>
                    <a href="/StudentManager_war_exploded/StuDeleteServlet?did=${stu.id}">删除</a>
                    <a href="/StudentManager_war_exploded/StuUpdateServlet?uid=${stu.id}">修改</a>
                </td>

            </tr>
        </c:forEach>
    </table>

</body>
</html>
