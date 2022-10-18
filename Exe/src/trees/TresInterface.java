package trees;

public interface TresInterface {

	/**
	 * Dice se è una foglia o meno
	 * 
	 * @param v
	 * @return
	 */
	boolean isleaf(NodoAlbero v);

	/**
	 * 
	 * @param v nodo che bisogna inserire
	 */
	public void innestaSin(NodoAlbero v, TreesImplemented t);

	/**
	 * 
	 * @param v nodo che bisogna inserire
	 */
	public void innestaDes(NodoAlbero v, TreesImplemented t);

	/**
	 * Restituisce il livello a cui si trova il nodo
	 * 
	 * @param v
	 * @return
	 */
	public int level(NodoAlbero v);

	/**
	 * 
	 * @return
	 */
	public int altezza();

	/**
	 * 
	 * @return il numero di foglie
	 */
	public int contafoglie();

	/**
	 * 
	 * @return il numero di nodi interni
	 */
	public int numNodiInterni();

	/**
	 * 
	 * @param a
	 * @return
	 */
	public boolean Equals(TreesImplemented a);

	/**
	 * 
	 */
	public void eliminaFoglieUguali();

	/**
	 * 
	 * @param v
	 * @return true if it's present on the tree
	 */
	public boolean search(NodoAlbero v);
}
