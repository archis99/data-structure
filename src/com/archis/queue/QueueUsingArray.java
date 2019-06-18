package com.archis.queue;

import java.util.Arrays;

public class QueueUsingArray {

	int capacity, front, rear;
	int size;
	int[] arr;
	
	public QueueUsingArray(int capacity) {
		this.capacity = capacity;
		this.front = this.size = 0;
		this.rear = capacity - 1;
		this.arr = new int[this.capacity];
	}
	
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	public boolean isFull() {
		return size == capacity ? true : false;
	}
	
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear = (rear + 1)%capacity;
		arr[rear] = data;
		size++;
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		int item = arr[front];
		front = (front + 1)%capacity;
		size--;
		return item;
	}
	
	public void iterate() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		Arrays.stream(arr).forEach(val -> System.out.println(val));
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		return arr[front];
	}
	
}
