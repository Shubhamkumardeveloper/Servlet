package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/page-a")
public class PageA  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("user_name");
		String password=req.getParameter("password");
		
		PrintWriter p=resp.getWriter();
		p.print("<h1> Hii im page a</h1>");
		p.print("<form action='page-b'>");
		//p.print("<input type='hidden' name='user_name'>");//hiding the body of form..inspact..want some information to be share in side the text
		p.print("<input type='hidden' name='user_name' value="+userName+">");
		p.print("Email <input type='text' name='user_email'>");
		p.print("Phone <input type='text' name='user_phone'>");
		p.print("<input type='submit' value='next'>");
		p.print("</form>");
		
		
	}

}
