package com.tysss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoanTypeInfo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type=req.getParameter("loan_type");
		PrintWriter p=resp.getWriter();
		if(type.equalsIgnoreCase("HOME"))
		{
			//home loan info
			p.println("<html><body>");
			p.println("<h1>HOME LOAN</h1>");
			p.println("</body></html>");
		}
		else if(type.equalsIgnoreCase("PERSONAL"))
		{
			//personal loan info
			p.println("<html><body>");
			p.println("<h1>PERSONAL LOAN</h1>");
			p.println("</body></html>");
		}
		else if(type.equalsIgnoreCase("CAR"))
		{
			//car loan info
			p.println("<html><body>");
			p.println("<h1>CAR LOAN LOAN</h1>");
			p.println("</body></html>");
		}
		else
			resp.sendRedirect("https://en.wikipedia.org/wiki/Bank");//location..
	}

}
