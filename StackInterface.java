package StackLinkedData;

import java.util.EmptyStackException;

import javax.xml.soap.Node;

public interface StackInterface<T> {
	
	   Node topNode = null;
	Object newEntry = null;


	/** Adds a new entry to the top of this stack.
	       @param newEntry  An object to be added to the stack. */
	   public void push(T newEntry); {
		   topNode = new Node(newEntry, topNode);  // places a new node at the top of the stack
		   } 
	  
	   /** Removes and returns this stack's top entry.
	       @return  The object at the top of the stack. 
	       @throws  EmptyStackException if the stack is empty before the operation. */
	   public T pop();{
	   
	   T top = peek();
	   assert topNode != null; //sets the top node of the stack as null
	   topNode = topNode.getNextNode();
	   
	   return top;
	   }
	   /** Retrieves this stack's top entry.
	       @return  The object at the top of the stack.
	       @throws  EmptyStackException if the stack is empty. */
	   public T peek();{
	  
	   if (isEmpty())
		   throw new EmptyStackException(); //checks if the stack is empty and throws an exception 
	   else
		   return topNode.getData(); // returns the top of the stack 
		}
	   
	   /** Detects whether this stack is empty.
	       @return  True if the stack is empty. */
	   public boolean isEmpty();
	  
	   {
		  return topNode = null; //returns the stack as empty
		   } 
		 
	   
	   /** Removes all entries from this stack. */
	   public void clear();
	   topNode = null; //sets the stack as null
}
