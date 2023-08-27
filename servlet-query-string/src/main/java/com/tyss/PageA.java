package com.tyss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/page-a")
public class PageA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter p=resp.getWriter();
		String id=req.getParameter("id");
		System.out.println(id);
		
		p.print("<h1>Hii I am page A</h1>");
		p.print("<h2> my id is:"+id+"</h2>");
		
	}

}
