package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		
		PrintWriter p=resp.getWriter();
		
		if(userName.equals("admin")&& password.equals("admin"))
		{
			//succesfull
			p.print("<html><body>");
			p.print("<h1>Succesfully logged in. welcome</h1>");
			p.print("</body></html>");
		}
		else
		{
			//failed
			p.print("<html><body>");
			p.print("<h1>User Name or password is wrong</h1>");
			p.print("</body></html>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
			
	}

}
