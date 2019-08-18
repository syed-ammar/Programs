package com.syed.linkedlist;

/**
 * @author sammar
 *
 */
public class KthElementFromEnd {

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
		
		LinkedNode kNode = findTheElement(node1,2);
		System.out.println(kNode);
	}

	private static LinkedNode findTheElement(LinkedNode node1, int k) {
		LinkedNode p1 = node1;
		LinkedNode p2 = node1;
		
		/*Make p2 point k nodes from the start*/
		for(int i=0 ; i <k ; i++) {
			p2 = p2.getNext();
		}
		
		/*Once this loop is done, P1 will be pointing to kth element from the end*/
		while(p2.getNext() != null) {
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		
		return p1;
	}
}
