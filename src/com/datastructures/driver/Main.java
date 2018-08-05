package com.datastructures.driver;

import com.datastructures.linkedlist.LinkedList;
import com.datastructures.linkedlist.Node;

public class Main {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println("Appending");
		ll.append(1);
		ll.append(2);
		ll.append(3);
		System.out.println("Head=" + ll.getHead().data);
		System.out.println("Prepending 4");
		ll.prepend(4);
		;
		System.out.println("Head=" + ll.getHead().data);
		System.out.println("LinkedList String representation");
		System.out.println(ll.toString());
		System.out.println("Inserting at pos 2");
		ll.insert(5, 2);
		System.out.println("LinkedList String representation");
		System.out.println(ll.toString());
		System.out.println("Deleting 2");
		ll.delete(2);
		System.out.println("To string=\n" + ll.toString());
		System.out.println("Reversing");
		ll.reverse();
		System.out.println(ll.toString());
		System.out.println("-------------");
		for (Node<Integer> node : ll) {
			System.out.println("Node=" + node.data);
		}

	}
}
