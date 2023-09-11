package com.java.FlipRoboHW1;
import java.util.Arrays;
import java.util.Scanner;
	/*Given an integer n, return the least number of perfect square numbers that sum to n.
	A perfect square is an integer that is the square of an integer; in other words,
	it is the product of some integer with itself.
	For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.*/
	/* Input: n = 12,  Output: 3,  Explanation: 12 = 4 + 4 + 4.
	   InPUT: N=13, OUTPUT:2, 4+9.
	*/

public class SumOfPerfectSquare {
	
		public static void main(String[] args) {
			
			Scanner n = new Scanner(System.in);
			System.out.println("Enter number");
			
			int num = n.nextInt();
			
			int count = 1;  
			int sum=0, i=1;
			while(num > sum) {		
				sum = i*i;
				if(sum == num) {
					System.out.println(" count of perfect number is : " + count);
					return;
				}
				i++;
			}
			if(sum > num) {
				int m=i, k=i;	
				System.out.println("m is "+m);
				int ar[] = new int[k-1];
				
				for(int j=k-2; j>=0; j--) { 
					ar[j] = k-2;
					k--;
				}
				System.out.println(Arrays.toString(ar));
				
				int sum1=0, j=1, count1=0;
				
				while(num>sum1 && j <= m-2) {  //7, 0,1,2..
					sum1 = sum1 + (ar[j] * ar[j]);
					j++;
					count1++;
					if(sum1 == num) {
						System.out.println(" while loop count of perfect number is : " + count1);
						return;
					}
					else
						{if(sum1-1 == num) {
							System.out.println(" we minus 1 count of perfect number is : " + (count1-1));
							return;
						}
						else
						{
							if(sum1+1 == num) {
								System.out.println(" we add 1 count of perfect number is : " + (count1+1));
								return;
							}
						}
					} 
				}
			
			
				int sum2=0, p; count1=0;
				if(sum1 > num) {
					for(int r=1; r<ar.length; r++) {  //15,  0,1,2,3
						sum2 = ar[r]*ar[r];
						p =r+1; count1++;
						while(p < ar.length) {
							sum2 = sum2 + (ar[p] * ar[p]);
							count1++;
							if(sum2 == num) {
								System.out.println(" work count of perfect number is : " + count1);
								return;
						    }						
							sum2 = sum2 - (ar[p] * ar[p]);
							count1--;
							p++;
						}	
					}		
				}
				int sum3=0;
				int s = ar.length-1;   //s=3
				if(sum2 != num) {
					
					for(int r=0; r<ar.length; r++) {
						for(int t=1; t<s; t++){   
							sum3 = sum3 + (ar[t] * ar[t]);
						}				
					
							if(sum3 == num) {
								System.out.println(" count of perfect number is : " + (s-1));
								return;
						    }	
							sum3 = sum3 - (ar[s-1] * ar[s-1]);
							sum3 = sum3 + (ar[s] * ar[s]);
							if(sum3 == num) {
								System.out.println(" count of perfect number is : " + (s-1));
								return;
							}	
					}
				int sum4 = 0;
				for(int v=ar.length-1; v>=ar.length-2; v--) {
						sum4 = sum4 + (ar[v] * ar[v]);
						System.out.println(sum4);
					}
				
				System.out.println(sum4);
					sum4 = sum4 + (ar[1] * ar[1]);
					if(sum4 == num) {
						System.out.println(" count of perfect number is : " + (ar.length-1));
						return;
				    }	
					sum4 = sum4 - (ar[1] * ar[1]);
					sum4 = sum4 + (ar[2] * ar[2]);
					if(sum4 == num) {
						System.out.println(" count of perfect number is : " + (ar.length-1));
						return;
				    }
				}	
			}	
			int p=2;
		while(p <= 10 ) {
			int count2=0, sum5=0;
			p= p*p;
			while(num > sum5) {
				
				sum5 = sum5 + p;
				count2++;
			}
			if( num == sum5 ) {
				System.out.println(" Count is : " + count2);
				return;
			}
			p++;
		}
			System.out.println("no perfect number");
		}}


