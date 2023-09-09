package com.java.FlipRoboHW1;
import java.io.*;
public class Practice14Q2 {	

	    
	    static void Parenthesis(char str[], int pos,
	                                  int n, int open,
	                                  int close)
	    {
	        if (close == n) {
	            
	            for (int i = 0; i < str.length; i++)
	                System.out.print(str[i]);
	            System.out.println();
	            return;
	        }
	        else {
	            if (open > close) {
	                str[pos] = ')';
	                Parenthesis(str, pos + 1, n, open,
	                                  close + 1);
	            }
	            if (open < n) {
	                str[pos] = '(';
	                Parenthesis(str, pos + 1, n, open + 1,
	                                  close);
	            }
	        }
	    }
	 
	    
	    static void print(char str[], int n)
	    {
	        if (n > 0)
	            Parenthesis(str, 0, n, 0, 0);
	        return;
	    }
	 
	    
	    public static void main(String[] args)
	    {
	        int n = 3;
	        char[] str = new char[2 * n];
	        print(str, n);
	    }
	}

