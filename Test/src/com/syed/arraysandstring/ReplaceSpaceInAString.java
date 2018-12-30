package com.syed.arraysandstring;
/**
 * 
 */

/**
 * @author sammar
 *
 */
public class ReplaceSpaceInAString {

	private static String replaceSpaces(String str) {
		 return str.replace(" ", "%20");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Mr Syed  Ammar";
		System.out.println(replaceSpaces(str));
	}

}
