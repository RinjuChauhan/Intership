package com.java.WorksheetSet6;

import java.util.*;

public class BalancedBrackets {
	
	static boolean areBracketsBalanced(String s) {
		
		Deque<Character> stack = new ArrayDeque<Character>();

		for(int i=0; i<s.length(); i++) {
			
			char x = s.charAt(i);
			if( x == '(' || x == '{' || x == '[') {
				
				stack.push(x);
				continue;
			}
			if(stack.isEmpty())
			{   System.out.println("More closing brackets than opening");
				return false;}
			
			char check;
			
			switch(x) {
			
			case ')' :
				check = stack.pop();
				if(check == '{' || check =='[')
					return false;
				break;
			case '}' :
				check = stack.pop();
				if(check == '[' || check =='(')
					return false;
				break;
			case ']' : 
				check = stack.pop();
				if(check == '{' || check == '(')
					{System.out.println("This is last mismatch");
					System.out.println(i + " length is : " + " "+s.length() + " stack empty ?" + stack.isEmpty());
					return false;}
				break;
			}
		}
		System.out.println("almost there");
		return (stack.isEmpty());
	}
	
	public static void main(String[] args) {
		
		String str = "(({()})]";
		
		if(areBracketsBalanced(str)) {
			System.out.println("Balanced");
			
		}
		else
			System.out.println("Not Balanced");
	}

}
