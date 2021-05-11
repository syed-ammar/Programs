/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class TestAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
		Bank bank = bankFactory.getBank("HDFC");
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
		Loan loan = loanFactory.getLoan("Home");
		loan.setInterestRate(2);
		double amount = loan.calculateLoan(20000);
		
		Loan perLoan = loanFactory.getLoan("Personal");
		perLoan.setInterestRate(3);
		double amount2 = perLoan.calculateLoan(20000);
		
		System.out.println("Bank name : "+bank.getBank());
		System.out.println("Total loan amount : "+amount);
		System.out.println("Total loan amount : "+amount2);
	}
}
