package stackarrayvectors;

import java.util.Vector;

public abstract class vectorStack<T> implements stackInterface<T> {
	
	private Vector<T> stack; // Last element is the top entry in stack
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 50;
	@SuppressWarnings("unused")
	private static final int MAX_CAPACITY = 10000;
	
	public vectorStack()
	 {
	this(DEFAULT_CAPACITY);
	 } // end default constructor
	
	public vectorStack(int initialCapacity)

	{
		 checkCapacity(initialCapacity);
		 setStack(new Vector<>(initialCapacity)); // Size doubles as needed
		 setInitialized(true);
		 } // end constructor

	private void checkCapacity(int initialCapacity) {
		// TODO Auto-generated method stub
		
	}

	public Vector<T> getStack() {
		return stack;
	}

	public void setStack(Vector<T> stack) {
		this.stack = stack;
	}

	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}
	
}
