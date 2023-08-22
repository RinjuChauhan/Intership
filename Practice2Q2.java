package com.java.FlipRoboHW1;

/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares
of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops
endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/

public class Practice2Q2 {
	
	void fn(int n) {
			
			int r,s=0;
			while(n > 0) {
			r = n%10;
			s = s + r*r;
			n = n/10;			
			}
			if(s!=1 && s!=4) {
				fn(s);
			}
			else
				{if(s==1)
					System.out.println("True is Happy Number ");
				else
					if(s==4)
						System.out.println("False is not a Happy Number ");}
	}
	
	public static void main(String[] args) throws Exception{			
		Practice2Q2 obj = new Practice2Q2();
		obj.fn(19);
		
		
		//System.out.println(s);
		
	/*	 1 + 9 = 82  square     n%10 = 9, n=n/10, n=1, n%10, n=n/10= 1/10 0.1
				8 + 2 = 68        r = r*r,  + r*r == new number check ==1, break,
				6 + 8 = 100
				1 + 0 + 0 = 1 */
	}

}
