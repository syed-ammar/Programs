/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class BankFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.syed.designpatterns.creational.AbstractFactory.AbstractFactory#getBank(java.lang.String)
	 */
	@Override
	public Bank getBank(String bankName) {
		if("HDFC".equalsIgnoreCase(bankName)) {
			return new HdfcBank();
		} else if("YES".equalsIgnoreCase(bankName)) {
			return new YesBank();
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.syed.designpatterns.creational.AbstractFactory.AbstractFactory#getLoan(java.lang.String)
	 */
	@Override
	public Loan getLoan(String loanName) {
		// TODO Auto-generated method stub
		return null;
	}

}
