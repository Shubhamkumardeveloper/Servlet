package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String age=req.getParameter("user_age");
		
		PrintWriter p=resp.getWriter();
		p.println("<html><body>");
		p.println("<h1>Name:"+name+"</h1>");
		p.println("<h1>Email:"+email+"</h1>");
		p.println("<h1>Age:"+age+"</h1>");
		p.println("</body></html>");
	}

}
