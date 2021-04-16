<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <script type="text/javascript" src="./js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <center>
        <h1>用户列表</h1>
        菜单标题: <input type="text" name="title" placeholder="请输入菜单标题">
        <button>查询</button>
        <table border="1" style="text-align: center">
            <caption><button>新增</button></caption>
           <thead>
                <tr>
                    <th>产品id</th>
                    <th>菜单标题</th>
                    <th>菜单状态</th>
                    <th>菜单地址</th>
                    <th>菜单上级id</th>
                    <th>菜单log图</th>
                    <th>操作</th>
                </tr>
           </thead>
            <%-- 循环取出结果集--%>
            <c:forEach var="menuinfo" items="${menuList}">
            <tr>
                <td>${menuinfo.menuid}</td>
                <td>${menuinfo.title}</td>
                <td>${menuinfo.state}</td>
                <td>${menuinfo.url}</td>
                <td>${menuinfo.parentId}</td>
                <td>${menuinfo.iconCls}</td>
                <td>
                    <button onclick="deleteById(${menuinfo.menuid})")>删除</button>
                    <button>修改</button>
                </td>
            </tr>
            </c:forEach>
        </table>
    </center>
<script type="text/javascript">
    $(function deleteById(id) {
        alert(id) //得到id
        //使用ajax 调用后台删除的方法
    })
</script>
</body>
</html>