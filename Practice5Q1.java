package com.java.FlipRobo;

import java.util.Arrays;

/*
 * Given an array of integers nums sorted in non-decreasing order, 
 * find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity. 
 */

public class Practice5Q1 {
	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,4,7,7,89,91,91};
		int target = 91;
		int out[] = new int[2];
		
		System.out.println(Arrays.toString(arr));
		System.out.println(target);
		
		int j=0;
		for(int i=0; i<arr.length && j==0; i++) {
			if(arr[i] == target && j==0) {
				out[j] = i;
				out[j+1] = i+1;
				j++;
			}
			else
				{
				out[j] = -1;			
				out[j+1] = -1;
				}
		}
		
		System.out.println(Arrays.toString(out));
	}

}
