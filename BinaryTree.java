// java DSA to find Height of Tree

package com.java.WorksheetSet6;

//Binary tree node

class Node{
	int data;
	Node left, right;
	
	Node(int item){
		data = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;
	
	/* Compute the "maxDepth" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
	
	int maxDepth(Node node) {
		
		if(node == null) {
			return 0;
		}
		else {
			int ldepth = maxDepth(node.left);
			int rdepth = maxDepth(node.right);
			
			if(ldepth > rdepth)
				{System.out.println("ldephth is "+ ldepth);
				return (ldepth+1);}
			else 
			   {System.out.println("rdephth is "+ rdepth);
				return (rdepth+1);}
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		 
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
      //  tree.root.left.left.left = new Node(6);
 
        System.out.println("Height of tree is "
                           + tree.maxDepth(tree.root));
    
		
	}
		
}
