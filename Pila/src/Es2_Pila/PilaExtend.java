package Es2_Pila;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PilaExtend extends LinkedList implements InvertInterface {

	@Override
	public <T> void invert() {
		Queue<T> queue = (Queue<T>) this;
		Deque<T> dequeu = new LinkedList<T>();

		Iterator<T> itr = queue.iterator();

		while (itr.hasNext()) {
			T value = itr.next();
			dequeu.addLast(value);
			itr.remove();
		}
		Iterator<T> itr2 = queue.iterator();

		Iterator<T> itr3 = dequeu.iterator();

		while (itr3.hasNext()) {
			T value = itr3.next();
			super.push((T) value);

		}
	}

}
