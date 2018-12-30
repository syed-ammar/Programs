/**
 * 
 */
package com.syed.designpatterns.creational.adaptor;

/**
 * @author sammar
 *
 */
public class SocketAdaptorImpl extends SocketVoltage implements SocketAdaptor{

	@Override
	public Volt chargePhone() {
		return convert(getMainVoltage(), 80);
	}

	private Volt convert(Volt volt, int conversionFactor) {
		return new Volt(volt.getVoltage()/conversionFactor);
	}

	@Override
	public Volt getMainVoltageFor120() {
		// TODO Auto-generated method stub
		return null;
	}
}
