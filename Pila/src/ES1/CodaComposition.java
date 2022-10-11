package ES1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CodaComposition<T> implements CodaInterface {

	Queue coda;

	public CodaComposition(LinkedList al) {
		this.coda = (Queue) al;
	}

	@Override
	public <T> void offer(T e) {
		this.coda.offer(e);
	}

	@Override
	public <T> T poll() {
		return (T) this.coda.poll();
	}

	@Override
	public <T> T remove() throws Exception {

		return (T) this.coda.remove();

	}

	@Override
	public <T> T peek() {
		return (T) this.coda.peek();

	}

	@Override
	public <T> T element() {
		return (T) this.coda.element();
	}

	public String toString() {
		String StringToreturn = "[ ";
		Iterator<T> it = this.coda.iterator();
		while (it.hasNext()) {
			T i = it.next();
			StringToreturn += i.toString() + " ";

		}
		StringToreturn += "]";
		return StringToreturn;
	}

}
