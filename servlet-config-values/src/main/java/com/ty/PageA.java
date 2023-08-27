package com.ty;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageA extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		
		String pi=config.getInitParameter("pi");
		System.out.println("Pi is:"+pi);
		String rate=config.getInitParameter("rate");
		System.out.println("Rate is:"+rate);
		String bank=config.getInitParameter("BankName");
		System.out.println("Bank is:"+bank);
	}

}
