/**
 * 
 */
package com.syed.designpatterns.creational.prototype;

/**
 * @author sammar
 *
 */
public abstract class TemplateCell implements Cloneable{

	protected String color;

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("TemplateCell clone called");
		return super.clone();
	}


	@Override
	public String toString() {
		return "TemplateCell [color=" + color + "]";
	}
	
	
}
