package com.java.FlipRoboHW1;

import java.util.Arrays;

/*Given an array of integers nums and an integer target, return indices of the 
 two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.*/
/*
  Input: nums = [2,7,11,15], target = 9
Output: [0,1] , index 0,1  ==  2,7*/
 
public class Practice3Q2 {
	public static void main(String[] args) {
		
		int arr1[] = {2,7,11,15};
		int target = 22;
		
		int arr2[] = new int[2], j=0;
		
		for(int i=0; i<arr1.length; i++) {
			for(int k=1; k<arr1.length; k++) {
				if(((arr1[i] + arr1[k]) == target) && (i!=k)) {
					arr2[j]=i;
					arr2[j+1]=k;
					
				}
			}	
		}	
		
		System.out.println(Arrays.toString(arr2));
	}
}
