package palindrome;

/**
 * The Class palindrome.
 */
public class palindrome {

	/**
	 * Checks if is palindrome.
	 *
	 * @param x is the number to analyze
	 * @return true, if is palindrome, otherwise false
	 */
	public static boolean isPalindrome(int x) {
		String temp = Integer.toString(x);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			numbers[i] = temp.charAt(i) - '0';
		}

		print(numbers);

		for (int i = 0; i < numbers.length / 2; i++) {
			if (numbers[i] != numbers[numbers.length - 1 - i])
				return false;
		}

		return true;
	}

	/**
	 * Prints the array
	 *
	 * @param array the array
	 */
	static void print(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * The main method. it call the function
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int a = 1212;

		boolean c = isPalindrome(a);

		System.out.println(c);
	}

}
