package com.java.FlipRoboHW1;

/*Given the roots of two binary trees p and q, write a function to check 
 * if they are the same or not.

Two binary trees are considered the same if they are structurally identical, 
and the nodes have the same value.*/

     class TreeNode {
	     int val;
	     TreeNode left;
         TreeNode right;
         
	      
	      TreeNode(int item) {
	    	  val = item;
	    	  left = right = null;
	      }
	  }

public class Practice3Q1 {
	 TreeNode root, root1;
	 
	 	 
	 public boolean isSameTree(TreeNode root, TreeNode root1) {
		 
		 if(root == null && root1 == null)
			 return true;
		 
		 if(root == null || root1 ==null)
			 return false;
		 
		 return ((root.val == root1.val) && isSameTree(root.left,root1.left) &&
				 isSameTree(root.right,root1.right));
		 
	 }
	 
	 
	
	public static void main(String[] args) {
		
		Practice3Q1 tree = new Practice3Q1();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(6);
		
		if(tree.isSameTree(root,root1) == true) {
			System.out.println("True : Same Tree");}
		else
			{System.out.println("Not Same Tree");}
			 
		}
	}


