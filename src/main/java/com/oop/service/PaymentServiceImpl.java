package com.oop.service;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.model.Payment_details;
import com.oop.util.DBConnection;

public class PaymentServiceImpl implements iPaymentService {
	  /**initialize logger*/
		public static final Logger log = Logger.getLogger(PaymentServiceImpl.class.getName());
		
		private static Connection connection;
		
		private Statement statement ;
		
		private PreparedStatement preparedStatement;
		
		/**Add a payment details*/
		public void addPaymentdetails(Payment_details payment) {
			try {
				connection = DBConnection.getDBConnection();
				preparedStatement = connection.prepareStatement("insert into Payment_details(NIC,name,email,address,city,state,bankname,cardname,cardnumber,expmonth,expyear,cvv)values (?,?,?,?,?,?,?,?,?,?,?,?)");
				connection.setAutoCommit(false);
				
				
				preparedStatement.setString(1,payment.getNIC());
				preparedStatement.setString(2,payment.getName());
				preparedStatement.setString(3,payment.getEmail());
				preparedStatement.setString(4,payment.getAddress());
				preparedStatement.setString(5,payment.getCity());
				preparedStatement.setString(6,payment.getState());
				preparedStatement.setString(7,payment.getBankname());
				preparedStatement.setString(8,payment.getCardname());
				preparedStatement.setString(9,payment.getCardnumber());
				preparedStatement.setString(10,payment.getExpmonth());
				preparedStatement.setString(11,payment.getExpyear());
				preparedStatement.setString(12,payment.getCvv());
				
				preparedStatement.execute();
				connection.commit();
				
			} catch (SQLException | ClassNotFoundException e) {
				log.log(Level.SEVERE, e.getMessage());
				System.out.println(e);
				
			} finally {
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					log.log(Level.SEVERE,e.getMessage());
					System.out.println(e);
				}
			}

			} 
				
			}

