/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class PersonalLoan extends Loan{

	@Override
	public void setInterestRate(double rateT) {
		rate = rateT;
	}

}
