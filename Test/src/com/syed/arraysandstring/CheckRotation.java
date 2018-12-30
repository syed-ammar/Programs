package com.syed.arraysandstring;
/**
 * 
 */

/**
 * @author sammar
 *
 */
public class CheckRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "WaterBottle";
		String s2 = "erBottleWat";
		
		//System.out.println(s2.substring(0, s2.indexOf("W")));
		
		/*Method 1*/
		isSubString(s2.substring(0, s2.indexOf(s1.charAt(0))), s1);
		
		/*Method 2*/
		isSubString(s1+s1, s2);
		
	}
	
	private static boolean isSubString(String source, String dest) {
		return false;
	}

}
