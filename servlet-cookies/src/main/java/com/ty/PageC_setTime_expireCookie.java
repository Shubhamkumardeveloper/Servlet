package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value ="/page-c")
public class PageC_setTime_expireCookie {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c= req.getCookies();
		
		for(Cookie ck:c)
		{
			String name=ck.getName();
			String value=ck.getValue();
			
			if(name.equals("user"))
			{
				ck.setMaxAge(0);
				ck.setValue("");
			}
			
			System.out.println(ck.getName()+"====>"+ck.getValue());
		}
	}

}
