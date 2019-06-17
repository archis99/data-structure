package com.archis.binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BinaryTree {

	Node root;
	static int count = 0;
	public BinaryTree(int data) {
		root = new Node(data);
	}
	
	public void inOrder(Node node) {
		if(node == null) 
			return;
		inOrder(node.getLeft());
		System.out.print(node.getData() + " ");
		inOrder(node.getRight());
	}
	
	public void preOrder(Node node) {
		if(node == null) 
			return;
		System.out.print(node.getData() + " ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
	
	public void postOrder(Node node) {
		if(node == null) 
			return;
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.print(node.getData() + " ");
	}
	
	public int height(Node node) {
		count++;
		if(node == null) {
			return 0;
		}
		
		return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
	}
	
	public void levelOrder(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		Map<Integer, Integer> hm = new HashMap<>();
		//Horizontal distance of root
		hm.put(queue.peek().getData(), 0);
		while(!queue.isEmpty()) {
			//Removes the head node of Queue
			Node tempNode = queue.poll();
			System.out.println(tempNode.getData() + " " + " Hd: " + hm.get(tempNode.getData()));
			if(tempNode.getLeft() != null) {
				hm.put(tempNode.getLeft().getData(), hm.get(tempNode.getData()) - 1);
				queue.add(tempNode.getLeft());	
			}
			if(tempNode.getRight() != null) {
				hm.put(tempNode.getRight().getData(), hm.get(tempNode.getData()) + 1);
				queue.add(tempNode.getRight());	
			}
		}
	}
	
	public void verticalOrder(Node node) {
		
	}
	
	public void BTtoBST() {
		
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

}
