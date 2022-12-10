import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Rotate {

	public static void rotate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		printMap(map);

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() + k < map.size()) {
				map.put(entry.getKey(), entry.getValue() + k);
			} else {
				map.put(entry.getKey(), entry.getValue() + k - map.size());
			}
		}
		printMap(map);

		for (int i = 0; i < nums.length; i++) {
			for (Entry<Integer, Integer> entry : map.entrySet()) {

				if (entry.getValue() == i) {
					nums[i] = entry.getKey();
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}

	}

	static void printMap(Map m) {
		m.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println();
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;

		rotate(nums, k);
	}

}
