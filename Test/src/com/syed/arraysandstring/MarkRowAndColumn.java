package com.syed.arraysandstring;
/**
 * 
 */

/**
 * @author sammar
 *
 */
public class MarkRowAndColumn {

	private static int[][] identifyMatrixWithZeros(int[][] matrix){
		
		/*Identify rows and columns that have zeros and nullify those rows and columns later*/
		boolean[] rowCheck = new boolean[matrix.length];
		boolean[] colCheck = new boolean[matrix[0].length];

		for(int i=0;i<matrix.length ;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j] == 0) {
					rowCheck[i] = true;
					colCheck[j] = true;
				}
			}
		}
		
		for(int row=0;row<rowCheck.length;row++) {
			if(rowCheck[row])
				nullifyRows(matrix, row);
		}
		
		for(int col=0;col<colCheck.length;col++) {
			if(colCheck[col])
				nullifyColumns(matrix, col);
		}
		return matrix;
	}
	
	private static void nullifyRows(int[][] matrix, int row) {
		for(int j=0;j<matrix[0].length;j++) {
			matrix[row][j] = 0;
		}
	}
	
	private static void nullifyColumns(int[][] matrix, int col) {
		for(int i=0;i<matrix.length;i++) {
			matrix[i][col] = 0;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1 2 3 4 
		   5 6 7 8 
		   9 10 11 0 
		   12 13 14 15 */


        int[][] matrix = new int[4][4];
		int count = 1;
		System.out.println("Before : ");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
				if(i==2 && j ==3) {
					matrix[i][j]=0;
				}else {
					matrix[i][j] = count++;
				}
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		identifyMatrixWithZeros(matrix);
		
		System.out.println();
		System.out.println("After : ");
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
