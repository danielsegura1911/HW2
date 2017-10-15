package CircularQueue;

import javax.xml.soap.Node;

public interface QueueInterface<T> {

@SuppressWarnings("rawtypes")
Node freeNode = null;
Object queueNode = null;

@SuppressWarnings({ "unchecked", "rawtypes" })
public default void enqueue(T newEntry, Node newNode){
	if(isChainFull()){
	//Allocate a new node and insert it after the node that freeNode references Node
	newNode = new Node(null,
	freeNode.getNextNode());
	freeNode.setNextNode(newNode);
	}
		freeNode = freeNode.getNextNode();
	}
		
	

	public default T dequeue() throws Exception {//sets the "first" node as null
		
		T front = getFront(); // Could throw Exception
		assert!isEmpty();
		((Node) queueNode).setData(null);
		queueNode = ((Node) queueNode).getNextNode();
		
	}

	public default T getFront() throws Exception { //gets the "first" nodes information
		if(isEmpty())// checks if all nodes are empty
		throw new Exception();
		else
		return (T) ((Node) queueNode).getData();
		}
		

	public default boolean isEmpty() { //checks if all nodes are empty
		return
				queueNode == freeNode;
				}
				default boolean isChainFull()
				{
				return queueNode == freeNode.getNextNode();
		
	}

}
	

