package FixedQue;

public abstract class arrayQueue<T> implements QueueInterface<T> {
	
	private T[] queue; 
	private int frontIndex;
	private int backIndex;
	private boolean initialized = false;
	private T newEntry;
	private static final int DEFAULT_CAPACITY = 10;
	private static final int MAX_CAPACITY = 10;// sets arrays maximum capacity to 10
	
	public arrayQueue()
	{
	this(DEFAULT_CAPACITY);
	} 
	
	public arrayQueue(int initialCapacity) {
	checkCapacity(initialCapacity); 
	
	@SuppressWarnings("unchecked")
	T[] tempQueue = (T[]) new Object[initialCapacity + 1];
	 setQueue(tempQueue);
	setFrontIndex(0);
	setBackIndex(initialCapacity);
	setInitialized(true);
	 }

	private void checkCapacity(int initialCapacity) {
	
		
	}

	public T[] getQueue() {
		return queue;
	}

	public void setQueue(T[] queue) {
		this.queue = queue;
	}

	public int getFrontIndex() {
		return frontIndex;
	}

	public void setFrontIndex(int frontIndex) {
		this.frontIndex = frontIndex;
	}

	public int getBackIndex() {
		return backIndex;
	}

	public void setBackIndex(int backIndex) {
		this.backIndex = backIndex;
	}

	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	public static int getMaxCapacity() {
		return MAX_CAPACITY;
	}

	public T getNewEntry() {
		return newEntry;
	}

	public void setNewEntry(T newEntry) {
		this.newEntry = newEntry;
	}
	
		
	}
