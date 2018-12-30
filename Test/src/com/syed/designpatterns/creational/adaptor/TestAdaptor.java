package com.syed.designpatterns.creational.adaptor;

public class TestAdaptor {

	public static void main(String[] args) {
		SocketAdaptor adaptor = new SocketAdaptorImpl();
		System.out.println("Charging with "+adaptor.chargePhone().getVoltage()+" volts");
	}

}
