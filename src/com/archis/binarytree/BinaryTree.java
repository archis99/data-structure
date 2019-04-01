package com.archis.binarytree;

public class BinaryTree {

	Node root;
	
	public BinaryTree(int data) {
		root = new Node(data);
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

}
