
	/* Given an integer array nums of size n, return the number with the value closest to 0 in nums.
 *  If there are multiple answers, return the number with the largest value.*/
	/* Input: nums = [-4,-2,1,4,8]    	Output: 1
	
		Explanation:
		The distance from -4 to 0 is |-4| = 4.
		The distance from -2 to 0 is |-2| = 2.
		The distance from 1 to 0 is |1| = 1.
		The distance from 4 to 0 is |4| = 4.
		The distance from 8 to 0 is |8| = 8.
		Thus, the closest number to 0 in the array is 1.*/

package com.java.FlipRobo;
import java.util.*;

public class ClosestNumbertoZero {
	
	 public int findClosestNumber(int[] nums) {
	     int n = nums.length,ans=0; 
	     int res = Integer.MAX_VALUE;
	     for(int i = 0; i < n ; i++) {
	    	 int res_in;
	    	 if(nums[i] - nums[i] == 0) {
	    		 if(Math.abs(nums[i]) < res){
	    			 res  = Math.abs(nums[i]);
	    			 res_in = i;	
	    			 ans = nums[res_in];
	    			
	    			 }
	    		 }	    	
	     	}
		 
		 return ans;		 
	    }
	
	public static void main(String[] args) {
		
		int arr[] = {-4, -2, -1, 3, 4, 8};
		
		System.out.println("Input array is : " + Arrays.toString(arr));
		
		int ans;
		ClosestNumbertoZero obj = new ClosestNumbertoZero();
		
		ans = obj.findClosestNumber(arr);
		
		System.out.println("Closest Number is : " + ans);
		
	}

}
