/**
 * 
 */
package com.syed.designpatterns.creational.prototype;

/**
 * @author sammar
 *
 */
public class BlueCell extends TemplateCell {

	public BlueCell() {
		color = "Blue";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BlueCell [color=" + color + "]";
	}
}
