package com.datastructures.queue;

public class Queue<T> {
	private static class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			super();
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	
	public boolean isEmpty() {
		return this.head == null;
	}
	public T peek() {
		if(this.head == null) return null;
		return this.head.data;
	}
	public void add(T data) {
		Node<T> dat = new Node<T>(data);
		if(this.head == null) {
			this.head = dat;
			return;
		}
		if(this.tail == null) {
			this.tail = dat;
			this.head.next = this.tail;
			return;
		}
		this.tail.next = dat;
		
	}
	public T remove(){
		if(this.head == null) {
			return null;
		}
		T data = this.head.data;
		this.head = this.head.next;
		return data;
	}
}
