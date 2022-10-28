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

	public Node successore(Node e) {
		if (e.sx == null)
			return successoreSinistro(e.sx);
		else
			return successoreDestro(e.father, e);

	}

	public Node successoreSinistro(Tree e) {
		if (e.root.dx == null)
			return e.root;
		return successoreSinistro(e.root.dx);

	}

	public Node successoreDestro(Tree e, Node element) {
		if (((Comparable<E>) e.root.object).compareTo((E) element.object) > 0)
			return e.root;
		return successoreDestro(e.root.dx, element);
	}

	public Node predecessore(Tree e) {
		if (e.root.dx == null)
			return predecessoreDestro(e);
		else
			return predecessoreSinistro(e.root.dx, e.root);
	}

	public Node predecessoreSinistro(Tree e, Node element) {
		if (((Comparable<E>) e.root.object).compareTo((E) element.object) < 0)
			return e.root;
		return predecessoreSinistro(e.root.sx, element);

	}

	public Node predecessoreDestro(Tree e) {

		if (e.root.sx == null)
			return e.root;
		return predecessoreDestro(e.root.sx);
	}

	public Node minimo(Tree e) {
		if (e.root.sx == null)
			return e.root;
		return minimo(e.root.sx);
	}

	public Node massimo(Tree e) {
		if (e.root.dx == null)
			return e.root;
		return minimo(e.root.dx);

	}

}
