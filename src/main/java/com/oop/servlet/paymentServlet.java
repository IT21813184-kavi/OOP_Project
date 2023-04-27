package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("firstname");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String bankname = request.getParameter("bankname");
		String cardname  = request.getParameter("cardname");
	    String cardnumber = request.getParameter("cardnumber");
		String expmonth = request.getParameter("expmonth");
		String expyear = request.getParameter("expyear");
		String cvv = request.getParameter("cvv");
		
		
		boolean isTrue;
		
		isTrue = .insertcustomer(name, email, address, city, state, zip, bankname, cardname, cardnumber, expmonth, expyear,cvv);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
