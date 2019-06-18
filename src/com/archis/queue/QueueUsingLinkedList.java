package com.archis.queue;

import com.archis.linkedlist.LinkedListNode;

public class QueueUsingLinkedList {

	LinkedListNode front, rear;
	
	public QueueUsingLinkedList() {
		this.front = this.rear = null;
	}
	
	public void enQueue(int data) {
		LinkedListNode tempNode = new LinkedListNode(data);
		if(rear == null) {
			front = rear = tempNode;
			return;
		}
		rear.setNext(tempNode);
		rear = tempNode;
	}
	
	public LinkedListNode deQueue() {
		if(front == null) {
			System.out.println("Can't deQueue, Queue is empty");
			return null;
		}
		LinkedListNode tempNode = front;
		front = front.getNext();
		if(front == null)
			rear = null;
		return tempNode;
	}
	
	public LinkedListNode peek() {
		if(front == null) {
			System.out.println("Can't peek, Queue is empty");
			return null;
		}
		return front;
	}
	
	public void iterate() {
		if(front == null) {
			System.out.println("Queue is empty");
			return;
		}
		LinkedListNode tempNode = front;
		while(tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.getNext();
		}
	}
}
