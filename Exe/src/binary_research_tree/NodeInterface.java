package binary_research_tree;

public interface NodeInterface<E> {

	public void insert(E e);

	public boolean trova(E e);

	public void stampa();

	public Node minimo(Tree e);

	public Node massimo(Tree e);

	public Node successore(Node e);

	public Node predecessore(Tree e);

}
