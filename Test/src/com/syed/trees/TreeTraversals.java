package com.syed.trees;

public class TreeTraversals
{
    /* Pre-order traversal of a binary tree*/
    public static void preOrder(Node root){
        if (root == null)
            return;

       System.out.println(root.value);
       preOrder(root.left);
       preOrder(root.right);
    }

    /* In-order traversal of a binary tree*/
    public static void inOrder(Node root){
        if (root == null)
            return;
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    /* Post-order traversal of a binary tree*/
    public static void postOrder(Node root){
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
}
