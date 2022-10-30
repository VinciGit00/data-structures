public class hindex {
	public static int hIndex(int[] citations) {
		int[] counter = new int[citations.length + 1];

		for (int c : citations) {
			counter[Math.min(citations.length, c)]++;
		}

		int h = citations.length;
		for (int i = counter[citations.length]; h > i; i += counter[h]) {
			h--;
		}

		return h;

	}

	public static void main(String[] args) {
		int a[] = { 3, 0, 6, 1, 5, 3 };
		int b[] = { 3, 0, 6, 1, 5 };

		System.out.println(hIndex(a));
		System.out.println(hIndex(b));

	}

}
