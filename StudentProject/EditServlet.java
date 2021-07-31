package com.ust.trng;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Update Student</h1>");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		Student e=StudentDao.getStudentById(id);
		out.print("<form action='EditServlet2' method='post'>");
		out.print("table");
		out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
		out.print("<tr><td>Name:</td><td><input type='text' name='name'/></td></tr>");
		out.print("<tr><td>Password:</td><td><input type='password' name='password'/></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='email'name='email'/></td></tr>");
		out.print("<tr><td>Country:</td><td>");
		out.print("<select name='country' style='width:150px'>");
		out.print("<option>India</option>");
		out.print("<option>USA</option>");
		out.print("<option>UK</option>");
		out.print("<option>Other</option>");
		out.print("</select>");
		out.print("</td></tr>");
		out.print("<tr><td colspan='2'><input type='submit' value='Save Student'/></td></tr>");
		out.print("</table>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
