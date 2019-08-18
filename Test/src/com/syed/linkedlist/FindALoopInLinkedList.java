package com.syed.linkedlist;

import java.util.function.BiConsumer;

/**
 * @author sammar
 *
 */
public class FindALoopInLinkedList {

	private static LinkedNode fast = null;
	private static LinkedNode slow = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedNode node1 = new LinkedNode(1, null);
		LinkedNode node2 = new LinkedNode(2, null);
		LinkedNode node3 = new LinkedNode(3, null);
		LinkedNode node4 = new LinkedNode(4, null);
		LinkedNode node5 = new LinkedNode(5, null);
		LinkedNode node6 = new LinkedNode(6, null);
		LinkedNode node7 = new LinkedNode(7, null);
		LinkedNode node8 = new LinkedNode(8, null);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(node7);
		node7.setNext(node8);
		node8.setNext(node4);
		
		LinkedNode collisionPoint = findTheLoopNode(node1);

	}

	private static LinkedNode findTheLoopNode(LinkedNode head) {
		
		fast = slow = head;
		slow = slow.next;
		fast = fast.next.next;
		
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next.next;
		}
		//loop((slow,fast)-> { slow = slow.next ; fast = fast.next.next;} );
		System.out.println("Meeting point : "+slow.getValue());
		
		slow = head;
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		System.out.println("Loop start : "+slow.getValue());
		return slow;
	}
	
	private static LinkedNode loop(BiConsumer<LinkedNode, LinkedNode> consumer) {
		
		while(slow != fast) {
			consumer.accept(slow, fast);
		}
		return slow;
		
	}

}
