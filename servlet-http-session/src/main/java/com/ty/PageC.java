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
public class PageC extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		
		User user =(User)session.getAttribute("myUser");
		
		PrintWriter p=resp.getWriter();
		p.print("<h1>User Detail:</h1>");
		p.print("<h1>User Name:"+user.name+"</h1>");
		p.print("<h1>User Email:"+user.email+"</h1>");
		p.print("<h1>User Phone:"+user.phone+"</h1>");
		p.print("<h1>User Age:"+user.age+"</h1>");
		
	}

}
