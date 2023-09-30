package com.java.FlipRoboHW1;
import java.util.*;

public class LargeValueRowTree {
	
	static class Node{
		 int data;
		 Node left, right;
		 
		 Node(int n){
			 data = n;
			 left = null;
			 right = null;
		 }
	}
	static void fn1(Vector<Integer> vec, Node root, int treeLevel){
		if(root == null) {
			return;
		}
		if( treeLevel == vec.size()) {
			vec.add(root.data);
		}
		else
		{
			vec.set(treeLevel,  Math.max(vec.get(treeLevel), root.data));
		}
		
		fn1(vec, root.left, treeLevel+1);
		fn1(vec, root.right, treeLevel+1);
	}
	
	static Vector<Integer> fn(Node root){
		Vector<Integer> vec = new Vector<Integer>();
		fn1(vec, root, 0);
		return vec;
	}

	public static void main(String[] args) {
		
		Node root = null;
		
		root = new Node(4);
		root.left = new Node(13);
		root.right = new Node(8);
		root.left.left = new Node(19);
		root.left.right = new Node(10);
		root.right.left = new Node(12);
		root.right.right = new Node(17);
		
		Vector<Integer> vec_final = fn(root);
		System.out.println(vec_final);
	}
}
