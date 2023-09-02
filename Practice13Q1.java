package com.java.FlipRobo;
import java.util.Scanner;

public class Practice13Q1 {
	static int fn(int a, int n) {
		
		while(a < n) {
			a = a * 3;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int n =s.nextInt();		
		System.out.println(n);
		
		int ans = 1; int i=1; int sum=0;		
		int r=0;
		if(n==1 || n==3) {
			System.out.println("yes");
			return;
		}
		 while(n > 3) {
			ans = fn(ans, n);				 
			if(ans == n) {		
				System.out.println("yes");
				return;
			}
			n = n - (ans/3);		
			if( n==1 || n==3) {
				System.out.println("yes");
				return;
			}
			int dist = ans;
			ans = 1;
			ans = fn(ans, n);
			if(dist == ans || ans < n) {
				System.out.println("no");
				return;
			}
		 }
		 if(n < 3) {
			 System.out.println("no");
		 }
	}
}
