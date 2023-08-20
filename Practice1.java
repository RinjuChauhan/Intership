package com.java.FlipRoboHW1;

import java.util.Arrays;
import java.util.LinkedList;

public class Practice1 {
	public static void main(String[] args) {
		/* Add two numbers : Linked List : DSA */
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		
		ll1.add(2);
		ll1.add(4);
		ll1.add(3);
		System.out.println(ll1);
		ll2.add(5);
		ll2.add(6);
		ll2.add(4);
		System.out.println(ll2);
		
		/* add as 342 + 465 = 807, and display as 708 */
		
		Object[] objectArray1 = ll1.toArray();
		Object[] objectArray2 = ll2.toArray();
		
		int length1 = objectArray1.length;
		int length2 = objectArray2.length;
		
		int Arr1[] = new int[length1];
		int Arr2[] = new int[length2];
		
		for(int i=0; i<length1; i++) {
			Arr1[i]= (int) objectArray1[i];
		}
		System.out.println(Arrays.toString(Arr1));
		
		for(int i=0; i<length2; i++) {
			Arr2[i]= (int) objectArray2[i];
		}
		System.out.println(Arrays.toString(Arr2));
		
		for(int i=0; i< length1 -1; i++) {
			int n = length1;
			int temp = Arr1[i];			
			Arr1[i] = Arr1[n-i-1];	
			Arr1[n-i-1]= temp;
			}
		System.out.println(Arrays.toString(Arr1));
		
		for(int i=0; i< length2 -1; i++) {
			int n = length2;
			int temp = Arr2[i];			
			Arr2[i] = Arr2[n-i-1];	
			Arr2[n-i-1]= temp;
			}
		System.out.println(Arrays.toString(Arr2));
		
		int numberConverted1 = 0;   
		 	for (int number : Arr1) {
		 		numberConverted1 = 10*numberConverted1 + number;
		  }
		  
		System.out.println(numberConverted1);  
		
		int numberConverted2 = 0;
			for(int i : Arr2) {
				numberConverted2 = 10*numberConverted2 + i;
			}
		
		System.out.println(numberConverted2);
		
		int sum = numberConverted1 + numberConverted2;
		System.out.println(sum);
		
		int revSum=0;
		LinkedList<Integer> ll3 = new LinkedList<Integer>();
		
		while(sum > 0) {
			int r = sum%10;
			ll3.add(r);
			revSum = revSum*10 +r;						
			sum = sum/10;
		}
		
		System.out.println(revSum);
		System.out.println(ll3);
		
	}
}
