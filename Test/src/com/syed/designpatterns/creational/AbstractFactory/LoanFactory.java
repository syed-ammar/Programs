/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class LoanFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.syed.designpatterns.creational.AbstractFactory.AbstractFactory#getBank(java.lang.String)
	 */
	@Override
	public Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.syed.designpatterns.creational.AbstractFactory.AbstractFactory#getLoan(java.lang.String)
	 */
	@Override
	public Loan getLoan(String loanName) {
		if("Home".equalsIgnoreCase(loanName)) {
			return new HouseLoan();
		} else if ("Personal".equalsIgnoreCase(loanName)) {
			return new PersonalLoan();
		}
		return null;
	}

}
