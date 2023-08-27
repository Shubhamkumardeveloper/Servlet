<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%
 
 	String name=request.getParameter("user_name");
 
 %>
<h1>Name is <%=name %></h1>
<h1>Name is <%=request.getParameter("user_email") %></h1>
<h1>Name is <%=request.getParameter("user_phone") %></h1>
</body>
</html>