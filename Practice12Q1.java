package com.java.FlipRobo;

import java.util.Arrays;

public class Practice12Q1 {
	public static void main(String[] args) {
		String s1 = "101", s2="110";		
		
		int num1= 0,num2=0;		
		
		if(s1.length() > s2.length()) {
			s2 = '0'+s2;
		}
		else
			{if(s1.length() < s2.length()) {
			s1 = '0'+s1;
		}}
		System.out.println("Given String is :" +s1 +" & " + s2);
		//convert Binary to Decimal
		
		char ch1[] = new char[s1.length()], ch2[] = new char[s2.length()];
		
		for(int i=0; i<s1.length(); i++) {
			ch1[i] = s1.charAt(i);
		}
		for(int i=0; i<s2.length(); i++) {
			ch2[i] = s2.charAt(i);
		}
				
		int ar1[]= new int[s1.length()];
		int ar2[]= new int[s2.length()];
		
		for(int i=0; i<s1.length(); i++) {
			ar1[i] = ch1[i]-'0';
		}
		for(int i=0; i<s2.length(); i++) {
			ar2[i] = ch2[i]-'0';
		}
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		int ans = 1, ans1=1;
		for(int i=s1.length()-1; i>=0; i--) {			
			num1 = num1 + (ans * ar1[i]);
			ans = ans * 2;			
		} 
			
		for(int i=s2.length()-1; i>=0; i--) {			
			num2 = num2 + (ans1 * ar2[i]);
			ans1 = ans1 * 2;			
		} 
		//char a = (char) (num1 + '0');
		//System.out.println(a);
		  int op = num1 + num2;
		 
		  int check = op, r=0, r1=0;
		  while(check > 0) {			  
			  r = (r * 10) + (check % 2);
			  check = check / 2;
		  }
		 
		  while(r > 0) {			  
			  r1 = (r1 * 10) + (r % 10);
			  r = r / 10;
		  }
		  System.out.println("Binary Value : " + r1);
		  String s = Integer.toString(r1);
		  System.out.println(s);
	}

}
