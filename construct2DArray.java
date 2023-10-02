	/* Convert 1D Array Into 2D Array
	 You are given a 0-indexed 1-dimensional (1D) integer array original, 
	 and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with 
	  m rows and n columns using all the elements from original.
	  The elements from indices 0 to n - 1 (inclusive) of original should form the 
	  first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (inclusive)
	   should form the second row of the constructed 2D array, and so on.

	Return an m x n 2D array constructed according to the above procedure, or an empty 2D array
 	if it is impossible.
	 */

package com.java.FlipRobo;

import java.util.Arrays;

public class construct2DArray {
	
	public int[][] fn(int[] original, int m, int n){
		int[][] ans = new int[m][n];
		int x=0;
		for(int y=0; y<m; y++) {
			for(int z=0; z<n; z++) {
				ans[y][z] = original[x];
				x++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		construct2DArray obj = new construct2DArray();
		
		int[] original = {1,2,3,4};
		int m=2, n=2;
		int[][] result;
		result = obj.fn(original, m, n);
		System.out.println(Arrays.deepToString(result));
	}
}
