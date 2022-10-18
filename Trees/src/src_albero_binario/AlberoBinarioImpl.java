package src_albero_binario;

import java.util.LinkedList; //Per l'output delle visite
import java.util.List; //Per l'output delle visite
import java.util.Stack; //Per la visita DFS (come esempio di struttura dati predefinita di JFC)

import coda.Coda;
import coda.CodaCollegata;

public class AlberoBinarioImpl implements AlberoBinario {
	protected NodoBinario radice;

	// Metodo costruttore di default
	public AlberoBinarioImpl() {
		radice = null;
	}

	// Metodi costruttori: due varianti (uno con l'info ed uno direttamente con il
	// nodo)
	public AlberoBinarioImpl(Object e) {
		radice = new NodoBinario(e);
	}

	public AlberoBinarioImpl(NodoBinario rad) {
		radice = rad;
	}

	// Metodi accessori:
	public NodoBinario radice() {
		return radice;
	}

	public int numNodi() {
		return numNodi(radice);
	}

	/**
	 * Restituisce il numero di nodi dell'albero radicato in un nodo <code>r</code>.
	 * Tale informazione viene determinata conteggiando ricorsivamente il numero di
	 * nodi dei sottoalberi radicati nei figli di <code>r</code>.
	 * 
	 * @return il numero di nodi presenti nell'albero radicato in <code>r</code>.
	 */
	private int numNodi(NodoBinario r) {
		return r == null ? 0 : numNodi(r.sinistro) + numNodi(r.destro) + 1;
	}

	public int grado(NodoBinario v) {
		int grado = 0;
		if (v == null)
			return -1;
		if (((NodoBinario) v).sinistro != null)
			grado++;
		if (((NodoBinario) v).destro != null)
			grado++;
		return grado;
	}

	public Object info(NodoBinario v) {
		return v.elem;
	}

	// Restituisce true se v e' un figlio sinistro
	public boolean figlioSinistro(NodoBinario v) {
		if (v.equals(v.padre.sinistro))
			return true;
		else
			return false;
	}

	// Restituisce true se v e' un figlio sinistro
	public boolean figlioDestro(NodoBinario v) {
		if (v.equals(v.padre.destro))
			return true;
		else
			return false;
	}

	public NodoBinario padre(NodoBinario v) {
		return v.padre;
	}

	public NodoBinario sin(NodoBinario v) {
		return v.sinistro;
	}

	public NodoBinario des(NodoBinario v) {
		return v.destro;
	}

	public void cambiaInfo(NodoBinario v, Object info) {
		v.elem = info;
	}

	public void scambiaInfo(NodoBinario v1, NodoBinario v2) {
		Object app = v1.elem;
		v1.elem = v2.elem;
		v2.elem = app;
	}

	// aggiunge "albero" come sottoalbero sinistro di "padre"
	public void innestaSin(NodoBinario padre, AlberoBinario albero) {
		NodoBinario figlio = albero.radice();
		if (figlio != null)
			figlio.padre = padre;
		padre.sinistro = figlio;
	}

	// aggiunge "albero" come sottoalbero destro di "padre"
	public void innestaDes(NodoBinario padre, AlberoBinario albero) {
		NodoBinario figlio = albero.radice();
		if (figlio != null)
			figlio.padre = padre;
		padre.destro = figlio;
	}

	// elimina il sottoalbero sinistro di "padre" e lo restituisce
	public AlberoBinario potaSinistro(NodoBinario padre) {
		NodoBinario figlio = padre.sinistro;
		figlio.padre = null;
		AlberoBinario newalbero = new AlberoBinarioImpl(figlio);
		padre.sinistro = null;
		return newalbero;
	}

	// elimina il sottoalbero destro di "padre" e lo restituisce
	public AlberoBinarioImpl potaDestro(NodoBinario padre) {
		NodoBinario figlio = padre.destro;
		figlio.padre = null;
		AlberoBinarioImpl newalbero = new AlberoBinarioImpl(figlio);
		padre.destro = null;
		return newalbero;
	}

	// Stacca e restituisce il sottoalbero radicato in un certo
	// NodoBinario "rimosso" dell'albero
	public AlberoBinario pota(NodoBinario rimosso) {
		if (rimosso == null)
			return new AlberoBinarioImpl(); // l'albero vuoto
		if (rimosso.padre == null) { // "rimosso" � la radice dell'albero
			radice = null;
			return new AlberoBinarioImpl(rimosso); // restituiamo l'intero albero
		}
		NodoBinario pad = rimosso.padre;
		if (figlioSinistro(rimosso)) { // se "rimosso" � figlio sinistro
			AlberoBinario newalbero = potaSinistro(pad);
			return newalbero;
		} else { //// "rimosso" � figlio destro
			AlberoBinario newalbero = potaDestro(pad);
			return newalbero;
		}
	}

	// Restituisce la lista degli elementi in una visita DFS (iterativa)
	public List visitaDFS() {
		List output = new LinkedList();// lista di elementi in output
		Stack<NodoBinario> pila = new Stack<NodoBinario>(); // Classe generica Stack<T>
		if (radice != null)
			pila.push(radice);
		while (!pila.isEmpty()) {
			NodoBinario u = pila.pop();// Richiederebbe il casting se usassimo la classe Stack non generica
			output.add(u.elem);// mettiamo in output corrente
			// inseriamo in pila il figlio destro e poi quello sinistro
			if (u.destro != null)
				pila.push(u.destro);
			if (u.sinistro != null)
				pila.push(u.sinistro);
		}
		return output;
	}

	// Restituisce la lista degli elementi in una visita BFS
	public List visitaBFS() {
		List output = new LinkedList();
		Coda coda = new CodaCollegata();
		if (radice != null)
			coda.enqueue(radice);
		while (!coda.isEmpty()) {
			NodoBinario u = (NodoBinario) coda.dequeue();
			output.add(u.elem); // Il metodo add di LinkedList aggiunge il nuovo elemnto alla fine
			// Inseriamo in coda il figlio sinistro e poi quello destro
			if (u.sinistro != null)
				coda.enqueue(u.sinistro);
			if (u.destro != null)
				coda.enqueue(u.destro);
		}
		return output;
	}

	// Restituisce il livello a cui si trova
	@Override
	public int level(NodoBinario v) {
		// Albero vuoto -> l'albero punta a null
		if (v == null)
			return -1;

		return level(v.padre) + 1;
	}

	@Override
	public int altezza() {
		return altezza(radice);
	}

	private int altezza(NodoBinario v2) {
		if (v2 == null)
			return -1;
		if (v2.sinistro == null && v2.destro == null)
			return 0;
		return 1 + Math.max(altezza(v2.sinistro), altezza(v2.destro));
	}

	@Override
	public int contafoglie() {

		return contafoglie(radice);
	}

	private int contafoglie(NodoBinario v) {
		if (v.sinistro == null && v.destro == null)
			return 1;

		return contafoglie(v.sinistro) + contafoglie(v.destro);
	}

	@Override
	public int numNodiInterni() {
		return numNodiInterni(radice);
	}

	private int numNodiInterni(NodoBinario v) {
		if (v.sinistro != null || v.destro != null)
			return 1;
		return numNodiInterni(v.sinistro) + numNodiInterni(v.destro);
	}

	@Override
	public boolean equals(AlberoBinarioImpl a) {
		if (a == null)
			return false;
		return equals(radice, a.radice);
	}

	private boolean equals(NodoBinario v, NodoBinario a) {
		if (v.elem != a.elem)
			return false;
		return equals(v.sinistro, a.sinistro) && equals(v.sinistro, a.destro);

	}

	@Override
	public void eliminaFoglieuguali() {
		if (radice != null)
			eliminaFoglieuguali(radice.sinistro);
	}

	public void eliminaFoglieuguali(NodoBinario s) {

		if (s.sinistro == s.destro && s.sinistro.sinistro == null && s.sinistro.destro == null
				&& s.destro.sinistro == null && s.destro.destro == null && s.sinistro.elem == s.destro.elem) {
			s.sinistro = null;
			s.destro = null;
		}
		eliminaFoglieuguali(s.sinistro);
		eliminaFoglieuguali(s.destro);

	}

}
