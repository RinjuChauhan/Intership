package com.java.FlipRobo;

public class IsPrefixOfWord {
	public int fn(String original, String search) {
		
		String[] strarr = original.split(" ", 0);
		int index = 0;
		
		for(int i=0; i<strarr.length; i++) {
			
			String st = strarr[i];
			int j = 0;
			
			while(j<search.length()) {
				
				if(st.charAt(j) == search.charAt(j)) {
					j++;
					index = i + 1;
					if(j==search.length()-1) {
					
						return index;
					}
				}				
				else 
				{
					j = search.length();
				}
			}
		}		
		return -1;
	}
	
	public static void main(String[] args) {
		
		IsPrefixOfWord obj = new IsPrefixOfWord();
		
		String str = "This problem is an easy problem";
		String search = "pro";
		int output;
		output = obj.fn(str, search);
		System.out.println("Original String is : " + str);
		System.out.println("Place of prefix "+ "\""+ search + "\"" + " is : " + output);
	}

}
