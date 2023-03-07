package com.syed.linkedlist;

public class AddNumbersUsingLinkedList {

	private static LinkedNode newHead = null;
	private static LinkedNode newTail = null;
	
	public static void main(String[] args) {
		LinkedNode node1 = new LinkedNode(1, null);
		LinkedNode node2 = new LinkedNode(2, null);
		LinkedNode node3 = new LinkedNode(4, null);
		//LinkedNode node4 = new LinkedNode(4, null);
		LinkedNode node5 = new LinkedNode(5, null);
		LinkedNode node6 = new LinkedNode(6, null);
		
		node3.next = node2;
		node2.next = node1;
		
		node6.next = node5;
		//node5.next = node4;
		
		addNumbers(node3, node6);
	}

	private static void addNumbers(LinkedNode node3, LinkedNode node6) {
		int val1;
		int val2;
		int rem = 0;
		int quo = 0;
		while(node3 != null && node6 != null)
		{
			val1 = node3.getValue();
			val2 = node6.getValue();
			int total = val1 + val2 + quo;
			quo = total/10;
			rem = total % 10;
			addToList(new LinkedNode(rem,null));
			node3 = node3.next;
			node6 = node6.next;
		}
		
		while(node3 != null) {
			addToList(new LinkedNode(node3.getValue(), null));
			node3 = node3.next;
		}
		
		while(node6 != null) {
			addToList(new LinkedNode(node6.getValue(), null));
			node6 = node6.next;
		}
		
		while(newHead != null)
		{
			System.out.println(newHead);
			newHead = newHead.next;
			
		}
	}
	
	private static LinkedNode addToList(LinkedNode node)
	{
		if(newHead == null) {
			newHead = node;
			newTail = node;
		} else {
			newTail.next = node;
			newTail = node;
		}
		
		return newHead;
	}

}
