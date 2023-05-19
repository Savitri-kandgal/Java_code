package com.xworkz.country;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/info")
public class CountryServlet extends HttpServlet{

	public CountryServlet() {
		System.out.println("CountryServlet is running in no-args constructor");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() is running for Country...");
		
		String name=req.getParameter("name");
		String code=req.getParameter("code");
		String capitalCity=req.getParameter("capitalCity");
		String population=req.getParameter("population");
		
		resp.setContentType("text/html");
		PrintWriter respWriter=resp.getWriter();
		respWriter.write("<html>");
		respWriter.write("<body>");
		respWriter.write("<h3>");
		respWriter.write("Country info");
		respWriter.write("</h3>");
		respWriter.write("<br>");
		respWriter.write(name);
		respWriter.write("<br>");
		respWriter.write(code);
		respWriter.write("<br>");
		respWriter.write(capitalCity);
		respWriter.write("<br>");
		respWriter.write(population);
		respWriter.write("<br>");
		respWriter.write("<form method='get' action='send'>");
		respWriter.write("<br>");
		respWriter.write("<h3>");
		respWriter.write("Enter prime minister name:");
		respWriter.write("</h3>");
		respWriter.write("<br>");
		respWriter.write("PM Name <input type='text' name='pmName'>");
		respWriter.write("<input type='submit' value='send'>");
		respWriter.write("</body>");
		respWriter.write("</html>");
	}
	
}
