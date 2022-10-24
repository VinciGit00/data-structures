package redBlackTree;

import java.util.TreeSet;

public class RBTImplementation implements RBT_interface {

	private TreeSet tree;

	RBTImplementation() {
		Helper h = new Helper();

		// Fornisco qui il comparator
		tree = new TreeSet<>(h);
	}

	@Override
	public <T> void insert(T node) {
		tree.add(node);

	}

	@Override
	public <T> void delete(T node) {
		tree.remove(node);

	}

	@Override
	public <T> boolean AlreadyPresent(T node) {
		if (tree.contains(node))
			return true;

		return false;
	}

	@Override
	public <T> String allStrings() {
		return tree.toString();
	}

}
