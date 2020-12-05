package com.syed.trees;

public class DeleteNodeInABinaryTree
{
    public static void main(String[] args) {
        Node root = new Node("10");
        root.left = new Node("11");
        root.left.right = new Node("12");
        root.left.left = new Node("7");
        root.right = new Node("9");
        root.right.left = new Node("15");
        root.right.right = new Node("8");
        inorder(root);
        delete(root,"12",null);
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
    public static Node delete(Node node, String key, Node dNode)
    {
        if (node != null)
              System.out.println("Value of Node : "+node.value);

        if (node == null)
        {
            return null;
        }
        if (node.value.equals(key))
        {
            System.out.println("Node found");
            dNode = node;
        }
        delete(node.left, key, dNode);
        delete(node.right,key, dNode);
        if (dNode != null)
        {
            dNode.value = node.value;
            System.out.println("Value of dNode : "+node.value);
        }

        return dNode;
    }
}
