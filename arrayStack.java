package Stacks;

import java.util.EmptyStackException;

@SuppressWarnings("unused") 
public abstract class arrayStack<T> implements stack1<T> {
	
	private T[] stack; // Array of stack entries
	 private int topIndex; // Index of top entry
	 private boolean initialized = false;
	 private static final int DEFAULT_CAPACITY = 10;
	 private static final int MAX_CAPACITY = 10; // sets the max capacity of the stack as 10
	
	 public arrayStack()
	 {
	 this(DEFAULT_CAPACITY);
	 } 
	
	@SuppressWarnings("unchecked")
	public arrayStack(int initialCapacity)
	 {
	 checkCapacity(initialCapacity);
	 
	 T[] tempStack = (T[])new Object[initialCapacity]; 
	  stack = tempStack;
	  setTopIndex(-1);  // sets the initial value of the stack as empty
	  setInitialized(true); //sets initialization as true
	  } 
	private void checkCapacity(int initialCapacity) {
		
	}

	public static int getMaxCapacity() {// getter for max capacity
		return MAX_CAPACITY;
	}

	public int getTopIndex() {//getter for the top item of the stack
		return topIndex;
	}

	public void setTopIndex(int topIndex) {//setter for the top item in the stack
		this.topIndex = topIndex;
	}

	public boolean isInitialized() { //checks for initialization 
		return initialized;
	}

	public void setInitialized(boolean initialized) { //checks if initilization is true
		this.initialized = initialized;
	}
}
	
	
	

	
	  

