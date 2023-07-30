package com.java.WorksheetSet6;

public class SortedLinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void sortedInsert(Node new_node) {
		
		Node current;
		if(head == null || head.data >= new_node.data ) {
			new_node.next = head;
			head = new_node;
		}
		else
		{ current = head;
		 
			while (current.next != null && current.next.data < new_node.data) {
           
				current = current.next;
        }
             
        new_node.next = current.next;
        current.next = new_node;
    }
}


	Node newNode(int data)
		{
    Node x = new Node(data);
    return x;
		}


	void printList()
		{
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    	}


	}
	public static void main(String[] args) {
		
		 SortedLinkedList list = new SortedLinkedList();
	        Node new_node;
	        new_node = list.newNode(5);
	        list.sortedInsert(new_node);
	        new_node = list.newNode(10);
	        list.sortedInsert(new_node);
	        
	        
	        new_node = list.newNode(7);
	       
	        
	        list.sortedInsert(new_node);
	       
	        
	        new_node = list.newNode(3);
	        list.sortedInsert(new_node);
	       
	        new_node = list.newNode(1);
	        list.sortedInsert(new_node);
	        new_node = list.newNode(9);
	        list.sortedInsert(new_node);
	       
	        
	        new_node = list.newNode(2);
	        list.sortedInsert(new_node);
	        System.out.println();
	        System.out.println("Created Linked List");
	        list.printList();
	}

}
