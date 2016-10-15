import static org.junit.Assert.*;

import org.junit.Test;

public class Warmup1014 {

	public int[] maxFill(int[] input) {
		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		for (int i = 0; i < input.length; i++) {
			input[i] = max;
		}
		return input;
	}

	public String mixString(String input1, String input2) {
		String output = "";
		int index = 0;
		while (index < input1.length() && index < input2.length()) {
			output += input1.charAt(index);
			output += input2.charAt(index);
			index++;
		}
		output += input1.substring(index) + input2.substring(index);
		return output;
	}

	@Test
	public void testMaxFill() {
		int[] expected1 = { 1, 2, 3 };
		int[] actual1 = { 3, 3, 3 };
		int[] expected2 = { 11, 5, 9 };
		int[] actual2 = { 11, 11, 11 };
		int[] expected3 = { 2, 11, 3 };
		int[] actual3 = { 11, 11, 11 };
		assertArrayEquals(maxFill(expected1), actual1);
		assertArrayEquals(maxFill(expected2), actual2);
		assertArrayEquals(maxFill(expected3), actual3);
	}

	@Test
	public void testMixString() {
		assertEquals(mixString("abc", "xyz"), "axbycz");
		assertEquals(mixString("Hi", "There"), "HTihere");
		assertEquals(mixString("xxxx", "There"), "xTxhxexre");
	}

}
