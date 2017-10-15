package stackarrayvectors;

import java.util.EmptyStackException;

public interface stackInterface<T> {
	
	Object stack = null;
	/** Adds a new entry to the top of this stack.
    @param newEntry  An object to be added to the stack. */
public void push(T newEntry);

void checkInitialization();
stack.add(newEntry); //adds  to the top of the stack


/** Removes and returns this stack's top entry.
    @return  The object at the top of the stack. 
    @throws  EmptyStackException if the stack is empty before the operation. */
public T pop();{

	if (isEmpty())
		throw new EmptyStackException(); //checks if stack is empty and throws and exception if they are
	else
		return
				stack.remove(stack.size() - 1);//removes the top item in the stack
				}

/** Retrieves this stack's top entry.
    @return  The object at the top of the stack.
    @throws  EmptyStackException if the stack is empty. */
public T peek();{

if(isEmpty())//checks if stack is empty
throw new EmptyStackException();

else
return stack.lastElement(); //returns the top item in the index
}
/** Detects whether this stack is empty.
    @return  True if the stack is empty. */
public boolean isEmpty();

{
return stack.isEmpty(); // returns when the stack is empty
}  

/** Removes all entries from this stack. */
public void clear();{
stack.clear(); //clears the stack
}
}
