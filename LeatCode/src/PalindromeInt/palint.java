package PalindromeInt;

public class palint {
	public static boolean isPalindrome(int x) {

		String str1[] = Integer.toString(x).split("");

		int array[] = new int[str1.length];

		for (int i = 0; i < str1.length; i++) {
			array[i] = Integer.parseInt(str1[i]);
		}
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - 1])
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(1492));

	}

}
