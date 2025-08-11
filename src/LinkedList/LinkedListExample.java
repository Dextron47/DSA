package LinkedList;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<>();
		
		// linked list as a stack
//		linkedlist.push("A");
//		linkedlist.push("B");
//		linkedlist.push("C");
//		linkedlist.push("D");
//		linkedlist.push("E");
//		linkedlist.pop();
		
		// linked list as a queue
		linkedlist.offer("A");
		linkedlist.offer("B");
		linkedlist.offer("C");
		linkedlist.offer("D");
    	linkedlist.offer("F");
//		linkedlist.poll();
		
		linkedlist.add(4, "E");
		linkedlist.remove("F");
		
		System.out.println(linkedlist.peekFirst());
		System.out.println(linkedlist.peekLast());
		linkedlist.addFirst("0");
		linkedlist.addLast("G");
		String first = linkedlist.removeFirst();
		String last = linkedlist.removeLast();
		
		
		System.out.println(linkedlist);
		
	}

}
