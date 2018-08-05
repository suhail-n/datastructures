package com.datastructures.linkedlist;

public class Node<T> {

	public T data;
	public Node<T> next;

	public Node() {
		super();
	}

	public Node(T data) {
		super();
		this.data = data;
	}

	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

}
