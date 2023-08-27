package com.ty;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageB  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context= getServletContext();
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		
		System.out.println("=================PAGE B=============");
		System.out.println("URL IS:"+url);
		System.out.println("USER IS:"+user);
	}

}
