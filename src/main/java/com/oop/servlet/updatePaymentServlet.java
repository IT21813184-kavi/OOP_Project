package com.oop.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.oop.model.Payment_details;
import com.oop.util.DBConnection;


public class updatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String NIC = request.getParameter("nic");
		String Name = request.getParameter("name");
		String Email = request.getParameter("email");
		String Bankname = request.getParameter("bankname");
		String Cardname = request.getParameter("cardname");
		String Cardnumber = request.getParameter("cardnumber");
		
		boolean isTrue;
		
		isTrue = DBConnection.updatePaymentdetails(NIC, Name, Email, Bankname, Cardname, Cardnumber);
		
		if(isTrue == true) {
			
			List<Payment_details> cusDetails = DBConnection.getPaymentByCustomer(NIC);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
		else {
			List<Payment_details> cusDetails = DBConnection.getPaymentdetails(NIC);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
	}

}

	}

}
