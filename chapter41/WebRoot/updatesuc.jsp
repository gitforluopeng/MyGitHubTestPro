<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>更新成功</title>
    
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
    更新成功，信息如下：<br>
    学号：<s:property value="id"/><br>
    姓名：<s:property value="name"/><br>
    性别：<s:property value="sex"/><br>
    年龄：<s:property value="age"/><br>
    班级：<s:property value="grade"/><br>
    成绩：<s:property value="score"/><br>   
    <a href="index.jsp">返回主页</a>
    <a href="update.jsp">返回上一级</a>
  </body>
</html>
