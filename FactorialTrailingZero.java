package com.java.FlipRoboHW1;

public class FactorialTrailingZero {
	
	public static void fn(int n) {
		if(n ==0 ) {
			System.out.println("Number is zero");
			return;
		}
		
		int an=1, ans=1, m=n;
		
		while(n > an) {			
			ans = ans * (n);
			n = n-1;
		}
		System.out.println("Factorial of given number " +m+ " is : " + ans);
		
		if(ans % 10 != 0) {
			System.out.println("No trailing zero");
			return;
		}
		int count=0;
		while(ans % 10 == 0) {
			count++;
			ans = ans/10;
		}
		System.out.println("Trailing zeros are : " + count);
	}
	public static void main(String[] args) {
		
		int n = 10;
		fn(n);
	}

}
