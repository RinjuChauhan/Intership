	/* Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u')
	 *  in every substring of word.

	A substring is a contiguous (non-empty) sequence of characters within a string.
	Input: word = "aba"   Output: 6

	Explanation: 
	All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
	- "b" has 0 vowels in it
	- "a", "ab", "ba", and "a" have 1 vowel each
	- "aba" has 2 vowels in it
	Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6
	*/

package com.java.FlipRobo;

import java.util.ArrayList;

public class countVowels {
	
	public int fn(String str) {
		
		ArrayList<String> arl = new ArrayList<String>();
		
		for(int o=0; o<str.length(); o++) {
			for(int p=o+1; p<=str.length(); p++) {
				
				arl.add(str.substring(o,p));
			}
		}
		System.out.println("List of SubString : " + arl);
		String st;
		int count=0;
		
		for(int q=0; q<arl.size(); q++) {
			
			st = arl.get(q);
			int r=0;
			while(r<st.length()) {
				
				if(st.charAt(r) == 'a' || st.charAt(r) == 'e' || st.charAt(r) == 'i'
						|| st.charAt(r) == 'o' || st.charAt(r) == 'u') {
					count++;
				}
				r++;
			}
		}
				
		
		return count;
	}
	
	public static void main(String[] args) {
		
		countVowels obj = new countVowels();
		String str = "abced";
		System.out.println("Input String is : " + "\"" + str+ "\"");
		int ans;
		ans = obj.fn(str);
		System.out.println("count of vowels of all subStrings : " + ans);
		
	}

}
