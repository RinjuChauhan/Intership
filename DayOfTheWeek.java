	/* (Year Code + Month Code + Century Code + Date Number - Leap Year Code) mod 7
	The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

Example :

Input: day = 31, month = 8, year = 2019
Output: "Saturday"

Input: day = 18, month = 7, year = 1999
Output: "Sunday"

Input: day = 15, month = 8, year = 1993
Output: "Sunday"

The given dates are valid dates between the years 1971 and 2100.
	 
  */

package com.java.FlipRoboHW1;
import java.util.*;

public class DayOfTheWeek {
	
	public static int fn(int n) {
		int centuryCode1 = 0; //for 1900
		int centuryCode2 = 6;  //for 2000
		int centuryCode3 = 4;  //for 2100
		
		int century=0;
		
		if(n/100 == 19)
			{
			century = 0;
			}
		
		if(n/100 == 20)
			{
			century = 6;
			}
		if(n/100 == 21)
			{
			century = 4;
			}
		return century;
	}

	public static void main(String[] args) {
		
		int year, month, date;
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter year");
		year = num.nextInt();
		
		System.out.println("Enter month");
		month = num.nextInt();
		
		System.out.println("Enter date");
		date = num.nextInt();
		
		int yearCode, monthCode, centuryCode, dateNumber, leapYearCode;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1,0);
		map.put(2,3);
		map.put(3,3);
		map.put(4,6);
		map.put(5,1);
		map.put(6,4);
		map.put(7,6);
		map.put(8,2);
		map.put(9,5);
		map.put(10,0);
		map.put(11,3);
		map.put(12,5);
		
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(0, "Sunday");
		map1.put(1, "Monday");
		map1.put(2, "Tuesday");
		map1.put(3, "Wednesday");
		map1.put(4, "Thursday");
		map1.put(5, "Friday");
		map1.put(6, "Saturday");		
		
		//YearCode = (YY + (YY div 4)) mod 7   
			int n = year;			 
			int r = 0, sum = 0;
			int i = 1, j=1;
			while(i<3) {					
					r = n%10;
					sum = sum + (r*j); 
					n = n/10; j = j*10;
					i++;
			}
			yearCode = (sum + (sum/4)) % 7;
		
			monthCode = map.get(month);
			
			centuryCode = fn(year);
			System.out.println(centuryCode);
			
			dateNumber = date;
			
			leapYearCode = 0;
			
			if( ((year%4==0) || (year%100==0 && year%400==0)) && 
					( month == 1 || month == 2) ) {
				
					leapYearCode = 1;}
				
				
			
			String str;
	//(Year Code + Month Code + Century Code + Date Number - Leap Year Code) mod 7
			 
			str = map1.get((yearCode + monthCode + centuryCode + dateNumber - leapYearCode) % 7);
			
			System.out.println("Day on " + date + "-"+ month+"-"+year+" is : " +"\""+ str + "\"");
	}
}
