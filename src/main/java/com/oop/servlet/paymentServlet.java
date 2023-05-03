package com.oop.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.oop.model.Payment_details;
import com.oop.service.PaymentServiceImpl;
import com.oop.service.iPaymentService; 

public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Payment_details payment = new Payment_details();
		
		payment.setNIC(request.getParameter("NIC"));
		payment.setName(request.getParameter("firstname"));
		payment.setEmail(request.getParameter("email"));
		payment.setState(request.getParameter("state"));
		payment.setZip(request.getParameter("zip"));
		payment.setBankname(request.getParameter("bankname"));
		payment.setCardname(request.getParameter("cardname"));
		payment.setCardnumber(request.getParameter("cardnumber"));
		payment.setExpmonth(request.getParameter("expmonth"));
		payment.setExpyear(request.getParameter("expyear"));
		payment.setCvv(request.getParameter("cvv"));
		
		
		iPaymentService iaddpaymentservice = new PaymentServiceImpl();
		iaddpaymentservice.addPaymentdetails(payment);
		
		
		
		
	}

}
