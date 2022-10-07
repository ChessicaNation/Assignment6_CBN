/**
 * This class contains a main method to test the
 * Node, Tree, and DepthFirstSearch classes.
 * @author Nathan Johnson, Bellarmine University and Chessica Nation
 * CS215ON
 * Assignment 6.1
 */

public class Application 
{
	public static void main(String[] args)
	{
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		System.out.println();
		
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		System.out.println();
		
		System.out.println(aTree.getNumOfNodes() + " nodes were traversed.");
		System.out.println("The tree has a height of " + aTree.getHeight() + ".");
	}//end main

}//end class