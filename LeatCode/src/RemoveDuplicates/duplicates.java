package RemoveDuplicates;

import java.util.Arrays;

public class duplicates {
	public static int removeDuplicates(int[] nums) {
		int dim = nums.length;
		int counter = 0;
		Arrays.sort(nums);

		for (int i = 0; i < dim; i++) {
			if (nums[i] == nums[i + 1]) {
				--dim;
				counter++;
				for (int j = i; j < dim - 1; j++) {
					nums[j] = nums[j + 1];
				}

			}
		}
		print(nums);
		return counter;
	}

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int array[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		print(array);
		int number = removeDuplicates(array);
		System.out.println(number);

	}

}
