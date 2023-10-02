/*Given a sentence that consists of some words separated by a single space, and a searchWord,
	check if searchWord is a prefix of any word in 
	sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. 
	If searchWord is a prefix of more than one word,
	return the index of the first word (minimum index). If there is no such word return -1.
Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
Example 2:

Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, 
but we return 2 as it's the minimal index.
 
*/

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
