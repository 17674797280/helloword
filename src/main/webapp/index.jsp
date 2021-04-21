<%@ page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>新增</title>
</head>
<body>
<form action="insert" method="post">
    产品id:<input type="text" name="menuid" placeholder="请输入产品id">
    菜单标题:<input type="text" name="title" placeholder="请输入菜单标题">
    菜单状态:<input type="text" name="state" placeholder="请输入菜单状态">
    菜单地址:<input type="text" name="url" placeholder="请输入菜单地址">
    菜单上级id:<input type="text" name="parentId" placeholder="请输入菜单上级id">
    菜单log图:<input type="text" name="iconCls" placeholder="请输入菜单log图">
    <input type="submit" value="确认">
    <input type="submit" value="取消">
</form>
</body>
</html>