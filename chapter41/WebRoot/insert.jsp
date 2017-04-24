<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>添加数据</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  http://localhost:8080/chapter24/insert.jsp
    <form action="Insert.action" method="post">
    <p>请输入添加的学生信息</p>
    <table align="left" border="1">
      <tr>
        <td>id</td>
        <td>name</td>
        <td>sex</td>
        <td>age</td>
        <td>grade</td>
        <td>score</td>
      </tr>
      <tr>
        <td><input name="id" type="text" size="5"/></td>
        <td><input name="name" type="text" size="5"/></td>
        <td><input name="sex" type="text" size="5"/></td>
        <td><input name="age" type="text" size="5"/></td>
        <td><input name="grade" type="text" size="10"/></td>
        <td><input name="score" type="text" size="5"/></td>
      </tr>
    </table><br><br><br><br>
    <input type="submit" value="提交"/><br>
    </form>
    <a href="index.jsp">返回主页</a>
  </body>
</html>
