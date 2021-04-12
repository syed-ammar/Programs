package com.syed.trees; /**
 * 
 */

/**
 * @author sammar
 *
 */
public class HeightOfBT {

	Node root;
	public static class Node {
		String value;
		Node left, right;
		Node(String val){
			this.value = val;
			this.left = null;
			this.right = null;
		}
	}

	public int getTheLevel(Node node) {

		if(node == null) {
			return 0;
		}

		int leftHeight = getTheLevel(node.left);
		int rightHeight = getTheLevel(node.right);

		if(leftHeight > rightHeight) {
			return (leftHeight+1);
		} else {
			return (rightHeight+1);
		}
	}

	/*public void find(Node root, int level) {
		if (root != null) {
			find(root.left, ++level);
			if (level > deepestlevel) {
				value = root.data;
				deepestlevel = level;
			}
			find(root.right, level);
		}
	}*/
}
