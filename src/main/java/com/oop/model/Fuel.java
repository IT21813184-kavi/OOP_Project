package com.oop.model;

/**
 * This is the Fuel model class
 */
public class Fuel {
	/*
	 * Declaring class variables
	 */
	private String Fuel_type;
	private String tot_amount;
	
	/*
	 * constructor for Fuel
	 */
	public Fuel(String fuel_type, String tot_amount) {
		super();
		Fuel_type = fuel_type;
		this.tot_amount = tot_amount;
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
	 * return total fuel amount
	 */
	public String getTot_amount() {
		return tot_amount;
	}

	/*
	 * Assign total fuel amount
	 */
	public void setTot_amount(String tot_amount) {
		this.tot_amount = tot_amount;
	}
	
	/*
	 * return string with details
	 */
	public String toString() {
		return "Fuel Type = " + Fuel_type + "\n" + "Available Fuel amount = " + tot_amount + "\n";
	}
	
}
