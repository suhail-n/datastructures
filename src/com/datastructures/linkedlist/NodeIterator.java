package com.datastructures.linkedlist;

import java.util.Iterator;
import java.util.Optional;

public class NodeIterator<T> implements Iterator<Node<T>> {
	private Node<T> current;
	private Node<T> next;

	public NodeIterator(Node<T> node) {
		super();
		this.next = node;

	}

	public boolean hasNext() {
		if (current == null) {
			current = this.next;
			return Optional.ofNullable(current).isPresent();
		} else {
			current = current.next;
			return Optional.ofNullable(current).isPresent();
		}
	}

	public Node<T> next() {
		return current;
	}
}
