package com.java.FlipRoboHW1;
import java.util.*;

class Node{
	int data;
	Node next;
	
	Node(int n){
		data = n;
		next = null;
	}
}

class LinkedList{
	Node head;
	
	void push(int i) {
		
		Node newNode = new Node(i);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}
	
	void del_node(int i){	//7,3,5,4--5,
		
		Node t = head, prev = null;  
		
		while(t!=null && t.data != i) {	//t.data=7, prev=null, t=3, prev=3, t=5, 
			prev = t;
			t = t.next;			
		}
		
		if(t == null) {
			System.out.println("Node not present");
			return;
		}
		prev.next = t.next;	//prev.next = 3.next = t.next = 5.next = 4.
	}
	
	void printList() {
		Node temp;
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

public class DeleteNode {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.push(7);
		ll.push(3);
		ll.push(5);
		ll.push(4);
		ll.printList();
		System.out.println();
		ll.del_node(15);
		ll.printList();
				
	}

}
