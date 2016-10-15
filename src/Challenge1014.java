import java.util.HashMap;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Challenge1014 {

	public int[] pythagoreanTheorem(int[] nums, int c) {
		HashMap map = new HashMap();

		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], c-nums[i]);
			if (map.containsValue(nums[i])) {
				int[] values = {nums[i], (int) map.get(nums[i])};
				return values;
			}
		}
		int[] values = {};
		return values;
	}
	
	public static void main(String[] args) {
		int[] values = {1, 3, 7, 8, 4, 2, 5};
		System.out.println(new Challenge1014().pythagoreanTheorem(values, 8));
		
	}
}
