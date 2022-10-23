package sorting;

import java.util.Arrays;

public class alreadyImplemented {

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		print(a);

		Arrays.sort(a);

		print(a);

	}

}
