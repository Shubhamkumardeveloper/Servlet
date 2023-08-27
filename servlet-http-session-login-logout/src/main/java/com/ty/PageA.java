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
public class PageA extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		PrintWriter p=resp.getWriter();
		
		String userName=req.getParameter("user_name");
		String pass=req.getParameter("password");
		
		if(userName.equals("admin") && pass.equals("admin"))
		{
			p.print("<h1>Login Succesfull...</h1>");
			HttpSession session=req.getSession();
			session.setAttribute("userName", userName);
			p.print("<h1>I am in page A");
		}
		else
			p.print("<h1>Login failed...</h1>");
	}

}
