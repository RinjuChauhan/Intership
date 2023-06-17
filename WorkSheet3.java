
/*Write a java program following instructions
A.	Make a class Addition/Worksheet3
a.	initialize sum as 0 
b.	make addTwoInt method taking two int parameters a,b. make sum = a+b. Return Sum
*/

package com.java.Intern;

public class WorkSheet3 {
	int sum=0;
	public int addTwoInt(int a, int b) {
		sum = a+b;
		return sum;
	}


	public static void main(String[] args) {
		WorkSheet3 obj = new WorkSheet3();
		System.out.println("Sum of two number is : " +obj.addTwoInt(5,10));
	}
}
 /*B.define class as Method Call. Define main method
a.	Create object of class Addition
b.	call method using instance of object
c.	Print sum
*/

/* B is included in above */

/*A.	Define a class Example
a.	Define two instance variables number and name
b.	Define accessor (getter) methods
c.	Define mutator (setter) methods
d.	define method printDetails —-> print name and number

B.	Define public class Demo (Main Class)
a.	Define main method
b.	Make Instance/object of example class
c.	set number and name using instance created as 123 and Your name.
d.	call printDetails method using instance  */



