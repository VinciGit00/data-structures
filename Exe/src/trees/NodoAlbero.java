package trees;

public class NodoAlbero {
	public Object elem;
	public NodoAlbero padre;
	public NodoAlbero sinistro;
	public NodoAlbero destro;

	public NodoAlbero(Object el) {
		this.elem = el;
		padre = sinistro = destro = null;
	}

}
