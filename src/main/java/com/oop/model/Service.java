package com.oop.model;

/**
 * This is the Service model class
 */
public class Service {
	/*
	 * Declaring class variables
	 */
	private String NIC;
	private String vehicleLetters;
	private int vehicleNum;
	private int serviceType;
	private String date;
	private String time;
	
	/*
	 * constructor for Service
	 */
	public Service(String nIC, String vehicleLetters, int vehicleNum, int serviceType, String date, String time) {
		NIC = nIC;
		this.vehicleLetters = vehicleLetters;
		this.vehicleNum = vehicleNum;
		this.serviceType = serviceType;
		this.date = date;
		this.time = time;
	}

	/*
	 * return NIC
	 */
	public String getNIC() {
		return NIC;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	
	/*
	 * return NIC
	 */
	public String getVehicleLetters() {
		return vehicleLetters;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setVehicleLetters(String vehicleLetters) {
		this.vehicleLetters = vehicleLetters;
	}
	
	/*
	 * return NIC
	 */
	public int getVehicleNum() {
		return vehicleNum;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setVehicleNum(int vehicleNum) {
		this.vehicleNum = vehicleNum;
	}
	
	/*
	 * return NIC
	 */
	public int getServiceType() {
		return serviceType;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}
	
	/*
	 * return NIC
	 */
	public String getDate() {
		return date;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
	/*
	 * return NIC
	 */
	public String getTime() {
		return time;
	}
	
	/*
	 * Assign NIC value
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	/*
	 * return string with details
	 */
	public String toString() {
		String servtype = null;
		
		if(serviceType == 1)
			servtype = "Full Service";
		else if(serviceType == 2)
			servtype = "Full Body wash";
		
		return "Customer NIC = " + NIC + "\n" + "Vehicle Letters = " + vehicleLetters + "\n" + "Vehicle Numbers = " + vehicleNum + "\n"
				+ "Service type = " + servtype + "\n" + "Service date = " + date + "\n" + "Service time = "
				+ time + "\n";
	}	
	
}
