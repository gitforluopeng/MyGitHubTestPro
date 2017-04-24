<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>所有信息</title>
    
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
  
  <table border="1">
      <tr>
        <td align="center">id</td>
        <td align="center">name</td>
        <td align="center">sex</td>
        <td align="center">age</td>
        <td align="center">grade</td>
        <td align="center">score</td>
      </tr>
   <s:iterator value="sjsp">
      
      <tr>
        <td><s:property value="id"/></td>
        <td><s:property value="name"/></td>
        <td><s:property value="sex"/></td>
        <td><s:property value="age"/></td>
        <td><s:property value="grade"/></td>
        <td><s:property value="score"/></td>
        
      </tr>
    </s:iterator>
   </table>
   <a href="index.jsp">返回主页</a>
  </body>
</html>
