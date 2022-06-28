<%--
  Created by IntelliJ IDEA.
  User: spizz
  Date: 6/26/2022
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: azure">
<h2 align="center">学生管理系统Beta1.0</h2>


<form method="get" action="/StudentManager_war_exploded/StuSearchByNameServlet">
    <a href="mainPage.jsp">返回主界面</a>
    <table align="center" width="300px" border="1px">

        <tr>
            <td>姓名：</td>
            <td><input type="text" name="s_name" placeholder="按姓名查询"></td>
            <td><input type="submit" value="查询"></td>
        </tr>

    </table>
</form>

<form method="get" action="/StudentManager_war_exploded/StuSearchByAgeServlet">

    <table align="center" width="300px" border="1px">

        <tr>
            <td>年龄：</td>
            <td><input type="text" name="s_age" placeholder="按年龄查询"></td>
            <td><input type="submit" value="查询"></td>
        </tr>

    </table>
</form>


</body>
</html>