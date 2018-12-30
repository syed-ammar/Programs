package com.syed.designpatterns.creational.prototype;

public class TestPrototypeCell {

	public static void main(String[] args) {
		try {
			TemplateCell cell = CellFactory.getInstance("Red"); //New object
			
			System.out.println(cell.toString());
			
			cell = CellFactory.getInstance("Blue"); //New Object
			
			System.out.println(cell.toString());
			
			cell = CellFactory.getInstance("Red"); //Cloned object
			
			
			System.out.println(cell.toString());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
