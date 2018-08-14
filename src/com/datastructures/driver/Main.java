package com.datastructures.driver;


import com.datastructures.linkedlist.LinkedList;
import com.datastructures.linkedlist.Node;
import com.datastructures.queue.Queue;
import com.datastructures.stack.Stack;

public class Main {

	public static void main(String[] args) {
		
		Queue<Integer> qu = new Queue<>();
		System.out.println("Add 2");
		qu.add(2);
		System.out.println("Peek: " + qu.peek());
		System.out.println("Add 3");
		qu.add(3);
		System.out.println("Peek: " + qu.peek());
		System.out.println("Add 4");
		qu.add(4);
		System.out.println("Peek: " + qu.peek());
		System.out.println("Remove: " + qu.remove());
		System.out.println("Remove: " + qu.remove());
		System.out.println("Remove: " + qu.remove());
		System.out.println("Remove: " + qu.remove());
		System.out.println("Remove: " + qu.remove());
		System.out.println("Add 4");
		qu.add(4);
		System.out.println("Peek: " + qu.peek());
		System.out.println("Remove: " + qu.remove());
		System.out.println("Remove: " + qu.remove());
		System.out.println("Remove: " + qu.remove());
		
		
		System.exit(0);
		Stack<Integer> st = new Stack<>();
		System.out.println("Push: " + 2);
		st.push(2);
		System.out.println("Push: " + 33);
		st.push(33);
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		System.out.println("Pop: " + st.pop());
		
		System.exit(0);
		
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
		System.out.println("----------------Recursion--------------------------");
		System.out.println("----print nodes----");
		ll.getHead().printNodes(ll.getHead());
		System.out.println("---print reverse nodes---");
		ll.getHead().reversePrintNodes(ll.getHead());

	}
}
