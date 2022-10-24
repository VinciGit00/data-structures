package src_BST;

class NodoBinario {
	public int elem;
	public NodoBinario padre;
	public NodoBinario sinistro;
	public NodoBinario destro;

	public NodoBinario(int el) {
		elem = el;
		padre = sinistro = destro = null;
	}
}