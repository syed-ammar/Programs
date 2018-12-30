/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public abstract class Loan {

	protected double rate;
	
	public abstract void setInterestRate(double rate);
	
	public double calculateLoan(double amount) {
		return amount*rate;
	}
}
