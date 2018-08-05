package com.datastructures.linkedlist;

import java.util.Iterator;
//import java.util.Optional;

public class LinkedList<T> implements Iterable<Node<T>> {

	Node<T> head;

	public LinkedList() {
		super();
	}

	public LinkedList(Node<T> node) {
		super();
		this.head = node;
	}

	public LinkedList(T data) {
		super();
		this.head = new Node<T>(data);
	}

	public Node<T> getHead() {
		return head;
	}

	public void append(T data) {
		if (this.head == null) {
			this.head = new Node<T>(data);
			return;
		}

		Node<T> node = this.head;

		while (node.next != null) {
			node = node.next;
		}
		node.next = new Node<T>(data);

	}

	public void insert(T data, int pos) {
		if (this.head == null) {
			this.head = new Node<T>(data);
			return;
		}
		Node<T> node = this.head;

		if (pos == 0) {
			this.head = new Node<T>(data);
			this.head.next = node;
			return;
		}

		int counter = 0;
		while (node.next != null) {
			if (counter + 1 == pos) {
				Node<T> tempN = node.next;
				node.next = new Node<T>(data);
				node.next.next = tempN;
				return;
			}
			counter++;
		}
	}

	public void delete(T data) {
		if (this.head == null)
			return;

		Node<T> dataN = new Node<T>(data);
		Node<T> node = this.head;

		if (node.equals(dataN)) {
			this.head = this.head.next;
			return;
		}

		while (node.next != null) {
			if (node.next.equals(dataN)) {
				node.next = node.next.next;
				return;
			}
			node = node.next;
		}

	}

	public void prepend(T data) {
		if (this.head == null) {
			this.head = new Node<T>(data);
			return;
		}
		Node<T> node = this.head;
		this.head = new Node<T>(data);
		this.head.next = node;
	}

	public void reverse() {
		if (this.head == null || this.head.next == null)
			return;

		Node<T> node = this.head;
		Node<T> prev = null;

		while (node.next != null) {
			Node<T> tempN = node.next;
			node.next = prev;
			prev = node;
			node = tempN;
			if (node.next == null) {
				this.head = node;
				this.head.next = prev;
				return;
			}
		}

	}

	@Override
	public String toString() {
		if (this.head == null) {
			return "LinkedList null";
		}

		Node<T> n = this.head;
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		while (n != null) {
			sb.append("LinkedList[" + counter + "]=" + n.data.toString() + System.lineSeparator());
			n = n.next;
			counter++;
		}
		return sb.toString();
	}

	@Override
	public Iterator<Node<T>> iterator() {
		return new NodeIterator<T>(this.head);
	}
}
