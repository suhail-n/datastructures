package com.datastructures.stack;

import java.util.EmptyStackException;
import java.util.Optional;

public class Stack<T> {
	private static class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			super();
			this.data = data;
		}
	}
	private Node<T> top;
	
	public boolean isEmpty() {
		return this.top == null;
	}
	public T peek() {
		if(this.top == null) throw new EmptyStackException();
		return this.top.data;
	}
	public void push(T data) {
		Node<T> dat = new Node<T>(data);
		if(this.top == null) {
			this.top = dat;
			return;
		}
		dat.next = this.top;
		this.top = dat;
	}
	public T pop() {
		if(!Optional.ofNullable(this.top).isPresent()) throw new EmptyStackException();
		T data = this.top.data;
		if(Optional.ofNullable(this.top.next).isPresent()) {
			this.top = this.top.next;
		} else {
			this.top = null;
		}
		return data;
	}
	
	
}
