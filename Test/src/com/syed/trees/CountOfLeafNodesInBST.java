package com.syed.trees;

public class CountOfLeafNodesInBST
{
    public static void main(String[] args)
    {
        Node<Integer> root = new Node<>(10);
        BinarySearchTree bst = new BinarySearchTree(root);
        bst.insert(7);
        bst.insert(9);
        bst.insert(8);
        bst.insert(2);
        bst.insert(11);
        bst.insert(15);
        System.out.println("Total countLeafNodes :" + countLeafNodes(root));
    }

    private static int countLeafNodes(Node root)
    {
        if(root == null){
            return 0;
        }

        if(root.right == null && root.left == null)
        {
            return 1;
        }

        return countLeafNodes(root.right)+ countLeafNodes(root.left);

    }
}
