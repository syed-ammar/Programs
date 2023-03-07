package com.syed.trees;

import com.sun.tools.javac.util.StringUtils;

public class BinarySearchTree
{
    private Node<Integer> root;

    public BinarySearchTree(){}
    public BinarySearchTree(Node<Integer> root)
    {
        this.root = root;
    }

    public Node<Integer> lookUp(int key)
    {
        Node<Integer> curr = this.root;
        Node<Integer> result = null;
        while (curr != null) {
            if (curr.value == key) {
                result = curr;
                break;
            } else if (key > curr.value) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        if (result == null)
            throw new RuntimeException("Key not found");
        return result;
    }

    public Node<Integer> lookUpRecursively(Node<Integer> node, int key, StringBuilder path){

        if(node == null || node.value == key){
            return node;
        }

        if(key > node.value){
            return lookUpRecursively(node.right, key, path.append(1));
        } else {
            return lookUpRecursively(node.left, key, path.append(0));
        }
    }

    public Node<Character> lookUpRecursivelyChar(Node<Character> node, Character key, StringBuilder path){

        if(node == null || node.value == key){
            return node;
        }

        if(key > node.value){
            return lookUpRecursivelyChar(node.right, key, path.append(1));
        } else {
            return lookUpRecursivelyChar(node.left, key, path.append(0));
        }
    }

    public void insert(int key)
    {
        Node<Integer> curr = this.root;
        while (true) {
            if (curr.value == key)
                throw new RuntimeException("Key already exists");
            if (key > curr.value) {
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new Node<>(key);
                    break;
                }
            } else if (key < curr.value) {
                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new Node<>(key);
                    break;
                }
            }
        }
    }

    public void insertChar(Node<Character> curr, Character key)
    {
        //Node<Character> curr = this.root;
        while (true) {
            if (curr.value == key)
                throw new RuntimeException("Key already exists");
            if (key > curr.value) {
                if (curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = new Node<>(key);
                    break;
                }
            } else if (key < curr.value) {
                if (curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = new Node<>(key);
                    break;
                }
            }
        }
    }

    public Node<Integer> deleteNode(Node<Integer> root, int key)
    {
        if (root == null) {
            return root;
        }

        if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left == null) {
                root.value = findInorderSuccessor(root.right);
                root.right = deleteNode(root.right, root.value);
            } else {
                root.value = findInorderPredecessor(root.left);
                root.left = deleteNode(root.left, root.value);
            }
        }
        return root;
    }

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
        //TreeTraversals.inOrder(root);
        /*root.left = new NodeInt(7);
        root.left.right = new NodeInt(9);
        root.left.right.left = new NodeInt(8);
        root.right = new NodeInt(11);
        root.right.right = new NodeInt(15);*/
        Node<Integer> result = bst.lookUp(8);
        bst.deleteNode(root, 7);
        System.out.println("Found :" + result.value);
        TreeTraversals.inOrder(root);
        StringBuilder path = new StringBuilder();
        Node<Integer> resultForRecursion = bst.lookUpRecursively(root,8,path);
        System.out.println("Found using recursion:" + resultForRecursion.value+ " With path "+path.toString());

        Node<Character> charRoot = new Node<>('F');
        BinarySearchTree bstChar = new BinarySearchTree();
        bst.insertChar(charRoot,'B');
        bst.insertChar(charRoot,'G');
        bst.insertChar(charRoot,'A');
        bst.insertChar(charRoot,'D');
        bst.insertChar(charRoot,'I');
        bst.insertChar(charRoot,'C');
        bst.insertChar(charRoot,'E');
        bst.insertChar(charRoot,'H');

        StringBuilder pathChar = new StringBuilder();
        Node<Character> resultForRecursionChar = bstChar.lookUpRecursivelyChar(charRoot,'C',pathChar);
        System.out.println("Found using recursion:" + resultForRecursionChar.value+ " With path "+pathChar.toString());

    }

    public int findInorderSuccessor(Node<Integer> root)
    {
        while (root.left != null) {
            root = root.left;
        }
        return root.value;
    }

    public int findInorderPredecessor(Node<Integer> root)
    {
        while (root.right != null) {
            root = root.right;
        }
        return root.value;
    }
}
