package Linked;

import javax.xml.soap.Node;

@SuppressWarnings("unused")
public abstract class LinkedQueue<T>  implements QueueInterface<T> { 
	
	private Node firstNode;
	private Node lastNode;
	
	public LinkedQueue(){
		firstNode = null;
		lastNode = null;
		
	
	}
	
	private class Node{
	private T data; // Entry in queue
	private Node next; // Link to next node
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {//setter for next node
		this.next = next;
	}
	public T getData() {// getter for data
		return data;
	}

	public void setData(T data) { // setter for data
		this.data = data;
	}
	}
	
}
