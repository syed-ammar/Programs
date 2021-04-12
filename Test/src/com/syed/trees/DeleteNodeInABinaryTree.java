package com.syed.trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNodeInABinaryTree
{
    public static void main(String[] args) throws Exception
    {
        Node root = new Node("10");
        root.left = new Node("11");
        root.left.right = new Node("12");
        root.left.left = new Node("7");
        root.right = new Node("9");
        root.right.left = new Node("15");
        root.right.right = new Node("8");
        inorder(root);
        System.out.println("");
        delete(root,"12");
        inorder(root);
    }

    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.value + " ");
        inorder(temp.right);
    }
    public static void delete(Node node, String key) throws Exception
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        Node keyNode = null;
        Node curr = null;

        /*Level order tree traversal*/
        while (!queue.isEmpty())
        {
            curr = queue.poll();
            if(curr == null)
                throw new Exception("Node cannot be null");

            if (curr.value.equals(key))
            {
                keyNode = curr;
            }

            if (curr.left != null)
            {
                queue.add(curr.left);
            }

            if (curr.right != null)
            {
                queue.add(curr.right);
            }

        }

        if (keyNode != null)
        {
            if (keyNode == curr)
            {
                keyNode = null;
            }
            else
            {
                String temp = (String) curr.value;
                deleteDeepest(node,(String)curr.value);
                keyNode.value = temp;
            }
        }
    }

    public static void deleteDeepest(Node root, String key)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node curr = null;
        while (!queue.isEmpty())
        {
            curr = queue.poll();

            if (curr.left != null)
            {
                if (curr.left.value.equals(key))
                {
                    curr.left = null;
                    return;
                }
                else
                {
                    queue.add(curr.left);
                }
            }

            if (curr.right != null)
            {
                if (curr.right.value.equals(key))
                {
                    curr.right = null;
                    return;
                }
                else
                {
                    queue.add(curr.right);
                }
            }

        }
    }
}
