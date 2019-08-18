package com.syed.linkedlist;

/**
 * @author sammar
 *
 */
public class PartitionListAroundX {

	/**
	 * @param args
	 */
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

		LinkedNode newList = partitionList(node1,node5);
		while(newList.next != null) {
			System.out.println(newList);
			newList = newList.next;
		}
	}

	private static LinkedNode partitionList(LinkedNode head, LinkedNode xNode) {
		LinkedNode beforeHead = null;
		LinkedNode beforeTail = null;
		LinkedNode afterHead = null;
		LinkedNode afterTail = null;
		LinkedNode temp = head;

		while(temp != null ) {
			LinkedNode node = new LinkedNode(temp.getValue(),null);
				if(temp.getValue() > xNode.getValue()) {
					if(afterHead == null) {
						afterHead = afterTail =node;
					} else {
						afterTail.next = node;
						afterTail = node;
					}
				} else {
					if(beforeHead == null) {
						beforeHead = beforeTail =node;
					} else {
						beforeTail.next = node;
						beforeTail = node;
					}
				}
			
			temp = temp.next;
		}

		if(beforeHead == null) {
			return afterHead;
		}

		if(afterHead == null) {
			return beforeHead;
		}

		beforeTail.next = afterHead;
		return beforeHead;
	}

}
