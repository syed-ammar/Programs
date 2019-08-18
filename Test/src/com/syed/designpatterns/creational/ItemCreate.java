/**
 * 
 */
package com.syed.designpatterns.creational;

/**
 * @author sammar
 *
 */
public class ItemCreate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item item = new Item.ItemBuilder().setItemName("iPhone").setCategory("Electronics").setCost(50000).build();
		Item item1 = new Item.ItemBuilder().setItemName("OnePlus").setCategory("Electronics").setCost(35000).build();
		System.out.println(item1);
		System.out.println(item);
	}

}
