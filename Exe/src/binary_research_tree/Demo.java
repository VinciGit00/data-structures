package binary_research_tree;

public class Demo {
	public static void main(String[] args) {

		Tree<Integer> bintree = new Tree<Integer>();

		bintree.insert(4);
		bintree.insert(10);
		bintree.insert(20);
		bintree.insert(30);
		bintree.insert(40);
		bintree.insert(50);

		bintree.stampa();

		System.out.println("Result of the research: " + bintree.trova(10));
		System.out.println("Result of the research: " + bintree.trova(100));

	}
}
