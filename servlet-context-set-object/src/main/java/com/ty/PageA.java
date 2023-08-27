package com.ty;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageA extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  ServletContext context=getServletContext();
	  
	  Animal animal=new Animal();
	  animal.name="Dimple";
	  animal.age=22;
	  animal.height=1.34;
	  
	  //set the object into the object
	  context.setAttribute("myAninaml", animal);
	  System.out.println("===========Page A executed===========");
	}

}
