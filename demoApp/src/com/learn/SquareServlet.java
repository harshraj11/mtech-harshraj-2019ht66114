package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet
{
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
		//requestDispatcher processing
		int k = (int) req.getAttribute("k");
		PrintWriter obj = res.getWriter();
		obj.println("Hello to Square for requestDispatcher processing");
		obj.println("result for multiply is "+k);
		
    }
}
