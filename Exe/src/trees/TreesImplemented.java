package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreesImplemented implements TresInterface {
	protected NodoAlbero radice;

	public TreesImplemented() {
		radice = null;
	}

	public TreesImplemented(Object e) {
		radice = new NodoAlbero(e);
	}

	public NodoAlbero radice() {
		return radice;
	}

	// Restituisce la lista degli elementi in una visita DFS (iterativa)
	public List visitaDFS() {
		List output = new LinkedList();// lista di elementi in output
		Stack<NodoAlbero> pila = new Stack<NodoAlbero>(); // Classe generica Stack<T>
		if (radice != null)
			pila.push(radice);
		while (!pila.isEmpty()) {
			NodoAlbero u = pila.pop();// Richiederebbe il casting se usassimo la classe Stack non generica
			output.add(u.elem);// mettiamo in output corrente
			// inseriamo in pila il figlio destro e poi quello sinistro
			if (u.destro != null)
				pila.push(u.destro);
			if (u.sinistro != null)
				pila.push(u.sinistro);
		}
		return output;
	}

	@Override
	public void innestaSin(NodoAlbero v, TreesImplemented t) {
		NodoAlbero figlio = t.radice;

		if (figlio != null)
			figlio.padre = v;
		v.sinistro = figlio;
	}

	@Override
	public void innestaDes(NodoAlbero v, TreesImplemented t) {
		NodoAlbero figlio = t.radice;

		if (figlio != null)
			figlio.padre = v;
		v.destro = figlio;

	}

	@Override
	public int level(NodoAlbero v) {
		if (v == null)
			return -1;
		return 1 + level(v.padre);
	}

	@Override
	public int altezza() {
		if (radice == null)
			return -1;

		return altezza(this.radice);
	}

	private int altezza(NodoAlbero v) {
		if (v == null)
			return -1;
		return 1 + Math.max(altezza(v.sinistro), altezza(v.destro));

	}

	@Override
	public int contafoglie() {

		if (radice == null)
			return -1;
		return contafoglie(radice);
	}

	private int contafoglie(NodoAlbero v) {
		if (v.sinistro == v.destro && v.sinistro == null)
			return 1;
		return contafoglie(v.sinistro) + contafoglie(v.destro);
	}

	@Override
	public int numNodiInterni() {
		if (radice == null)
			return -1;
		// Gli passo la radice
		return numNodiInterni(radice);
	}

	int numNodiInterni(NodoAlbero v) {
		if (v.sinistro != null || v.destro != null)
			return 1;
		return numNodiInterni(v.sinistro) + numNodiInterni(v.destro);
	}

	@Override
	public boolean Equals(TreesImplemented a) {

		return Equals(radice, a.radice);
	}

	private boolean Equals(NodoAlbero v1, NodoAlbero v2) {
		if (v1 == null && v2 == null) {
			return true;
		}
		if (v1 == null || v2 == null) {
			return false;
		}
		if (v1.elem != v2.elem)
			return false;

		// Chiamata ricorsiva
		if (false == Equals(v1.sinistro, v2.sinistro) || false == Equals(v1.destro, v2.destro))
			return false;

		return true;
	}

	@Override
	public void eliminaFoglieUguali() {
		eliminaFoglieUguali(radice);
	}

	@Override
	public boolean isleaf(NodoAlbero v) {
		return v.sinistro == null && v.destro == null;
	}

	void eliminaFoglieUguali(NodoAlbero v) {

		if (v.sinistro != null && v.destro != null) {

			if (isleaf(v.sinistro) && isleaf(v.destro) && v.sinistro.elem == v.destro.elem) {
				v.sinistro = v.destro = null;
			} else {
				eliminaFoglieUguali(v.sinistro);
				eliminaFoglieUguali(v.destro);
			}
		}

	}

	@Override
	public boolean search(NodoAlbero v) {
		return search(radice, v);
	}

	// N.B: non c'è l'ordine nell'albero
	private boolean search(NodoAlbero v1, NodoAlbero target) {
		if (v1 != null) {
			if (v1.elem == target.elem)
				return true;

			return search(v1.sinistro, target) && search(v1.destro, target);

		}
		return false;
	}
}
