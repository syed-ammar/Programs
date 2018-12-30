/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class YesBank implements Bank{

	private String bankName;
	
	public YesBank() {
		this.bankName = "YES";	
	}

	@Override
	public String getBank() {
		return this.bankName;
	}
}
