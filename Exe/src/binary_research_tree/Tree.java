package binary_research_tree;

public class Tree<E extends Comparable<E>> implements NodeInterface {

	Node root;

	Tree() {
		root = null;
	}

	@Override
	public void insert(Object e) {
		if (root == null) {
			root = new Node();
			root.object = e;
			root.sx = new Tree<>();
			root.dx = new Tree<>();

		} else {

			if (((Comparable<E>) e).compareTo((E) root.object) < 0) {
				root.sx.insert(e);
			} else {
				root.dx.insert(e);
			}
		}
	}

	@Override
	public boolean trova(Object e) {
		if (root == null)
			return false;
		else {
			int cmp = ((Comparable<E>) root.object).compareTo((E) e);
			if (cmp == 0)
				return true;

			else if (cmp < 0)
				return root.dx.trova(e);
			else
				root.sx.trova(e);
		}
		return false;
	}

	@Override
	public void stampa() {
		if (root != null) {
			root.sx.stampa();
			System.out.println(root.object);
			root.dx.stampa();
		}
	}

}
