package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BMIResult  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		double value=(Double)req.getAttribute("value");
		double weight=(Double)req.getAttribute("weight");
		double height=(Double)req.getAttribute("height");
		
		String result="";
		if(value<18)
		{
			result="under weight";
		}
		else if (value>=18 && value<25) {
			result="Normal";
		}
		else if (value>=25 && value<30) {
			result="Over Weight";
		}
		else
			result="Obese";
		
		PrintWriter p=resp.getWriter();
		p.print("<html><body>");
		p.print("<h1> Weight is:"+ weight+"</h1>");
		p.print("<h1> height is:"+ height+"</h1>");
		p.print("<h1> Calculate BMT value is:"+ value+"</h1>");
		p.print("<h1> BMI result is:"+ result+"</h1>");
		p.print("</body></html>");
	}
}
