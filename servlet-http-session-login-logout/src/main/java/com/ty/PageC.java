package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/page-c")
public class PageC  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter p=resp.getWriter();
		HttpSession session=req.getSession();
		String userName=(String)session.getAttribute("userName");
		if(userName!=null)
		{
			p.print("<h1>Page c</h1>");
		}
		else
			p.print("<h1>please login to view content</h1>");
		
	}
}
