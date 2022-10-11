package Es2_Pila;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Pila<T> implements InvertInterface {
	LinkedList<T> coda;

	Pila(LinkedList<T> coda) {
		this.coda = coda;
	}

	@Override
	public void invert() {

		Queue<T> queue = (Queue<T>) this.coda;
		Deque<T> dequeu = new LinkedList<T>();

		Iterator<T> itr = queue.iterator();

		while (itr.hasNext()) {
			T value = itr.next();
			dequeu.addLast(value);

		}

		this.coda = new LinkedList<T>();
		Iterator<T> itr2 = dequeu.iterator();

		while (itr2.hasNext()) {
			T value = itr2.next();
			coda.push((T) value);

		}
	}

}
