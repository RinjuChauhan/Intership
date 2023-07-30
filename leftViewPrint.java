package com.java.WorksheetSet6;
import java.util.*;

public class leftViewPrint {	
	    
	    static class Node {
	        int data;
	        Node left, right;
	 
	        public Node(int item)
	        {
	            data = item;
	            left = right = null;
	        }
	    }
	    
	    public static ArrayList<Integer> leftView(Node root)
	    {
	        
	        ArrayList<Integer> ans = new ArrayList<>();
	 
	        if (root == null) {
	            return ans;
	        }
	 
	        Queue<Node> q = new LinkedList<>();
	        q.add(root);
	        q.add(null);
	        boolean ok = true;
	 
	        while (!q.isEmpty()) {
	            Node it = q.poll();
	            if (it == null) {
	                if (ok == false) {
	                    ok = true;
	                }
	 
	                if (q.size() == 0)
	                    break;
	 
	                else {
	                    q.add(null);
	                }
	            }
	            else {
	 
	                if (ok) {
	                    ans.add(it.data);
	                    ok = false;
	                }
	 
	                if (it.left != null) {
	                    q.add(it.left);
	                }
	 
	                if (it.right != null) {
	                    q.add(it.right);
	                }
	            }
	        }
	 
	        return ans;
	    }
	    
	    public static void main(String[] args)
	    {
	        Node root = new Node(10);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(7);
	        root.left.right = new Node(8);
	        root.right.right = new Node(15);
	        root.right.left = new Node(12);
	        root.right.right.left = new Node(133);
	 
	        ArrayList<Integer> vec = leftView(root);
	        for (int x : vec) {
	            System.out.print(x + " ");
	        }
	        System.out.println();
	    }
	}
	 
