<%@page import="com.ty.Student"%>
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
	Student s=(Student)request.getAttribute("my_student");


%>

<h1>Id is:<%=s.getId() %></h1>
<h1>Name is:<%=s.getName() %></h1>
<h1>Email is:<%=s.getEmail() %></h1>

</body>
</html>