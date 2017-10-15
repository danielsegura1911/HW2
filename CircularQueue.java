package CircularQueue;

import javax.xml.soap.Node;

@SuppressWarnings("unused")
public abstract class CircularQueue<T> implements QueueInterface<T> {

	private Node queueNode; // References first node in the queue
	private Node freeNode; // References node in the back of the queue
	public CircularQueue()
	{
	freeNode = new Node(null, null); //creates new node and sets it as free
	freeNode.setNextNode(freeNode);
	setQueueNode(freeNode); 
	queueNode = freeNode;
	
	@SuppressWarnings("hiding")
	class Node{
	private T data; // Queue entry
	private Node next; // Link to next node
	}
	}
	
	
	
	public Node getQueueNode() { 
		return queueNode;
	}

	public void setQueueNode(Node queueNode) {
		this.queueNode = queueNode;
	}

	public class Node{
	public Node(Object object, Object object2) {
			// TODO Auto-generated constructor stub
		}
	public void setData(Object object) {
		// TODO Auto-generated method stub
		
	}
	public T getData() {
		// TODO Auto-generated method stub
		return null;
	}
	public CircularQueue<T>.Node getNextNode() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setNextNode(CircularQueue<T>.Node freeNode) {
		// TODO Auto-generated method stub
		
	}
	private T data; // Queue entry
	private Node next; // Link to next node
	}
	
}
