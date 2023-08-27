package com.ty;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		ServletContext context= getServletContext();//1
//		ServletContext context= req.getServletContext();//2
		ServletConfig config=getServletConfig();//3
		ServletContext context= req.getServletContext();
		
		
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		
		System.out.println("=================PAGE A=============");
		System.out.println("URL IS:"+url);
		System.out.println("USER IS:"+user);
	}

}
