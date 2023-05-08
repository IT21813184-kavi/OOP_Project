package com.oop.service;

import java.util.ArrayList;
import java.util.logging.Logger;

import com.oop.model.Payment_details;

public interface iPaymentService {
     /**initialize logger*/
	public static final Logger log = Logger.getLogger(iPaymentService.class.getName());
	/**Add a payment details*/
	public void addPaymentdetails(Payment_details payment);
	
	/**Get Payment details*/
	 public static ArrayList<Payment_details> getPaymentByCustomer(String NIC){
	    	ArrayList<Payment_details> arrayList = new ArrayList<Payment_details>();
	 }
    	
    	/**update Payment details*/
    public void updatePaymentdetails(Payment_details payment);
    
	/**delete a payment details*/
	//public void deletePaymentdetails(String PID);
	
	
}
