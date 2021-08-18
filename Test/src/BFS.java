import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class BFS {

	/* BFS is used for traversing all the nodes in a graph from a given source node
	 * It used for Web crawling, social networking, find the shortest path
	 */
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

		bfs(adjList);
	}
	
	public static void bfs(Map<Node,List<Node>> adjList){
		Queue<Node> q = new LinkedList<Node>();
		
		int level = 0;
		
		Iterator<Node> it = adjList.keySet().iterator();
		
		Node start = it.next();
		
		start.setVisited(true);
		
		q.add(start);
		
		System.out.println("Start");
		
		while(!q.isEmpty()){
			
			Node curr = q.poll();
			
			level++;
			
			for(Node node : adjList.get(curr)){
				
				if(!node.isVisited()){
					
					node.setLevel(level);
					node.setVisited(true);
					node.setParent(curr);
					q.add(node);
				
				}
				
			}
		}
		
		System.out.println("End");
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		
		}
	}

	
}
