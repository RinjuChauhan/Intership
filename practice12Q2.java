package com.java.DSA_Practice;

import java.util.Arrays;

public class practice12Q2 {
	public static void main(String[] args) {
		int n=20;
		String s1 = "Fizz";
		String s2 = "Buzz";
		String[] str = new String[n];		
		for(int i=0; i<=20; i++) {
			if(i<=19) {
				str[i]=Integer.toString(i+1);
				
				if((i+1) % 3 == 0) {
					str[i]= s1;	
					
				}
				if((i+1) % 5 == 0) {
					str[i]= s2;
				}
				if((i+1) % 3==0 && (i+1) % 5==0) {
					str[i] = s1+s2;					
				}				
			}
		}
		System.out.println(Arrays.toString(str));
	}

}
