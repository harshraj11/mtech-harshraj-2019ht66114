package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class QuadServlet extends HttpServlet
{
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
		HttpSession sessionobj = req.getSession();
		int t= (int) sessionobj.getAttribute("k");
		
		PrintWriter obj = res.getWriter();
		obj.println("Hello to QuadServlet for Session Example in sendRedirect");
		obj.println("result for cube is "+t);
    }

}
