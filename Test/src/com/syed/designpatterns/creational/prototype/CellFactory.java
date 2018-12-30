/**
 * 
 */
package com.syed.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sammar
 *
 */
public class CellFactory {

	private static Map<String, TemplateCell> cellMap = new HashMap<String, TemplateCell>();	
	
	public static TemplateCell getInstance(String color) throws CloneNotSupportedException {
		TemplateCell cell = null;
		if(cellMap.containsKey(color)) {
			cell = (TemplateCell) cellMap.get(color).clone();
		} else {
			cellMap.put(color, createCell(color));
			cell = cellMap.get(color);
		}
		
		return cell;
	}
	
	private static TemplateCell createCell(String color) {
		TemplateCell cell = null;
		if("Red".equalsIgnoreCase(color)) {
			cell = new RedCell();
		} else {
			cell = new BlueCell();
		}
		
		return cell;
	}
}
