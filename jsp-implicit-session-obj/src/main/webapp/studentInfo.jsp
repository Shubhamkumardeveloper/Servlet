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

<h1>User Who logged in <%=session.getAttribute("userName") %></h1>
<%
Student s=(Student) session.getAttribute("myStudent");
%>

<h1>Student Information</h1>
<h3>Student id is:<%=s.getId() %></h3>
<h3>Student name is:<%=s.getName() %></h3>
<h3>Student email is:<%=s.getEmail() %></h3>

</body>
</html>