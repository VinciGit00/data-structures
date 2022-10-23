package sorting;

// TODO: Auto-generated Javadoc
/**
 * The Class NoobSorting. Simple sort for an int array
 */
public class n2sorting {

	/**
	 * bubble_sort is the method who allows to create the sorting
	 *
	 * @param a the a
	 * @return the int[]
	 */
	static int[] bubble_sort(int[] a) {

		boolean change = false;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					change = true;
				}

			}
			// This is a flag
			if (change == false)
				break;

			change = false;
		}
		return a;
	}

	public static int[] selection_sort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (min > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
		}

		return a;
	}

	public static int[] insertion_sort(int[] a) {

		for (int j = 2; j < a.length; j++) {
			int x = a[j];
			int i = j - 1;
			while (i > 0 && a[i] > x) {
				a[i + 1] = a[i];
				i = i - 1;
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
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * The main method.
	 *
	 */
	public static void main(String[] args) {
		int i[] = { 4, 3, 2, 1 };

		System.out.println("Bubble sort");

		System.out.println("Non ordinato:");
		print(i);

		bubble_sort(i);

		System.out.println("Ordinato:");
		print(i);

		int a[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("Selection sort");

		System.out.println("Non ordinato:");
		print(a);

		int result[] = selection_sort(a);

		System.out.println("Ordinato:");
		print(result);

	}

}
