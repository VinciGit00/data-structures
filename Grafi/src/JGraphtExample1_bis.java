import java.util.Iterator;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
//JGraphT provides traversal via package org.jgrapht.traverse. 
//The common interface is GraphIterator, which specializes the generic Java Iterator interface.
//https://jgrapht.org/guide/UserOverview#hello-jgrapht
import org.jgrapht.traverse.DepthFirstIterator;

//Semplici esempi 
public class JGraphtExample1_bis {
	public static void main(String[] args) {
		// Creo un grafo orientato
		// DefaultEdge -> preso dalla libreria importata
		Graph<String, DefaultEdge> grafo = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);

		// creo i vertici
		grafo.addVertex("1");
		grafo.addVertex("2");
		grafo.addVertex("3");
		grafo.addVertex("4");
		grafo.addVertex("5");
		grafo.addVertex("6");
		grafo.addVertex("7");
		// Connetto i vertici con gli archi
		grafo.addEdge("1", "2");
		grafo.addEdge("2", "5");
		grafo.addEdge("5", "1");
		grafo.addEdge("5", "4");
		grafo.addEdge("4", "3");
		grafo.addEdge("4", "6");
		grafo.addEdge("6", "4");
		grafo.addEdge("3", "6");
		grafo.addEdge("7", "3");
		// stampo il grafo
		System.out.println(grafo.toString());

		// Visita in profondità con un iteratore
		Iterator<String> iterator = new DepthFirstIterator<>(grafo, "1");

		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
	}

}