import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class DFS {

	static int count = 0;
	
	public static void main(String[] args) {
		Map<Node,List<Node>> adjList = new HashMap<Node,List<Node>>();

		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");

		List<Node> aList = new LinkedList<Node>();
		aList.add(b);
		aList.add(c);
		aList.add(e);

		adjList.put(a, aList);

		List<Node> bList = new LinkedList<Node>();
		bList.add(a);
		bList.add(c);
		bList.add(d);

		adjList.put(b, bList);

		List<Node> cList = new LinkedList<Node>();
		cList.add(a);
		cList.add(b);
		cList.add(f);

		adjList.put(c, cList);

		List<Node> eList = new LinkedList<Node>();
		eList.add(a);
		eList.add(f);
		eList.add(d);

		adjList.put(e, eList);

		List<Node> fList = new LinkedList<Node>();
		fList.add(c);
		fList.add(e);
		fList.add(d);

		adjList.put(f, fList);

		List<Node> dList = new LinkedList<Node>();
		dList.add(b);
		dList.add(f);
		dList.add(e);

		adjList.put(d, dList);

		dfs(adjList);
	}

	public static void dfs(Map<Node,List<Node>> adjList){

		for(Node node : adjList.keySet()){

			if(!node.isVisited()){

				node.setVisited(true);
				
				node.setLevel(count++);

				dfsVisit(node, adjList);

			}
		}
	}

	public static void dfsVisit(Node v, Map<Node, List<Node>> adjList){

		System.out.println(v.toString());
		
		for(Node node : adjList.get(v)){

			if(!node.isVisited()){

				node.setLevel(count++);

				node.setVisited(true);

				dfsVisit(node, adjList);
			}
		}
	}
	
}
