package RemoveOccurencies;

import java.util.ArrayList;
import java.util.Iterator;

public class remove {

	static int removeElement(int[] nums, int val) {
		int occurencies = 0;

		ArrayList<Integer> al = new ArrayList();
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == val) {
				occurencies++;
			} else {
				al.add(nums[i]);

			}
			nums[i] = 0;

		}

		printArrayList(al);

		Iterator<Integer> it = al.iterator();

		int index = 0;

		while (it.hasNext()) {
			int number = it.next();
			nums[index] = number;
			index++;

		}

		return nums.length - occurencies;
	}

	static void printArrayList(ArrayList al) {

		Iterator<Integer> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	static void printArray(int[] a) {

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}

	}

	public static void main(String[] args) {

		int n[] = { 1, 2, 3, 4 };

		printArray(n);

		System.out.println("Numero di occorrenze: " + removeElement(n, 2));

		printArray(n);

	}

}
