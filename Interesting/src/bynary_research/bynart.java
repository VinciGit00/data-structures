package bynary_research;

// TODO: Auto-generated Javadoc
/**
 * * Algorithm for binary research in java.
 *
 * @author marco vinciguerra
 * @year 2022-2023
 */
public class bynart {

	/**
	 * Research.
	 *
	 * @param a      the array
	 * @param target the number to search
	 * @param sx     the sx index
	 * @param dx     the dx index
	 * @return true, if successful
	 */
	static boolean research(int[] a, int target, int sx, int dx) {
		// Passo base
		if (sx > dx)
			return false;
		else {
			int m = (sx + dx) / 2;

			if (target > a[m]) {
				return research(a, target, m + 1, dx);

			} else if (target < a[m]) {
				return research(a, target, sx, m - 1);
			} else {
				return true;
			}
		}
	}

	/**
	 * The main method.
	 *
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6 };
		int target = 5;

		boolean result = research(array, target, 0, array.length);
		System.out.println(result);

		int[] array2 = { 1, 2, 3, 5, 6, 7 };
		target = 5;

		result = research(array2, target, 0, array.length - 1);
		System.out.println(result);

	}

}
