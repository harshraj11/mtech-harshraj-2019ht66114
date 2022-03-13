package com.learn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Cookie1Servlet extends HttpServlet{
	
	public void service (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
    {
		// sendRedirect Example using cookie
    	int i = Integer.parseInt(req.getParameter("num1"));
    	int j = Integer.parseInt(req.getParameter("num2"));
    	
    	int k = i*j;
    	System.out.println("result is "+ k);
        
    	Cookie obj = new Cookie("k", k+"");
    	res.addCookie(obj);
    	
    	res.sendRedirect("cookie2");  
    	
    
    }

}
