/**
 * 
 */
package com.syed.designpatterns.creational.proxy;

/**
 * @author sammar
 *
 */
public class TestProxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Internet inter = new InternetProxy();
		inter.connect("abc.com");
		inter.connect("google.com");
	}

}
