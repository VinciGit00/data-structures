package ES1;

import java.util.ArrayList;

public class CodaHierarchical extends ArrayList implements CodaInterface {

	@Override
	public <T> void offer(T e) {
		super.add(e);
	}

	@Override
	public <T> T poll() {
		if (super.isEmpty())
			return null;
		int lastIdx = super.size() - 1;
		T lastElement = (T) super.get(lastIdx);

		super.remove(lastIdx);
		return lastElement;
	}

	@Override
	public <T> T remove() throws Exception {
		if (super.isEmpty())
			throw new Exception("The stack is empty");
		int lastIdx = super.size() - 1;
		T lastElement = (T) super.get(lastIdx);

		super.remove(lastIdx);
		return lastElement;

	}

	@Override
	public <T> T peek() {
		if (super.isEmpty()) {
			return null;
		}
		int lastIdx = super.size() - 1;
		T lastElement = (T) super.get(lastIdx);
		return lastElement;

	}

	@Override
	public <T> T element() throws Exception {
		if (super.isEmpty()) {
			throw new Exception("The stack is empty");
		}
		int lastIdx = super.size() - 1;
		T lastElement = (T) super.get(lastIdx);
		return lastElement;

	}

}
