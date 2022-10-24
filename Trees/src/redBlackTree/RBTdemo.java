package redBlackTree;

public class RBTdemo {

	public static void main(String[] args) {
		RBTImplementation tree = new RBTImplementation();

		tree.insert("Marco");
		tree.insert("Franco");
		tree.insert("Anna");
		tree.insert("Peppino");
		tree.insert("Vedo");
		tree.insert("Tiru");
		tree.insert("gabrielino");

		System.out.println("The tree before the delete is:" + tree.allStrings());

		tree.delete("Marco");

		System.out.println("The tree after the delete  is:" + tree.allStrings());

	}

}
