package com.syed.arraysandstring;
/**
 * 
 */

/**
 * @author sammar
 *
 */
public class UniqueCharsInString {

	private static boolean checkIfStringIsUnique(String str) {
		boolean[] char_val = new boolean[256]; 
		for(int i=0;i< str.length();i++) {
			if(char_val[str.charAt(i)])
				return false;
			
			char_val[str.charAt(i)] = true;
		}
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Ammar";
		System.out.println(checkIfStringIsUnique(str));
	}

}
