package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("Hii... I'm called!");
		PrintWriter prWriter= res.getWriter();
		prWriter.println("<html><body>");
		prWriter.println("<h1>Hii....I'm called...</h1>");
		prWriter.println("</body></html>");
	}

}
