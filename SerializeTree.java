package com.java.FlipRoboHW1;
import java.util.*;

public class SerializeTree {
	TreeNode root;
	
	public static String fn(TreeNode root) {		
		
		Stack<TreeNode> s = new Stack<>();	//creating one stack(data-type is TreeNode) for taking treeRoot Values
		s.push(root);		//taking root-node in stack
		
		List<String> sl = new ArrayList<>(); //creating String list for output
		
		while( !s.isEmpty()) {				//while loop, runs till stack is empty
			TreeNode t = s.pop();		//temp. t node for taking root-node stored in stack and transferring in String List
			
			if(t == null) {			//for no node, add null in String list
				sl.add("null");
			}
			else			//else, add node-Value in StringList, and move forward for right and left node and push it in Stack
			{
				sl.add(" " + t.val);
				s.push(t.right);  //22,
				s.push(t.left);  //8,
			}		//as right and left added, s is not empty, While runs till s is empty or there is no right and left node in tree
		}
		//20,22,8,12,4,14,10
		//pop - 20,8,(now 4 is at top, so it is popped),4, null,null(null as 4 has no any node)
		//after 4, now 12 is at top for stack,(14, 10 added to Stack as right and left node), 
		//so 10 is at top now, then 14 and then 22 with null as no any node
		
		return String.join(" , ", sl);   //Returning String List as one String by join method
	}
	
	public static void main(String[] args) {           //   				20   
		 SerializeTree tree = new SerializeTree();	   //				8		22		
	        tree.root = new TreeNode(20);			   //			  4   12	
	        tree.root.left = new TreeNode(8);		    //				10  14
	        tree.root.right = new TreeNode(22);		    //
	        tree.root.left.left = new TreeNode(4); 	     //
	        tree.root.left.right = new TreeNode(12);     //
	        tree.root.left.right.left = new TreeNode(10); //
	        tree.root.left.right.right = new TreeNode(14);  //
	        
	        String serialized = fn(tree.root);
	        System.out.println("Answer is : " + serialized);
	        //i.e. Stack pops last pushed item, so 8 is before 22
	        //Answer is :  20 ,  8 ,  4 , null , null ,  12 ,  10 , null , null ,  14 , null , null ,  22 , null , null
	}

}
