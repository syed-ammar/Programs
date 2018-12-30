/**
 * 
 */
package com.syed.designpatterns.creational.prototype;

/**
 * @author sammar
 *
 */
public class RedCell extends TemplateCell {

	public RedCell() {
		color = "Red";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RedCell [color=" + color + "]";
	}

}
