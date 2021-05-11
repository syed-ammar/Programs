
public class Node {
	private String value;
	private boolean visited = false;
	private int level;
	private Node parent;
	private Node left;
	private Node right;
	
	public Node(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public int hashCode() {
		
		return this.getValue().hashCode()+37;
	}

	@Override
	public boolean equals(Object obj) {
		Node object = (Node)obj;

		return this.value.equals(object.getValue());
	}

	@Override
	public String toString() {
		
		return this.value+" "+this.level+" ";
	}
	
}
