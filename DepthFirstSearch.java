/**
 * This class includes a recursive method to traverse
 * the tree in depth-first preorder manner.
 * @author chessicanation
 *	CS215ON
 *	Assignment 6.1
 */

public class DepthFirstSearch 
{       
	Node root;

	/**
	 * Empty-argument constructor that contains a print statement.
	 */
	public DepthFirstSearch()
    {               
		System.out.println("Call DFS with root node to do a Depth First Search.");
    }//end empty-argument constructor
    
	/**
	 * This method performs two recursive calls to the children
	 * if the node is not a leaf and then prints the value of the data.
	 * @param node
	 */
	public void DFS(Node node)        
	{
		System.out.println(node.getData()); 
		
		if(node.getlChild()!=null && node.getrChild()!=null)
			{
				DFS(node.getlChild());
				DFS(node.getrChild());
			}//end if

     }//end DFS

}//end class