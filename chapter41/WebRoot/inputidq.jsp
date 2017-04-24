<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>信息输入页面</title>
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
  http://localhost:8080/chapter41/inputidq.jsp
    <form action="ShowStudent.action">
    <p>请输入要查询学生的学号：</p>
    <input name="id" type="text" size="20"/>
    <input type="submit" value="确定"/><br>
    
    </form>
    <a href="index.jsp">返回主页</a>
  </body>
</html>
