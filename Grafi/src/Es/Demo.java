package Es;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

public class Demo {
	public static void main(String[] args) {
		// Creo un grafo orientato
		Graph<String, DefaultEdge> grafo = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);

		// creo i vertici
		grafo.addVertex("1");
		grafo.addVertex("2");
		grafo.addVertex("3");
		grafo.addVertex("4");
		grafo.addVertex("5");
		grafo.addVertex("6");
		grafo.addVertex("7");
		// connetto i vertici con gli archi
		/*
		 * grafo.addEdge("1", "2"); grafo.addEdge("2", "5"); grafo.addEdge("5", "1");
		 * grafo.addEdge("5", "4"); grafo.addEdge("4", "3"); grafo.addEdge("4", "6");
		 * grafo.addEdge("6", "4"); grafo.addEdge("3", "6");
		 */
		grafo.addEdge("7", "3");
		grafo.addEdge("3", "7");

		int max = facebook(grafo);

		System.out.println(max);

	}

	static int facebook(Graph<String, DefaultEdge> G) {
		int max = 0;
		for (String nodo : G.vertexSet()) {
			int t = count(G, nodo);
			if (t > max)
				max = t;
		}
		return max;
	}

	static int count(Graph<String, DefaultEdge> G, String nodo) {
		Map<String, Boolean> visited = new HashMap<>();
		G.vertexSet().forEach(s -> visited.put(s, false));

		visited.replace(nodo, true);

		int f = 0;

		for (String nAd : Graphs.successorListOf(G, nodo)) {
			visited.replace(nAd, true);

			f = f + 1;

			for (String nAdAd : Graphs.successorListOf(G, nAd)) {
				if (!visited.get(nAdAd)) {
					visited.replace(nAdAd, true);
					f = f + 1;
				}
			}
		}
		return f;
	}

}