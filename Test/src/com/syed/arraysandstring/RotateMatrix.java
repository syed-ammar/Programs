package com.syed.arraysandstring;

public class RotateMatrix {

	private static int[][] rotateMatrix(int[][] matrix, int size) {
		int first = 0, last = 0;
		for(int layer=0; layer < size/2 ; layer++) {
			last = size -1 - layer;
			for(int i = layer ; i < last ; i++) {
				int offset = last - i; /* Index to keep track of outermost elements to swap*/
				//Save top 
				int top = matrix[layer][i];
				
				//swap top with left
				matrix[layer][i] = matrix[offset][layer];
				
				//swap left with bottom
				matrix[offset][layer] = matrix[last][offset];
				
				//swap bottom with right
				matrix[last][offset] = matrix[i][last];
				
				//swap right with top
				matrix[i][last] = top;
				
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		/*
		 * 1	2	3 	4
		 * 5 	6	7	8
		 * 9	10	11	12
		 * 13	14	15	16*/
        int[][] matrix = new int[4][4];
		int count = 1;
		System.out.println("Before rotating : ");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				matrix[i][j] = count++;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		rotateMatrix(matrix, 4);
		System.out.println();
		System.out.println("After rotating : ");
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
