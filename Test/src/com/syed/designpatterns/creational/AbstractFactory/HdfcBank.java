/**
 * 
 */
package com.syed.designpatterns.creational.AbstractFactory;

/**
 * @author sammar
 *
 */
public class HdfcBank implements Bank{

	private String bankName;
	
	public HdfcBank() {
		this.bankName = "HDFC"; 
	}

	@Override
	public String getBank() {
		return this.bankName;
	}
}
