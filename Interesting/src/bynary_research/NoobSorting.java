package bynary_research;

public class NoobSorting {
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

	static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int i[] = { 4, 3, 2, 1 };
		print(i);
		sortedarray(i);

		print(i);

	}

}
