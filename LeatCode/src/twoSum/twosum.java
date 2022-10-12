package twoSum;

public class twosum {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 4 };

		int target = 6;
		int[] a = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target && i != j) {
					a[1] = i;
					a[0] = j;
					System.out.println("ciao mondo");

				}
			}
		}

		for (int i = 0; i < a.length; i++) // length is the property of the array
			System.out.println(a[i]);
	}

}
