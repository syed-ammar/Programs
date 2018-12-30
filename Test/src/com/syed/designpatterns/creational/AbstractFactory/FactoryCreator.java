/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class FactoryCreator {

	public static AbstractFactory getFactory(String factoryName) {
		if("Bank".equalsIgnoreCase(factoryName)) {
			return new BankFactory();
		} else {
			return new LoanFactory();
		}
	}
}
