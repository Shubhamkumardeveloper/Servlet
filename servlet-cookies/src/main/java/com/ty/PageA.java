package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/page-a")
public class PageA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie cookie=new Cookie("pi","3.14");//cookie object create in server side;
		resp.addCookie(cookie); //cookie added into the response object...
		
		Cookie cookie2=new Cookie("user","priya");//cookie object create in server side;
		resp.addCookie(cookie2); 
		
		PrintWriter p=resp.getWriter();
		p.print("<h1>Cookie created...</h1>");//print the messsage into the browser
		
		System.out.println("Cookie is created and addes into response..");//printing the message on the console
	
		//go to browser setting ==>click on privacy and security ==>click on cookies and other site data==>
		//see al site data and presmissions==> search localhost(not using other server)... see one cookie is created
		
		//now delete... now send the request once again..again follow the same step and search localhost agin...
	}
}
