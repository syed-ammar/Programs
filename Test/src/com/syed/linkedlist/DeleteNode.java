package com.syed.linkedlist;

/**
 * @author sammar
 *
 */
public class DeleteNode {

	public static void main(String[] args) {
		LinkedNode node1 = new LinkedNode(1, null);
		LinkedNode node2 = new LinkedNode(2, null);
		LinkedNode node3 = new LinkedNode(1, null);
		LinkedNode node4 = new LinkedNode(1, null);
		LinkedNode node5 = new LinkedNode(3, null);
		LinkedNode node6 = new LinkedNode(4, null);
		LinkedNode node7 = new LinkedNode(3, null);
		LinkedNode node8 = new LinkedNode(5, null);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(node7);
		node7.setNext(node8);
		
		removeNode(node4);
		System.out.println(node1);
		while(node1.getNext() != null) {		
			node1 = node1.getNext();
			System.out.println(node1);
		}
	}

	private static void removeNode(LinkedNode node4) {
		node4.setValue(node4.next.getValue());
		node4.next = node4.next.next;
	}
}
