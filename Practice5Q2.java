package com.java.FlipRobo;

public class Practice5Q2 {
	public static void main(String[] args) {
		
		int arr[] = {4,5,6,7,0,1,2};
		int target = 7, j=0, k=-1;
		
	/*	for(int i=0; i<arr.length && j==0; i++) {
			if(arr[i] == target && j==0) {
				k = i;
				j++;
			}
			
		} */
		
		int mid = arr.length /2 ;
		
		if(arr[mid] > target) {
			for(int i=mid; i<arr.length && j==0; i++) {
				if(arr[i] == target && j==0) {
					k = i;
					j++;
				}
				
			}
			
		}else {
			for(int i=0; i<=mid && j==0; i++) {
				if(arr[i] == target && j==0) {
					k = i;
					j++;
				}
			}
		}
		
		System.out.println(k);
	}

}
