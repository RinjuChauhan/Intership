package com.java.FlipRoboHW1;


public class InterSectionLinkedList {
	
	public Node fn(Node n1, Node n2) {
		
		while( n2 != null) {
			
			Node temp1 = n1;
			while( temp1 != null) {
				if(temp1 == n2) {
					return n2;
				}
				temp1 = temp1.next;
			}
			n2 = n2.next;
		}
		return null;
	}
	/*Node head;
	public void push(int n) {
		
		Node newnode = new Node(n);
		
		if(head==null) {			
			head = newnode;
			return;
		}
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newnode;
	} */
	
	
	public static void main(String[] args) {		
		
		InterSectionLinkedList obj = new InterSectionLinkedList();
		Node head1, head2; 
		
		head1 = new Node(2);
		head2 = new Node(3);
		
		Node newNode = new Node(4);
		head1.next = newNode;
		
		newNode = new Node(14);
		head1.next.next = newNode;
		
		newNode = new Node(12);
		head1.next.next.next = newNode;	
		
		
		newNode = new Node(16);
		head2.next = newNode;
		
		head2.next.next = head1.next.next.next;
		
		newNode = new Node(17);
		head2.next.next.next = newNode;	
		
		
		Node n = obj.fn(head1, head2);
		
		
		System.out.println("Intersect node value is : " + n.data + " node is address"  	);
	}
}
