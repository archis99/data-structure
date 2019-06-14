package com.archis.linkedlist;

public class LinkedListNode {

	int data;
	LinkedListNode next;
	
	public LinkedListNode(int d) {
		this.data = d;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
}
