package bynary_research;

// TODO: Auto-generated Javadoc
/**
 * The Class NoobSorting. Simple sort for an int array
 */
public class NoobSorting {

	/**
	 * Sortedarray is the method who allows to create the sorting
	 *
	 * @param a the a
	 * @return the int[]
	 */
	static int[] sortedarray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		return a;
	}

	/**
	 * Prints the array with a simple for loop
	 *
	 * @param array the array
	 */
	static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	/**
	 * The main method.
	 *
	 */
	public static void main(String[] args) {
		int i[] = { 4, 3, 2, 1 };
		print(i);
		sortedarray(i);

		print(i);

	}

}
