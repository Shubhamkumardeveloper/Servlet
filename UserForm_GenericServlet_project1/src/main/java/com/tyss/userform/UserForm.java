package com.tyss.userform;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserForm extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String age=req.getParameter("user_age");
		
		System.out.println("Name:"+name);
		System.out.println("Email:"+email);
		System.out.println("age:"+age);
		
	}

}
