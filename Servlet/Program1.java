package com.ust.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/Program1")
public class Program1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=null;
		try {
			out=response.getWriter();
			int n=Integer.parseInt(request.getParameter("t1"));
			out.println("<center>");
			if(n%2==0)
				out.println("<font color=blue>"+ n +"is even number</font>");
			else
				out.println("<font color=green>" + n +"is odd number</font>");
			}
		catch(Exception e) {
			out.println("Error:"+e.getMessage());
		}
		finally {
			out.println("<br><br>");
			out.println("To goto main page<a href=Index.html>Click Here</a>");
			out.println("</center>");
			}
	}
	}