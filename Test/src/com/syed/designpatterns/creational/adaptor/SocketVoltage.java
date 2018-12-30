/**
 * 
 */
package com.syed.designpatterns.creational.adaptor;

/**
 * @author sammar
 *
 */
public abstract class SocketVoltage {

	public Volt getMainVoltage() {
		return new Volt(240);
	}
	
	public abstract Volt getMainVoltageFor120();
}
