package com.java.FlipRoboHW1;
import java.util.Scanner;

/*Given an integer x, return true if x is a palindrome , and false otherwise.*/

public class Practice2Q1 {
	void checkPalindrome(int n) {
		int r, temp=n, s=0;
		while(n > 0) {
			r = n%10;
			s = (s*10)+r;
			n /=10;
		}
		if( temp == s) {
			System.out.println( temp + " is Palindrome number. ");
		}
		else
			System.out.println( temp + " is not a Palindrome number. ");		
		
	}
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to check for Palindrome : ");
		
		int n = s.nextInt();
		Practice2Q1 obj = new Practice2Q1();
		obj.checkPalindrome(n);	
	
	}

}
