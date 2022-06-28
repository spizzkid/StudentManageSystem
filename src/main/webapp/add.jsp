<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body style="background-color: azure">
<h2 align="center">学生管理系统Beta1.0</h2>
<hr>
<form method="post" action="/StudentManager_war_exploded/StuAddServlet">
    <a href="mainPage.jsp">返回主界面</a>
    <table align="center" width="300px" border="1px">
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="s_name"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="s_age"></td>
        </tr>
        <tr>
            <td>地址：</td>
           <td> <select name="city">
                <option value="北京">北京</option>
                <option value="上海">上海</option>
                <option value="深圳">深圳</option>
                <option value="杭州">杭州</option>
           </select> </td>
        </tr>
        <tr>
            <td>电话：</td>
            <td><input type="text" name="s_phone"></td>
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
