/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class HouseLoan extends Loan{

	@Override
	public void setInterestRate(double rateT) {
		rate = rateT;
	}

}
