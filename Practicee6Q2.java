package com.java.FlipRobo;

import java.util.Arrays;

public class Practicee6Q2 {

	/*A permutation of an array of integers is an arrangement of its members into a sequence or
	 *    linear order.
		
		For example, for arr = [1,2,3], the following are all the permutations of 
		arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
		For example, the next permutation of arr = [1,2,3] is [1,3,2].
		Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
		While the next permutation of arr = [3,2,1] is [1,2,3] 
		because [3,2,1] does not have a lexicographical larger rearrangement.
	 */
		
		static void fn(int n, int ar1[]) {
			int temp = 0;
			temp = ar1[n];
			ar1[n] = ar1[n+1];
			ar1[n+1] = temp;		
		}
		
		static void fn1(int n, int ar1[]) {
			int temp = 0;
			temp = ar1[n];
			ar1[n] = ar1[n+2];
			ar1[n+2] = temp;		
		}

		public static void main(String[] args) {
			
			Practicee6Q2 obj = new Practicee6Q2();
			
			//int ar[]= {3,2,1};
			//op = {1,2,3}
			
			int ar1[]= {1,2,3};  //op = {1,3,2}  2,1,3,
			int i=0, j=1, temp=0;
			
			System.out.println(Arrays.toString(ar1));
			
			if(ar1[i] < ar1[j] && ar1[i]<ar1[j+1]) {
				if(ar1[j] < ar1[j+1]) {
					
					fn(j, ar1);
				}
					
				else {
					
					fn(j, ar1);
					
					fn(i, ar1);
				}
			}
			else   
			{
				if(ar1[i] > ar1[j] && ar1[j]<ar1[j+1] ) {
					if(ar1[j] < ar1[j+1]) {
						
						fn(j, ar1);
					}
					
				}
				else {	
					if(ar1[i] > ar1[j] && ar1[j] > ar1[j+1]) {
						
						fn1(i,ar1);
					}
					else {  
						if(ar1[i] < ar1[j] && ar1[j] > ar1[j+1]) {
							
							fn1(i,ar1);
							
							fn(i, ar1);
						}
					}
				}
			}
			
			System.out.println(Arrays.toString(ar1));
		}
	}

