package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CubeServlet extends HttpServlet
{
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
		//sendredirect processing
		int k = Integer.parseInt(req.getParameter("k"));
		
		HttpSession sessionobj = req.getSession();
		int t= (int) sessionobj.getAttribute("k");
		
		PrintWriter obj = res.getWriter();
		obj.println("Hello to CubeServlet for sendRedirect Example");
		obj.println("result for multiply is "+k);
		obj.println("result for cube is "+t);
    }
	
}
