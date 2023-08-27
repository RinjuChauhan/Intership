package com.java.FlipRobo;

import java.util.Arrays;

/* Given a string s representing a valid expression, implement a basic calculator to evaluate it,
 *  and return the result of the evaluation.
	Input: s = "1 + 1"    	Output: 2
	Input: s = " 2-1 + 2 "   Output: 3
	Note: You are not allowed to use any built-in function which evaluates strings
 	as mathematical expressions, such as eval().
 * */

public class Practice6Q1 {
	
	static int numFind(int i, int[] ar) {
		int num=0;
				
			while (i<ar.length && ar[i]>=0) {
				if(ar[i] >=0)
					num = num*10 + ar[i];
					i++;		
			}		
				
		return num;		
	}
	
	public static void main(String[] args) {
	
		String s = "10*10";
		int arr[]= new int[s.length()], out=0;
		char ch[] = new char[s.length()];
		for(int i =0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}								
		
		System.out.println(Arrays.toString(ch));
		
		for(int i=0; i<s.length(); i++) {
			arr[i] = ch[i] - '0';
		}
		
		System.out.println(Arrays.toString(arr));	
		
		int i=0;		
			out = out + numFind(i, arr);
			System.out.println("First " + out);
			System.out.println(arr[2]);
			
		int r=0;	
			
		//num=0,,,,,num = num + numFind()	;   i=0, j=0,  j=i, startWith j
		while(r< arr.length){
		
			if(arr[r] < 0) {
			
				switch(ch[r]) {
					case '-' : 
						System.out.println(ch[r]);
						out = out - numFind(r+1, arr);				
												 
						break;
					case '+' :
						out = out + numFind(r+1, arr);
						
						break;
					case '*' :
						out = out * numFind(r+1, arr);
						
						break;
					case '/' :
						out = out / numFind(r+1, arr);
						
						break;
					case '%' :
						out = out % numFind(r+1, arr);
						
						break;
					default :
						System.out.println("Enter valid expression");
						break;				
				}
			}
			r++;
		
		}
			
		System.out.println(out);
		
	}
}
	/*	char s1 = '1';
		int output;
		
		int i = s1-'0';
		System.out.println(i + Arrays.toString(ch)); */
		