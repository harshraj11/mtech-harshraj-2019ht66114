package com.learn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SubServlet extends HttpServlet{
	
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
    {
		// sendRedirect Example
    	int i = Integer.parseInt(req.getParameter("num1"));
    	int j = Integer.parseInt(req.getParameter("num2"));
    	
    	int k = i*j;
    	System.out.println("result is "+ k);
        
    	HttpSession obj = req.getSession();
    	obj.setAttribute("k", k*k*k);
    	
    	res.sendRedirect("cube?k="+k);  
    	// This concept of passing the value to another servlet is called URL Rewriting
    
    }

}
