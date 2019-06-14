package com.archis.linkedlist;

public class LinkedList {

	LinkedListNode head;
	
	static int count = 0;
	
	public LinkedList(int data) {
		head = new LinkedListNode(data);
	}
	
	public void printLinkedList() {
		LinkedListNode n = head;
		while(n != null) {
			System.out.println("Current LinkedList data is: "+n.getData());
			n = n.getNext();
		}
	}
	
	public void insertDataAtFirst(int data) {
		LinkedListNode newHead = new LinkedListNode(data);
		newHead.setNext(head);
		head = newHead;
	}
	
	public void insertDataAfterANode(int prevData, int data) {
		LinkedListNode n = head;
		LinkedListNode newData = new LinkedListNode(data);
		boolean flag = false;
		while(n != null) {
			if(n.getData() == prevData) {
				newData.setNext(n.getNext());
				n.setNext(newData);
				flag = true;
				break;
			} else {
				n = n.getNext();
			}
		}
		if(!flag) {
			System.out.println("The previous data is not present");
		}
	}
	
	public void deleteANode(LinkedListNode node, int position) {
		//Two pointers
		LinkedListNode n = node;
		LinkedListNode prev = null;
		
		int count = 0;
		
		/*For deleting head node*/
		if(position == 0) {
			head = n.getNext(); 
			System.out.println("-------");
			printLinkedList();
			return;
		}
		
		while(n != null) {
			if(count == position)
				break;
			count++;
			prev = n;
			n = n.getNext();
		}
		if(n != null)
			prev.setNext(n.getNext());
		System.out.println("-------");
		printLinkedList();
	}
	
	public int countTheOccurrence(LinkedListNode node, int data) {
		
		if(node == null) {
			return count;
		}
		if(node.getData() == data) {
			count++;
		}
		return countTheOccurrence(node.getNext(), data);
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void setHead(LinkedListNode head) {
		this.head = head;
	}
	
}
