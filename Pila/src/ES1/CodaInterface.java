package ES1;

public interface CodaInterface {
	// Inserts an element to the queue
	<T> void offer(T e);

	// Retrieves and remove the head of this queue or null if this
	// queue is empty
	<T> T poll();

	// Retrieves and remove the head of this queue and throws an exception if this
	// queue is empty
	<T> T remove() throws Exception;

	// Retrieves the head of the queue returning null if the queue is empty

	<T> T peek();

	// Retrieves the head of the queue throwing an exception if the queue is empty
	<T> T element() throws Exception;

	String toString();
}
