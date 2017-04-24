<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>更新数据</title>
    
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
    <form action="Update.action" method="post">
    <p>请输入修改的学生信息</p>
    <table align="left" border="1">
      <tr>
        <td>原姓名</td>
        <td>修改后的id</td>
        <td>修改后的name</td>
        <td>修改后的sex</td>
        <td>修改后的age</td>
        <td>修改后的grade</td>
        <td>修改后的score</td>
      </tr>
      <tr>
        <td><input name="uname" type="text" size="5"/></td>
        <td><input name="id" type="text" size="10"/></td>
        <td><input name="name" type="text" size="10"/></td>
        <td><input name="sex" type="text" size="10"/></td>
        <td><input name="age" type="text" size="10"/></td>
        <td><input name="grade" type="text" size="10"/></td>
        <td><input name="score" type="text" size="10"/></td>
      </tr>
    </table><br><br><br><br>
    <input type="submit" value="提交"/><br>
    </form>
    <a href="index.jsp">返回主页</a>
  </body>
</html>
