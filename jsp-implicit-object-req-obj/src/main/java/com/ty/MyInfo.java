package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/info")
public class MyInfo  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//what some information to jsp page..
		Student s=new Student();
		s.setId(101);
		s.setEmail("Priya@gmail.com");
		s.setName("Priya");
		
		req.setAttribute("my_student", s);
		
		//forward the info to jsp
		RequestDispatcher r=req.getRequestDispatcher("studentInfo.jsp");
		r.forward(req, resp);
	}

}
