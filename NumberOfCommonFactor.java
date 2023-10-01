	/* Given two positive integers a and b, return the number of common factors of a and b.

	An integer x is a common factor of a and b if x divides both a and b.
	Input: a = 12, b = 6    Output: 4

	Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.

  */


package com.java.FlipRobo;
import java.util.*;
import java.util.ArrayList;

public class NumberOfCommonFactor {
	
	public static void main(String[] args) {
	
	int a = 15, b=12;
	int m=a, n=b;
	ArrayList<Integer> ll1 = new ArrayList<Integer>();	
	ArrayList<Integer> ll2 = new ArrayList<Integer>();
		int i = 2;
		ll1.add(a);
		while(i<=a) {
			
			if(a%i == 0) {
				ll1.add(i);	
				ll1.add(a/i);
				a = a/i;				
			}
			else
				i++;
		}
		
		int j=2;
		ll2.add(b);
		while(j<=b) {
			
			if(b%j == 0) {
				ll2.add(j);
				ll2.add(b/j);
				b = b/j;
			}
			else
				j++;
		}
	
	
	
	Set<Integer> hs = new HashSet<Integer>();
	
	for(int k=0; k<ll1.size(); k++) {
		for(int l=0; l<ll2.size(); l++) {
			if(ll2.get(l) == ll1.get(k)) {
				hs.add(ll1.get(k));
			}
		}
	}
	System.out.println("Given numbers are : " + m + " and " +n);
	System.out.println("Common factors : "+hs);
	System.out.println("Number of common factors : " + hs.size());
	}
}
