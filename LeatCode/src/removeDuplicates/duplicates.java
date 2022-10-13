package removeDuplicates;

import java.util.Arrays;

public class duplicates {
	public static int removeDuplicates(int[] nums) {
		int dim = nums.length;
		int counter = 0;
		Arrays.sort(nums);
		for (int i = 0; i < dim - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				counter++;
				for (int j = i + 1; j < dim - 1; j++) {
					nums[j] = nums[j + 1];
				}
				i--;
				dim--;
			}
		}
		print(nums);
		int result[] = new int[dim];
		for (int i = 0; i < dim; i++)
			result[i] = nums[i];
		System.out.println("No duplicates: ");
		print(result);
		return counter;
	}

	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int array[] = { 0, 0, 1, 1, 1, 2, 3, 3, 4, 4, 5, 5 };
		print(array);
		int number = removeDuplicates(array);
		System.out.println(number);

	}

}
