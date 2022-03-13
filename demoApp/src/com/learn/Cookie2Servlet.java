package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Cookie2Servlet extends HttpServlet
{
	public void doGet (HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
		int k=0;
		Cookie cook[] = req.getCookies();
		
		for (Cookie c:cook)
		{
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter obj = res.getWriter();
		obj.println("Hello to Cookie2Servlet for Cookie Example in sendRedirect");
		obj.println("result is "+k);
    }
}
