package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-a")
public class PageA extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session= req.getSession();
		
		session.setAttribute("userName","Shubham kumar");
		
		User user=new User();
		user.name="Anjesh";
		user.email="a@gmail.com";
		user.phone=9876543210l;
		user.age=23;
		
		session.setAttribute("myUser", user);
		
		PrintWriter p=resp.getWriter();
		p.print("<h1>Session created...</h1>");
		
		
		
		
	}

}
