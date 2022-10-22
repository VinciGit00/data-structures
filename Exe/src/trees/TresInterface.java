package trees;

import java.util.List;

public interface TresInterface {

	/**
	 * Dice se un nodo è una foglia o meno
	 * 
	 * @param v
	 * @return true se il nodo è una foglia, altrimenti ritorna false
	 */
	boolean isleaf(NodoAlbero v);

	/**
	 * Permette di inserire un nodo nell'albero
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
	 * Metodo che permette di contare il numero di foglie
	 * 
	 * @return il numero di foglie
	 */
	public int contafoglie();

	/**
	 * Metodo che permette di calcolare il numero di nodi interni ad un albero
	 * 
	 * @return il numero di nodi interni
	 */
	public int numNodiInterni();

	/**
	 * Metodo che permette di dire se due alberi sono uguali o meno
	 * 
	 * @param a
	 * @return true se i due alberi sono uguali, altrimenti ritorna false
	 */
	public boolean Equals(TreesImplemented a);

	/**
	 * Metodo che permette di eliminare le foglie uguali
	 */
	public void eliminaFoglieUguali();

	/**
	 * Permette di cercare all'interno dell'albero un nodo
	 * 
	 * @param v
	 * @return true if it's present on the tree
	 */
	public boolean search(NodoAlbero v);

	/**
	 * Permette di scrivere l'albero
	 * 
	 * @return
	 */
	public List visitaDFS();
}
