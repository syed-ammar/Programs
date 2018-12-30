package com.syed.arraysandstring;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author sammar
 *
 */
public class CheckIfStrIsPermutOfOther {

	private static boolean checkPermutation(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(String.valueOf(c1).equalsIgnoreCase(String.valueOf(c2))) {
			return true;
		}
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checkPermutation("Ammar", "rammA"));
	}

}
