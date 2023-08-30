package com.java.FlipRobo;

import java.util.Arrays;

public class Aug11Q1 {
		
			public static void main(String[] args) {
			
			int ar[][] = {{1,2}, {2,3}, {4,1}, {6,1}};
			int ar1[][] = {{1,3}, {3,5}, {5,4}, {6,6}};
			int m=4, n=4, count=m+n;
			//op {{1,5}, {2,8}, {3,4}, {4,1}, {5,6}}    ar = new int [4][2];   ar[3][0] = 6;
			
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(ar1[i][0] == ar[j][0]) {
						count--;
					}
				}			
			}		
			System.out.println(count);
			int arOld[][] = new int[count][2];
			
			
			int i=0, j=0, k=0;
			while(i<n && j<m) {
				if( ar1[i][0] == ar[j][0]) {
					arOld[k][1] = ar1[i][1] + ar[j][1];
					arOld[k][0] = ar1[i][0];
					i++;
					j++; k++;
				}
				else 
					if( ar1[i][0]< ar[j][0]) {
						arOld[k][0] = ar1[i][0];
						arOld[k][1] = ar1[i][1];
						i++; k++;
					}
					else {
						if(ar[j][0] < ar1[i][0] ) {
							arOld[k][0] = ar[j][0];
							arOld[k][1] = ar[j][1];
							j++; k++;
						}
					}
			}
		
			System.out.println(Arrays.deepToString(arOld));
			
		}

	}
