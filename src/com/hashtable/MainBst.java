package com.hashtable;

public class MainBst {
	public static void main(String[] args) {
		System.out.println("Welcome to BST problem");
		
		BinaryTree bst = new BinaryTree();
		Node root = null;
		
		root = bst.insert(root, 56);
		
		root = bst.insert(root, 30);
	
		//30->56->70->80
		root = bst.insert(root, 70);

		bst.print(root);

	}

}
