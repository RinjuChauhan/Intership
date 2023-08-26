package com.java.FlipRobo;

import java.util.Arrays;

public class Pratice4Q {
	
	public static void main(String[] args) {
		
		int m=3, n=3, k=6;
		int num1[] = {4,6,7,0,0,0};
		int num2[] = {3,8,9};
		
		// output = {3,4,6,7,8,9}
		/* if num1[i] > num2[j] replace + shift + increase j || or as it is			
		
		*/
		int j =0, temp;
		for(int i=0; i<num1.length && j<n; i++) {
			
			if(num1[i] > num2[j]) {
				
				while( k>1) {
					num1[k-1] = num1[k-2];
					k--;
				}
				
				temp = num1[i];
				num1[i] = num2[j];
				j++;
			}
									
			if(num1[i]==0 && j<n) {	
					num1[i] = num2[j];
					j++;				
				
					}
				
		}
		
		System.out.println(Arrays.toString(num1));	
		System.out.println(j);
		
	}

}
