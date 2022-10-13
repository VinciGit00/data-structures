package triangle;

public class Triangle {
	static int largestPerimeter(int[] nums) {
		if (nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]

				&& nums.length == 3) {
			return nums[0] + nums[1] + nums[2];
		}
		return 0;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 1, 2 };

		System.out.println(largestPerimeter(nums));

		int nums2[] = { 3, 2, 3, 4 };
		System.out.println(largestPerimeter(nums2));

	}

}
