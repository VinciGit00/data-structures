package trees;

import java.util.LinkedList;

public class MainTrees {

	public static void main(String[] args) {
		TreesImplemented alb1 = new TreesImplemented(1);
		NodoAlbero nodo1 = alb1.radice();

		System.out.println("alb2=nodo2=2");
		TreesImplemented alb2 = new TreesImplemented(2);
		NodoAlbero nodo2 = alb2.radice();
		System.out.println("alb3=nodo3=3");

		TreesImplemented alb3 = new TreesImplemented(3);
		NodoAlbero nodo3 = alb3.radice();

		alb1.innestaDes(nodo1, alb3);
		alb1.innestaSin(nodo1, alb2);

		System.out.println("alb1.visitaDFS()");
		LinkedList visita = (LinkedList) alb1.visitaDFS();
		System.out.println(visita.toString());

		System.out.println(alb1.level(nodo3));
		System.out.println("Altezza: " + alb1.altezza());
		System.out.println("Nodi interni: " + alb1.numNodiInterni());
		System.out.println("Numero di foglie: " + alb1.contafoglie());

		boolean result = alb1.Equals(alb1);
		System.out.println("Alberi uguali: " + result);

		result = alb1.Equals(alb2);
		System.out.println("Alberi diversi: " + result);

		TreesImplemented alb4 = new TreesImplemented(4);
		NodoAlbero nodo4 = alb4.radice();

		TreesImplemented alb5 = new TreesImplemented(4);
		NodoAlbero nodo5 = alb5.radice();

		alb1.innestaDes(nodo3, alb4);
		alb1.innestaSin(nodo3, alb5);

		System.out.println("alb1.visitaDFS()");
		visita = (LinkedList) alb1.visitaDFS();
		System.out.println("Prima l'eliminazione delle foglie: " + visita.toString());

		alb1.eliminaFoglieUguali();

		System.out.println("alb1.visitaDFS()");
		visita = (LinkedList) alb1.visitaDFS();
		System.out.println("Dopo l'eliminazione delle foglie: " + visita.toString());

		boolean resultSearch = alb1.search(nodo1);
		System.out.println("Rcerca che viene trovata: " + resultSearch);

		resultSearch = alb1.search(nodo5);
		System.out.println("Ricerca che non viene trovata: " + resultSearch);
	}

}
