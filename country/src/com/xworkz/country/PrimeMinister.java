package com.xworkz.country;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class PrimeMinister extends HttpServlet{

	public PrimeMinister() {
		System.out.println("PrimeMinister is running in no-args constructor...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() for Prime Minister...");
		
		String pm=req.getParameter("pmName");
		System.out.println("pm name: "+pm);
		
		resp.setContentType("text/html");
		PrintWriter respWriter=resp.getWriter();
		respWriter.write("<html>");
		respWriter.write("<body>");
		respWriter.write("<h3>");
		respWriter.write("PM info");
		respWriter.write("</h3>");
		respWriter.write("Name: "+pm);
		respWriter.write("<br><br>");
		respWriter.write("<h3><a href='index.html'>Home</a></h3>");
		respWriter.write("</body>");
		respWriter.write("</html>");
		
	}
}
