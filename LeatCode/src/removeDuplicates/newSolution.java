package removeDuplicates;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class newSolution {

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	static void printList(List list) {
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			Integer i = it.next();

			System.out.print(i + " ");
		}

	}

	static ArrayList addtoList(int[] a) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}

		return list;

	}

	/**
	 * This method create a solution with lists
	 * 
	 * @param a
	 */
	static void removeDuplicates(int[] a) {

		ArrayList list = addtoList(a);

		// Creation of the iterator
		Iterator<Integer> it = list.iterator();
		Integer previous = it.next();

		while (it.hasNext()) {
			Integer current = it.next();
			if (current == previous) {
				it.remove();
			}

			previous = current;
		}

		printList(list);
	}

	public static void main(String[] args) {

		int array[] = { 0, 0, 1, 1, 1, 2, 3, 3, 4, 4, 5, 5 };

		print(array);

		removeDuplicates(array);

	}

}
