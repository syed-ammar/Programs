package com.syed.arraysandstring;
/**
 * 
 */

/**
 * @author sammar
 *
 */
public class ShrinkTheString {

	private static String shrinkTheString(String source) {
		int count = 0;
		StringBuffer sb = new StringBuffer();
		char[] s = source.toCharArray();
		for(int i=0; i<s.length;i++) {
			if((i+1)<s.length && s[i] == s[i+1]) {
				count++;
			} else {
				count++;
				sb.append(s[i-1]).append(count);
				count = 0;
			}
		}

		return sb.toString().length() >= source.length()? source : sb.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aabbcccccccee";
		System.out.println(shrinkTheString(str));
	}

}
