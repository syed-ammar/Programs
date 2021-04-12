package com.syed.trees;

public class InsertNodeInABinaryTree
{
    public static void main(String[] args) {
        Node root = new Node("10");
        root.left = new Node("11");
        root.left.left = new Node("7");
        root.right = new Node("9");
        root.right.left = new Node("15");
        root.right.right = new Node("8");
        insert(root,"12");
        TreeTraversals.inOrder(root);

    }

    public static Node insert(Node root, String key)
    {
        Node newNode = null;
        if (root == null)
        {
            System.out.println("Node is null");
            return null;
        }

        if (root.left == null)
        {
            newNode = new Node(key);
            root.left = newNode;
        }
        else if (root.right == null)
        {
            newNode = new Node(key);
            root.right = newNode;
        }
        else
        {
            newNode = insert(root.left, key);

            if(newNode == null)
            {
                insert(root.right, key);
            }

        }
        return newNode;
    }
}
