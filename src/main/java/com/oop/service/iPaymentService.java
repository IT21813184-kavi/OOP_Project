package com.oop.service;

import java.util.logging.Logger;

import com.oop.model.Payment_details;

public interface iPaymentService {
     /**initialize logger*/
	public static final Logger log = Logger.getLogger(iPaymentService.class.getName());
	/**Add a payment details*/
	public void addPaymentdetails(Payment_details payment);
	
	/**delete a payment details*/
	//public void deletePaymentdetails(String PID);
	
	//public Payment_details getPaymentdetails(String PID);
}
