package com.xworkz.favoratethings.favorate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fav")
public class Favorate extends HttpServlet {

	public Favorate() {
		System.out.println("Favorate is running in no-args constructor...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() is running...");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost() is running...");
		// request scope (setting value for sending data from immediate servlet/jsp
		req.setAttribute("food", req.getParameter("food"));
		req.setAttribute("place", req.getParameter("place"));
		req.setAttribute("person", req.getParameter("person"));

		String[] laptopBrand = new String[3];
		laptopBrand[0] = "HP";
		laptopBrand[1] = "DELL";
		laptopBrand[2] = "LENOVO";

		req.setAttribute("brand1", laptopBrand[0]);
		req.setAttribute("brand2", laptopBrand[1]);
		req.setAttribute("brand3", laptopBrand[2]);

		RequestDispatcher reqDis = req.getRequestDispatcher("/infoDisplay.jsp");
		reqDis.forward(req, resp);
	}

}


/*
 * 2 ways to get the property value from servlet to jsp 
 * 1.expression tag <%= %> - drawback is if we want to change the technology in future we hv to change the entire code 
 * 2.hence the new lang came into picture called expression lang ${}
 * 
 * servlet life cycle
 * new - init - service - destroy
 * new - called only one time - while creating an obj (loadonstartup or when first request comes)
 * init - called only one time while initializing resource(external system - connection)
 * service - called for each request comes
 * destroy - called only one time while shut down the server
 */





