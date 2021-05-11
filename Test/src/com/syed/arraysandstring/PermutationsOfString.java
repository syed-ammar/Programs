package com.syed.arraysandstring;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author sammar
 *
 */
public class PermutationsOfString {

	private static final Set<String> strSet = new HashSet<String>();
	
	public static void permute(String str, int start, int end) {
		
		if(str.isEmpty()) {
			return;
		}
		if(start == end) {
			System.out.println(str);
			strSet.add(str);
		}
		
		/* Here we swap one character and call permute recursively 
		 * for remaining string keeping the swaped character
		 * constant*/
		for(int i = start ; i<end ; i++) {
			str = swap(str,start, i);
			permute(str, start+1, end);
			//str = swap(str,start, i);
		}
	}
	
	private static String swap(String str, int fromIndex, int toIndex) {
		char[] a = str.toCharArray();
		char temp = a[fromIndex];
		a[fromIndex] = a[toIndex];
		a[toIndex] = temp;
		
		return String.copyValueOf(a);
	}
	
	public static void main(String[] args) {
		String str = "abcd";
		permute(str, 0, str.length());
		System.out.println("Size of set : "+strSet.size());
	}
}
