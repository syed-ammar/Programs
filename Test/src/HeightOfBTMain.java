
/**
 * 
 */

/**
 * @author sammar
 *
 */
public class HeightOfBTMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			HeightOfBT.Node a = new HeightOfBT.Node("a");
			HeightOfBT.Node b = new HeightOfBT.Node("b");
			HeightOfBT.Node c = new HeightOfBT.Node("c");
			HeightOfBT.Node d = new HeightOfBT.Node("d");
			
			HeightOfBT tree = new HeightOfBT();
			tree.root = a;
			a.left = b;
			b.left = d;
			a.right = c;
			System.out.println("Height : "+tree.getTheLevel(tree.root));
			//System.out.println("Max value : "+tree.getTheLevelAndVal(tree.root, 0).value);
	}

}
