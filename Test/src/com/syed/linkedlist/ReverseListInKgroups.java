package com.syed.linkedlist;

import com.syed.trees.Node;

public class ReverseListInKgroups
{
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

        printNodes(node1, "Before reverse");
        LinkedNode node = reverseList(node1,4);
        printNodes(node, "After reverse");

    }

    public static LinkedNode reverseList(LinkedNode head, int k) {
        if (head == null) {
            return head;
        }

        LinkedNode curr = head;
        LinkedNode next = curr.next;
        int count = 0;
        LinkedNode currHead = head, currTail = head;
        LinkedNode newHead = null;
        LinkedNode prevTail = null;

        while (curr != null && curr.next != null) {
            while (curr.next != null && count < k - 1) {
                LinkedNode temp = next.next;
                next.next = curr;
                curr = next;
                next = temp;
                currTail = curr;
                count++;
            }
            if (newHead == null) {
                newHead = curr;
            }
            curr = next;
            next = next!= null ? next.next : null;

            if (prevTail != null) {
                prevTail.next = currTail;
            }
            prevTail = currHead;
            currHead.next = curr;
            currHead = curr;
            currTail = curr;
            count = 0;
        }
        return newHead;
    }

    private static void printNodes(LinkedNode node, String stage)
    {
        System.out.println(stage);
        while(node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }
}
