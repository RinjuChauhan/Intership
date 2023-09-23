package com.java.FlipRoboHW1;

public class DeSerializeTree {
	static int t = 0;
	
	public static TreeNode fn(String[] str) {
		
		if(str[t] == "null") {
			return null;
		}
		
		TreeNode root = new TreeNode(Integer.parseInt(str[t]));
		
		t++;
		
		root.left = fn(str);
		
		t++;
		
		root.right = fn(str);
		
		return root;
		
	}
	
	public void inorder(TreeNode root) {
		
		if( root != null) {
			
			inorder(root.left);
			System.out.print(root.val + " ");		//(left-head-right) = inorder.
			inorder(root.right);					// (4,8(1 set), 10,12(2nd set of left), right=14,) = left side of tree
										// Head = 20, Right=22.
		}
	}
	
	public static void main(String[] args) {
		
		DeSerializeTree obj = new DeSerializeTree();
		
		String[] s = {"20","8","4","null","null","12","10","null","null","14","null","null","22","null","null"};
		
		TreeNode tn =  fn(s);
		obj.inorder(tn);
	}

}  //Answer : 4 8 10 12 14 20 22 
