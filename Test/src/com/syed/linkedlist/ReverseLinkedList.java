package com.syed.linkedlist;

public class ReverseLinkedList
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
        reverse(node1);
        printNodes(node8, "After reverse");

    }

    private static void reverse(LinkedNode head)
    {
        LinkedNode nextNode;
        LinkedNode tempNode;

        nextNode = head.next;
        head.next = null;

        while (nextNode != null)
        {
            tempNode = nextNode.next;
            nextNode.next = head;
            head = nextNode;
            nextNode = tempNode;
        }
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
