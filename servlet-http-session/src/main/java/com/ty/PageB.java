package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-b")
public class PageB extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		
		String name=(String) session.getAttribute("userName");
		String phone=(String) session.getAttribute("phoneNumber");//null
		
		
		PrintWriter p=resp.getWriter();
		p.print("<h1>User name is:"+name+"</h1>");
		p.print("<h1>User name is:"+phone+"</h1>");
		
	}

}
