package StackLinkedData;

import javax.xml.soap.Node;

public abstract class linkedData<T> implements StackInterface<T> {
	
	private Node topNode; // References the first node in the chain
	
	public linkedData()
	{
	setTopNode(null);
	
	} 

	public Node getTopNode() { //gets the first node
		return topNode;
	}

	public void setTopNode(Node topNode) { //sets the first node
		this.topNode = topNode;
	}

}
