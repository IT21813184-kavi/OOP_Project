package com.oop.model;

/**
 * This is the Fuel model class
 */
public class Fuel_order {
	/*
	 * Declaring class variables
	 */
	private String Fuel_type;
	private String orderNum;
	private String orderAmount;
	private String orderDate;
	
	/*
	 * constructor for Fuel order
	 */
	public Fuel_order(String fuel_type, String orderNum, String orderAmount, String orderDate) {
		super();
		Fuel_type = fuel_type;
		this.orderNum = orderNum;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}

	/*
	 * return fuel type
	 */
	public String getFuel_type() {
		return Fuel_type;
	}

	/*
	 * Assign fuel type
	 */
	public void setFuel_type(String fuel_type) {
		Fuel_type = fuel_type;
	}

	/*
	 * return order number
	 */
	public String getOrderNum() {
		return orderNum;
	}

	/*
	 * Assign Order number
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	/*
	 * return order amount
	 */
	public String getOrderAmount() {
		return orderAmount;
	}

	/*
	 * Assign order amount
	 */
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	/*
	 * return ordered date
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/*
	 * Assign ordered date
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	/*
	 * return details as string
	 */
	public String toString() {
		return "Fuel type = " + Fuel_type + "\n" + "Order number = " + orderNum + "\n" + "Order amount = " + orderAmount + "\n"
				+ "Order date = " + orderDate + "\n";
	}
}
