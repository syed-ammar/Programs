/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public abstract class AbstractFactory {

	public abstract Bank getBank(String bankName);
	
	public abstract Loan getLoan(String loanName);
}
