package Es2_Pila;

import java.util.LinkedList;

/**
 * 
 * @author marco Vinciguerra
 * @year 2022-2023
 */
public class main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// Uso della composizione
		System.out.println("Uso della composizione:");

		Pila p = new Pila(list);
		System.out.println("Prima: " + p.coda.toString());
		p.invert();
		System.out.println("Prima: " + p.coda.toString());

		// Uso dell'ereditarietà
		System.out.println("Uso dell'ereditarietà:");

		PilaExtend p2 = new PilaExtend();
		p2.add(1);
		p2.add(2);
		p2.add(3);
		p2.add(4);
		p2.add(5);

		System.out.println(p2.toString());
		p2.invert();
		System.out.println(p2);

	}

}
