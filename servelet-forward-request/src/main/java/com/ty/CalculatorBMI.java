package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorBMI extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String height=req.getParameter("height");
		String weight=req.getParameter("weight");
		
		double height1=Double.parseDouble(height);
		double weight1=Double.parseDouble(weight);
		
		double value=weight1/(height1*height1);
		
//		System.out.println(height+" " +weight);
		req.setAttribute("value", value);//key value
		req.setAttribute("weight", height1);//object
		req.setAttribute("height", weight1);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("bmiresult");
		dispatcher.forward(req, resp);
	}

}
