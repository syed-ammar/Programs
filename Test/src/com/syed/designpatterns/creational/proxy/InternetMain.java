/**
 * 
 */
package com.syed.designpatterns.creational.proxy;

/**
 * @author sammar
 *
 */
public class InternetMain implements Internet {

	/* (non-Javadoc)
	 * @see com.syed.designpatterns.creational.proxy.Internet#connect(java.lang.String)
	 */
	@Override
	public void connect(String website) {
		System.out.println("Connected to... "+website);
	}
	
	protected InternetMain() {
		super();
	}
}
