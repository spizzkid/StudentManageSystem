<%--
  Created by IntelliJ IDEA.
  User: spizz
  Date: 6/26/2022
  Time: 5:19 PM
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


<form method="post" action="/StudentManager_war_exploded/StuUpdateSubmitServlet">
    <input type="hidden" name="id" value="${stuList.id}"/>
    <table align="center" width="300px" border="1px">

        <tr>
            <td>姓名：</td>
            <td><input type="text" name="s_name" value="${stuList.name}"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="s_age" value="${stuList.age}"></td>
        </tr>
        <tr>
            <td>地址：</td>

            <td>
                <c:if test="${stuList.address=='北京'}">
                <select name="city" >
                <option selected value="北京">北京</option>
                <option value="上海">上海</option>
                <option value="深圳">深圳</option>
                <option value="杭州">杭州</option>
                </select>
                </c:if>
                <c:if test="${stuList.address=='上海'}">
                    <select name="city" >
                        <option value="北京">北京</option>
                        <option selected value="上海">上海</option>
                        <option value="深圳">深圳</option>
                        <option value="杭州">杭州</option>
                    </select>
                </c:if>
                <c:if test="${stuList.address=='深圳'}">
                    <select name="city" >
                        <option value="北京">北京</option>
                        <option value="上海">上海</option>
                        <option selected value="深圳">深圳</option>
                        <option value="杭州">杭州</option>
                    </select>
                </c:if>
                <c:if test="${stuList.address=='杭州'}">
                    <select name="city" >
                        <option value="北京">北京</option>
                        <option selected value="上海">上海</option>
                        <option value="深圳">深圳</option>
                        <option selected value="杭州">杭州</option>
                    </select>
                </c:if>
            </td>
        </tr>
        <tr>
            <td>电话：</td>
            <td><input type="text" name="s_phone" value="${stuList.phone}"></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <input type="submit" value="确定">
                <input type="reset" value="取消">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
