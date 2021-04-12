package com.syed.trees;

public class BinarySearchTree
{
    private Node root;

    public BinarySearchTree(Node root)
    {
        this.root = root;
    }

    public Node lookUp(int key)
    {
        Node curr = this.root;
        Node result = null;
        while (curr != null) {
            if ((int)curr.value == key) {
                result = curr;
                break;
            } else if (key > (int)curr.value) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        if (result == null)
            throw new RuntimeException("Key not found");
        return result;
    }

    public void insert(int key)
    {
        Node curr = this.root;
        while (true){
            if ((int)curr.value == key)
                throw new RuntimeException("Key already exists");
            if(key > (int)curr.value){
                if (curr.right != null){
                    curr = curr.right;
                } else {
                    curr.right = new Node(key);
                    break;
                }
            } else if (key < (int)curr.value){
                if (curr.left != null){
                    curr = curr.left;
                } else {
                    curr.left = new Node(key);
                    break;
                }
            }
        }
    }

    public Node deleteNode(Node root, int key) {
        if(root == null){
            return root;
        }

        if(key > (int) root.value) {
            root.right = deleteNode(root.right, key);
        }
        else if (key < (int) root.value) {
            root.left = deleteNode(root.left, key);
        } else {
            if(root.left == null && root.right == null){
                root = null;
            } else if (root.left == null && root.right != null){
                root.value = findInorderSuccessor(root.right);
                root.right = deleteNode(root.right, (int)root.value);
            } else {
                root.value = findInorderPredecessor(root.left);
                root.left = deleteNode(root.left, (int)root.value);
            }
        }
        return root;
    }

    public static void main(String args[])
    {
        Node root = new Node(10);
        BinarySearchTree bst = new BinarySearchTree(root);
        bst.insert(7);
        bst.insert(9);
        bst.insert(8);
        bst.insert(2);
        bst.insert(11);
        bst.insert(15);
        TreeTraversals.inOrder(root);
        /*root.left = new NodeInt(7);
        root.left.right = new NodeInt(9);
        root.left.right.left = new NodeInt(8);
        root.right = new NodeInt(11);
        root.right.right = new NodeInt(15);*/
        Node result = bst.lookUp(8);
        bst.deleteNode(root,7);
        System.out.println("Found :" + result.value);
        TreeTraversals.inOrder(root);
    }

    public int findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return (int)root.value;
    }

    public int findInorderPredecessor(Node root){
        while(root.right != null){
            root = root.right;
        }
        return (int)root.value;
    }
}
