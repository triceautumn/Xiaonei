<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head> 
    <title>My JSP 'showCountry.jsp' starting page</title>
  </head>
  <body>
   <h1>信息列表</h1>
   <c:forEach var="bean" items="${list}">
   ${bean.name }  <br/>
   </c:forEach>
  </body>
</html>
