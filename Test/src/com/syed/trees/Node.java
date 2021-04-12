package com.syed.trees;

public class Node<T>
{
    T value;
    public Node<T> left, right;
    Node(T val){
        this.value = val;
        this.left = null;
        this.right = null;
    }
}
