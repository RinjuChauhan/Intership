package com.java.FlipRoboHW1;
import java.util.LinkedList;
import java.util.*;

/*class Node1{
	int data;
	Node next;
	
	Node1(int n){
		data = n;
		next = null;
	}
} */

/*class LinkedList1{
	Node head1, head2;
	
	public void push(int n) {
		Node new_Node = new Node(n);
		
		if(head1 == null) {
			head1 = new_Node;
			return;
		}
		
		Node last = head1;
		
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_Node;
	}
	
	public void print() {
		Node temp;
		temp = head1;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
} */
public class IntersectionArray {

	public static void main(String[] args) {
		
		LinkedList<Integer> head1 = new LinkedList<Integer>();
		LinkedList<Integer> head2 = new LinkedList<Integer>();
		//LinkedList1 obj = new LinkedList1();
		//LinkedList1 obj1 = new LinkedList1();
		
		/*obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.print();
		System.out.println();
		obj1.push(1);
		obj1.push(3);
		obj1.push(4);
		obj1.push(5);
		obj1.push(6);
		obj1.print(); */
		System.out.println();
		int ar[] = {1,2,4,5,7,8,9};
		int ar1[] = {4,3,5,5,9};
		
		Set<Integer> arl = new HashSet<Integer>();
 		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar1.length; j++) {
				if( ar1[j] == ar[i]) {
					
					arl.add(ar[i]);
				}
			}
		}
		System.out.println(arl);	
		
		
		
	}
}
