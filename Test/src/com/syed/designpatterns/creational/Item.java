/**
 * 
 */
package com.syed.designpatterns.creational;

/**
 * @author sammar
 *
 */
public class Item {

	private String itemName;
	
	private double cost;
	
	private String category;
	
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", cost=" + cost + ", category=" + category + "]";
	}

	public static class ItemBuilder{
		private final Item item = new Item();
		
		public ItemBuilder setItemName(String name) {
			item.itemName = name;
			return this;
		}
		
		public ItemBuilder setCost(double cost) {
			item.cost = cost;
			return this;
		}
		
		public ItemBuilder setCategory(String category) {
			item.category = category;
			return this;
		}
		
		/*Here before returning i am setting the inner item object to new object so that user
		 cannot modify the existing object after it is built */
		
		public Item build() {
			/*Item tempItem = this.item;
			this.item = new Item();*/
			return this.item;
		}
	}
}
