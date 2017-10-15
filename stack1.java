import java.util.EmptyStackException;

public interface stack1<T>
	{
	   int topIndex = 0;

	/** Adds a new entry to the top of this stack.
	       @param newEntry  An object to be added to the stack. */
	   public void  push(T newEntry);
		   checkInitialization();
		   ensureCapacity();
	   stack[topIndex + 1] = newEntry; // adds new item to the top of the stack
	   topIndex++;
	   
	   if(is(isempty())) // if stack is empty throws an exception
		   throw new EmptyStackException();
	   } 
	
	
	   /** Removes and returns this stack's top entry.
	       @return  The object at the top of the stack. 
	       @throws  EmptyStackException if the stack is empty before the operation. */
	   public default T pop() {
		   if (isEmpty())
		   throw new EmptyStackException(); // checks if stack is empty and throws exception if it is
		   
		   else {
		   T stack;
		T top = stack[topIndex]; 
		   stack[topIndex] = null; //removes the item at the top of the stack
		   topIndex--;
		   return top;}
		   } 
	
	   /** Retrieves this stack's top entry.
	       @return  The object at the top of the stack.
	       @throws  EmptyStackException if the stack is empty. */
	   public default T peek() {
		   
		   T[] stack;
		if(isEmpty())
		   throw new EmptyStackException();//checks if stack is empty and throws exception 
		   
		   else
		   return stack[topIndex];} //retursn the top item in the stack
	  
	   /** Detects whether this stack is empty.
	 * @param b 
	       @return  True if the stack is empty. */
	   public default boolean isEmpty() {
		if(topIndex < 0); // return true if stack is empty below zero
		
		   return true;
		 if(topIndex >= 0) //returns false if stack is not empty
		 return false;
	}
	  
	   /** Removes all entries from this stack. */
	   public default void clear() {
		   if(isEmpty())// checks if stack is empty
			   throw new EmptyStackException();
		   else
		   topIndex = -1; // removes top stacks to clear the stack
	}
	} 
	


