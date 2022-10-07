/**
 * This method represents a tree of nodes.
 * @author Nathan Johnson, Bellarmine University and Chessica Nation
 * CS215ON
 *	Assignment 6.1
 */
import java.util.Queue; // import the Queue class
import java.util.LinkedList;

public class Tree 
{
	private int height;
	private Node root;
	
	/**
	 * Empty-argument constructor
	 */
	public Tree()
	{
		setRoot(new Node(1));
	}//end empty-argument constructor
	
	/**
	 * Getter for root
	 * @return the root
	 */
	public Node getRoot() 
	{
		return root;
	}//end getRoot
	
	/**
	 * Setter for root
	 * @param root the root to set
	 */
	public void setRoot(Node root) 
	{
		this.root = root;
	}//end setRoot

	//returns the root node
	/**
	 * This method generates a practice tree where the height
	 * is taken as a parameter and it returns the root node.
	 * @param height
	 * @return
	 */
	public Node generatePracticeTree(int height)
	{
	   this.height=height;
	   int level=1;
	   //Creating tree breadth-first so
	   //Put the child nodes in a queue
	   Queue <Node> childQ=new LinkedList<Node>();
	   Node pn=root;
	   //Create the children of the root and put some data
	   //Put them in the child queue
	   //int value=pn.getData();
		
	   		childQ.add(pn);
	   		System.out.println ("Root Node value: "+pn.getData());
	   		int value=pn.getData();
	   		   	
	   		//Remove the front of the queue
	   		//Create its children
	   		//Put them in the queue
	   		//Data is just parent data+1 or 2 depending on which child
	   while (level<(height) && !childQ.isEmpty())
			 {
				 System.out.println("Level is: "+level);
				 for(int i=1;i<=Math.pow(2,(level-1));i++)
				 {
					 pn=childQ.remove();
					 System.out.println("Parent Node value: "+pn.getData());
					 value++;
					 System.out.println("Adding Left Child: "+(value));
					 pn.setlChild(new Node(value));
					 childQ.add(pn.getlChild());
					 value++;
					 System.out.println("Adding Right Child: "+(value));
					 pn.setrChild(new Node(value));
					 childQ.add(pn.getrChild());
				 }//end for
					 
				 level++;System.out.println("Level: "+level);
			 }//end while
			 
		return root;
		
	}//end generatePracticeTree
	
	/**
	 * This method returns the height of the tree.
	 * @return
	 */
	public int getHeight()
	{
		height = 0;
		if(root != null)
			height = root.getHeight();
		return height;
	}//end getHeight
	
	/**
	 * This method returns the number of nodes in the tree.
	 * @return
	 */
	public int getNumOfNodes()
	{
		int numOfNodes = 0;
		if(root != null)
			numOfNodes = root.getNumOfNodes();
		return numOfNodes;
	}//end getNumOfNodes
	
}//end class

