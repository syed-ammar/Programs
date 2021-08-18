package com.syed.arraysandstring; /**
 * 
 */

/**
 * @author sammar
 *
 */
public class FindWordInMatrix
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = {{'F', 'A', 'C', 'I'},
						{'O', 'B', 'Q', 'P'},
						{'A', 'N', 'O', 'B'},
						{'M', 'A', 'S', 'S'}};
		String word = "FOAM";
		char[] wordArray = word.toCharArray();
		System.out.println(findWorkInAMatrix(arr, 4, 4, wordArray));

	}

	private static boolean findWorkInAMatrix(char[][] arr, int rSize, int cSize, char[] word) {

		boolean fullLength = true;
		int indexW = 0; 
		boolean found = false;

		/* Search in rows*/
		for(int i = 0; i<rSize ; i++) {
			int col = 0;
			indexW = 0;
			if(word.length < rSize)
				fullLength = false;

			while(indexW < word.length && col < cSize) {
				if(arr[i][col] != word[indexW]) {
					if(fullLength) {
						break;
					} else {
						col++;
					}
				} else {
					col++;
					indexW++;
				}
			}
			if(indexW == word.length) {
				found = true;
				break;
			}
		}

		/* Search in columns*/
		if(!found) {
			for(int i = 0; i<cSize ; i++) {
				int row = 0;
				indexW = 0;
				if(word.length < cSize)
					fullLength = false;

				while(indexW < word.length && row < cSize) {
					if(arr[row][i] != word[indexW]) {
						if(fullLength) {
							break;
						} else {
							row++;
						}
					} else {
						row++;
						indexW++;
					}
				}
				if(indexW == word.length) {
					found = true;
					break;
				}
			}
		}
		return found;
	}

}
