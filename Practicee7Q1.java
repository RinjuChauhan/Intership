package com.java.FlipRobo;
import java.util.Arrays;


public class Practicee7Q1 {
	

	/*Given a sorted array of distinct integers and a target value, return the index if the target is
	 *  found.
	 *  If not, return the index where it would be if it were inserted in order.
	 * Input: nums = [1,3,5,6], target = 2,  Output: 1
	   Input: nums = [1,3,5,6], target = 7,  Output: 4
	 */
	
		static void fnR(int mid, int max, int ar[], int target) {
			int min = mid;					 
			mid = (min+max)/2;	
										
			if(target == ar[mid]) {
				System.out.println(mid);  
				return;
			}
			
			if(target > ar[mid])
				{if(max == mid+1) {
					System.out.println(max);
					return;
				}
					fnR(mid, max, ar, target);}
			else
					fnL(min, mid, ar, target);	
			
		}
		
		static void fnL(int min, int mid, int ar[], int target) {
			int max = mid;
			mid = (min+max)/2;
			
			if(target == ar[mid]) {				
				System.out.println(mid);	
				return;
			}
			
			if(target > ar[mid])
				fnR(mid, max, ar, target);
			else
				fnL(min, mid, ar, target);
						
		}
		
		public static void main(String[] args) {
			
			int ar[] = {1,3,4,5,10,20,50,70,90,125};
			int target = 4;
			
			System.out.println(Arrays.toString(ar));
			int min=0, max = ar.length, mid = (min+max)/2;
			
			if(target > ar[mid]) {
				//call right half
				fnR(mid, max, ar, target);
			}
			else {
				//call left half
				fnL( min, mid, ar, target);
			}			
			 
		}

}
