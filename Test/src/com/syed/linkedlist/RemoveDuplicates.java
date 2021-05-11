/*

 */
package com.syed.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sammar
 *
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedNode node1 = new LinkedNode(1, null);
		LinkedNode node2 = new LinkedNode(2, null);
		LinkedNode node3 = new LinkedNode(1, null);
		LinkedNode node4 = new LinkedNode(1, null);
		LinkedNode node5 = new LinkedNode(1, null);
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

        LinkedNode temp = node1;
        removeDuplicates(node1);
	}
	
	private static void removeDuplicates(LinkedNode head) {
		
		Set<Integer> set = new HashSet<>();
		set.add(head.getValue());
		LinkedNode curr = head;
		while(curr.getNext() != null)
		{
			if(set.contains(curr.getNext().getValue()))
			{
				//Keep changing the next pointer till we find the unique element
				curr.setNext(curr.getNext().getNext());
				//curr =curr.getNext();
			}
			else
			{
				curr = curr.getNext();
				set.add(curr.getValue());
			}
		}
		
		System.out.println(head);
		while(head.getNext() != null) {		
			head = head.getNext();
			System.out.println(head.toString());
		}
	}

}
