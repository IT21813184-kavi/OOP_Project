package com.oop.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import com.oop.service.PaymentServiceImpl;
import com.oop.service.iPaymentService;

/**
 * Servlet implementation class loadPaymentServlett
 */
public class loadPaymentServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		RequestDispatcher login = getServletContex().getRequestDispacher("/");
		RequestDispatcher  = getServletContex().getRequestDispacher("/");
		
		if(session.getAttribute("logstat") !=null) {
			Customer customer = (Customer) session.getAttribute(customer);
			String NIC = customer.getNic();
			char type = NIC.charAt(0);
			if(type=='A') {
				System.out.println("logged in as customer");
				
			}
		}
		else {
			System.out.println("login failed");
			
		}
		
	}
	else {
		System.out.println("not logegd in");
		
	}
	
	Customer cus = (Customer) session.getAttribute("customer");
	
	iPaymentService igetPaymentlist = new PaymentServiceImpl();
	ArrayList<Payment> paymentlist = igetPaymentlist.
	request.setAttribute("paymentlist",paymentlist);
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request,response);
}
