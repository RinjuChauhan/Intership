package com.java.FlipRoboHW1;
import java.util.*;

public class CharacterFrequency {
	
	public static void main(String[] args) {
		
		String s = "trtrateaet";
		
		char[] ch = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {			
			ch[i] = s.charAt(i);
		}
		
		System.out.println(ch);
		
		int k = s.length();
		char temp1;
		
		for(int i = 0; i<s.length(); i++) {
			
			for(int j=i+1; j<s.length(); j++) {
				
				if(ch[i] == ch[j]) {					
					i++;						
					
					if(i < s.length()) {	
						temp1 = ch[i];
						ch[i] = ch[j];
						ch[j] = temp1; 
					}
					i--;
				}
				else {
					if(j == k) {
						temp1 = ch[i];
						ch[i] = ch[s.length()-1];
						ch[s.length()-1] = temp1;
						k = s.length()-1;
						System.out.println(ch[k]);
					}
				}
			}
		}		
	
		System.out.println(ch);
/*		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('c',3);
		hm.put('a',2);
		hm.put('b',4);
		int n = hm.get('c');
		List<Integer> ll = new ArrayList<Integer>();
		
		ll.add(n);
		n = hm.get('a');
		ll.add(n);
		n = hm.get('b');
		ll.add(n);
		
		System.out.println("list is " + ll);
		Collections.sort(ll);
		System.out.println("list is " + ll);
		
		char c;
		
		System.out.println(n);
		
		int count=0, j, i = 0;
		while(i<s.length()) {	
			
			j = i+1;
			count = 1;
			while(j<s.length()) {
				if(ch[i] == ch[j]) {
					j++;
					count++;
					System.out.println("count " + count);
					hm.put(ch[i],count);
				}
				else
					hm.put(ch[i],count);
					return;
			}
			i++;
		}
		System.out.println();	*/
	}
}
