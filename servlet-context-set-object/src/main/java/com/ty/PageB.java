package com.ty;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageB extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		
		Object o=context.getAttribute("myAninaml");
		if(o!=null)
		{
			Animal a=(Animal)o;
			System.out.println("======Page B executed...=======");
			System.out.println("Name:"+a.name);
			System.out.println("Age:"+a.age);
			System.out.println("Height:"+a.height);
		}
		
		
	}

}
