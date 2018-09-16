import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class Topological {

	/* Visit all the nodes in a particular order */
	public static void main(String[] args) {
		Map<Node,List<Node>> adjList = new HashMap<Node,List<Node>>();

		// Level is considered as inDegree of a node
		
		Node a = new Node("a");
		a.setLevel(0);
		Node b = new Node("b");
		b.setLevel(1);
		Node c = new Node("c");
		c.setLevel(2);
		Node d = new Node("d");
		d.setLevel(3);
		Node e = new Node("e");
		e.setLevel(2);
		Node f = new Node("f");
		f.setLevel(1);

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
		
		topologicalSort(adjList);

	}
	
	public static void topologicalSort(Map<Node, List<Node>> adjList){
		
		Queue<Node> Q = new LinkedList<Node>();
		
		for(Node node : adjList.keySet()){
			
			if(node.getLevel() == 0){
				 
				Q.add(node);
			}
		}
		
		while(!Q.isEmpty()){
			
			Node curr = Q.poll();
			
			System.out.println(curr);
			
			for(Node node : adjList.get(curr)){
				
				node.setLevel(node.getLevel() - 1);
				
				if(node.getLevel() == 0){
					
					Q.add(node);
				}
			}
		}
	}

}
