package com.xworkz.state;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class Karnataka extends HttpServlet {

	public Karnataka() {
		System.out.println("Karnataka is running...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet() running for Karnataka...");

		RequestDispatcher reqDis = req.getRequestDispatcher("/display.jsp");
		reqDis.forward(req, resp);

	}
}




















/*
 * service() of servlet class wl internally call service() of jsp we hv to
 * override doGet() / doPost() in our servlet class
 * 
 * 
 * HTTP methods GET - disadvantage 1. Carry data in url 2. limited to chars(8000
 * chars)
 * 
 * POST - advantage 1. not carry data in url 2. supported for unlimited chars
 * 
 * C - POST R - GET U - PUT D - DELETE
 * 
 * we can use only get & post using html if we use put & delete then we should
 * use JS
 * 
 * method should be match in both client and server side ex: if we use GET in
 * form tag then we hv to override the doGet() in servlet class
 */


