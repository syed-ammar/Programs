/**
 * 
 */

/**
 * @author sammar
 *
 */
public class MinimumDistBwChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abdhgjkepqrae";
		int minLen = 0;
		int currInd1 = 0, currInd2 =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a') {
				currInd1 = i;
			}
			if(str.charAt(i) == 'e') {
				currInd2 = i;
			}
			
			if(minLen == 0) {
				minLen = Math.abs(currInd2 - currInd1);
			}else if(minLen > (currInd2 - currInd1)) {
				minLen = Math.abs(currInd2 - currInd1);
			}
			
		}
		System.out.println("Min distance : "+minLen);
	}

}
