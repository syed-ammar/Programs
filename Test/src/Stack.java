import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 */

/**
 * @author sammar
 *
 */
public class Stack {

	private Queue<Integer> q1 = new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();

	public void push(int element) {
		q2.add(element);
		
		for(Integer obj : q1) {
			q2.add(q1.poll());
		}
		
		swap();
	}

	public int pop() {
		return q1.poll();
	}
	
	public void swap()
	{
		Queue temp = q1;
		q1 = q2;
		q2 = temp;
	}
}
