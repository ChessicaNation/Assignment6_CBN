/**
 * This class represents a node that may appear in a tree.
 * @author Nathan Johnson, Bellarmine University and Chessica Nation
 *	CS215ON
 *	Assignment 6.1
 */

public class Node 
{
	private int data;
	private Node lChild;
	private Node rChild;
	
	/**
	 * Preferred constructor
	 * @param data
	 */
	public Node(int data)
	{
		lChild=null;
		rChild=null;
		this.data=data;
	}//end preferred constructor
	
	/**
	 * This public method uses the private helper method
	 * getHeight() to return the height of the tree.
	 * @return
	 */
	public int getHeight()
	{
		return getHeight(this);
	}//end public getHeight
	
	/**
	 * This private method is a helper method to return
	 * the height of the tree.
	 * @param node
	 * @return
	 */
	private int getHeight(Node node)
	{
		int height = 0;
		if(node != null)
			height = 1 + Math.max(getHeight(node.getlChild()), getHeight(node.getrChild()));
		return height;
	}//end private getHeight
	
	/**
	 * This method returns the number of nodes in the tree.
	 * @return
	 */
	public int getNumOfNodes()
	{
		int lNum = 0;
		int rNum = 0;
		if(lChild != null)
			lNum = lChild.getNumOfNodes();
		if(rChild != null)
			rNum = rChild.getNumOfNodes();
		return 1 + lNum + rNum;
	}//end getNumOfNodes
	
	/**
	 * Getter for data
	 * @return the data
	 */
	public int getData() 
	{
		return data;
	}//end getData
	
	/**
	 * Setter for data
	 * @param data the data to set
	 */
	public void setData(int data) 
	{
		this.data = data;
	}//end setData
	
	/**
	 * Getter for lChild
	 * @return the lChild
	 */
	public Node getlChild() 
	{
		return lChild;
	}//end getlChild
	
	/**
	 * Setter for lChild
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) 
	{
		this.lChild = lChild;
	}//end setlChild
	
	/**
	 * Getter for rChild
	 * @return the rChild
	 */
	public Node getrChild() 
	{
		return rChild;
	}//end getrChild
	
	/**
	 * Setter for rChild
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) 
	{
		this.rChild = rChild;
	}//end setrChild
	
}//end class