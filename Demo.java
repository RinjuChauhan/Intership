
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

package com.java.Intern;
class Example{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String N) {
		this.name = N;
	}
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int n) {
		this.number = n;
	}
	
	public void printDetails(String nam, int id ) {
		System.out.println("Given name is : " + this.name + " ,Number is : " + this.number);
	}
}

public class Demo {
	public static void main(String[] args) {
		Example obj = new Example();
		obj.setName("Rinju");
		obj.setNumber(123);
		System.out.println(obj.getName() + " - "+obj.getNumber());
		obj.printDetails("Rinju", 123);
	}
}
