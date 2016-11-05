import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

public class WarmUp114 {

	public int getMode(int[] input) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int mode = -1;
		map.put(mode, 1);

		for (int num : input) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
				if (map.get(mode) < map.get(num)) {
					mode = num;
				} else if (map.get(mode) == map.get(num) && mode != num) {
					mode = -1;
					map.put(mode, map.get(num));
				}
			} else {
				map.put(num, 1);
			}

		}
		return mode;
	}

	public int[] partition(int[] input) {
		double mean = 0;
		for (int num : input) {
			mean += num;
		}
		mean = mean / input.length;
		int outputSize = 0;
		for (int num : input) {
			if (num >= mean) {
				outputSize++;
			}
		}
		int[] output = new int[outputSize];
		int index = 0;
		for (int num : input) {
			if (num >= mean) {
				output[index++] = num;
			}
		}
		return output;
	}

	public boolean isPalindrome(String input) {
		Stack stack = new Stack();
		if (input.length() == 0) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.substring(i, i + 1));
		}
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output += stack.pop();
		}
		System.out.println(output);
		if (input.equals(output)) {
			return true;
		}
		return false;
	}

	public boolean syntaxChecker(String syntax) {
		Stack stack = new Stack();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('<', '>');
		
		for (int i = 0; i < syntax.length(); i++) {
			if (syntax.charAt(i) == ']' || syntax.charAt(i) == '}' || syntax.charAt(i) == '>') {
				char pop = (char) stack.pop();
				if (syntax.charAt(i) != map.get(pop)) {
					return false;
				}
			}
				
			else {
				stack.push(syntax.charAt(i));
			}
		}
		return true;
	}

	@Test
	public void testGetMode() {
		int[] test = { 1, 1, 1 };
		int[] test2 = { 1, 1, 2 };
		int[] test3 = { 1, 1, 2, 2, 3 };
		int[] test4 = { 1, 2 };
		int[] test5 = {};
		int[] test6 = { 1, 2, 3, 3, 3, 5 };
		assertEquals(getMode(test), 1);
		assertEquals(getMode(test2), 1);
		assertEquals(getMode(test3), -1);
		assertEquals(getMode(test4), -1);
		assertEquals(getMode(test5), -1);
		assertEquals(getMode(test6), 3);
	}

	@Test
	public void testPartition() {
		int[] test = { 1, 7, 8, 4, 5, 3 };
		int[] result = { 7, 8, 5 };
		int[] test2 = { 1 };
		int[] result2 = { 1 };
		int[] test3 = { 1, 2, 3 };
		int[] result3 = { 2, 3 };
		int[] test4 = {};
		int[] result4 = {};
		assertArrayEquals(partition(test), result);
		assertArrayEquals(partition(test2), result2);
		assertArrayEquals(partition(test3), result3);
		assertArrayEquals(partition(test4), result4);
	}

	@Test
	public void testPalindrome() {
		String test = "kayak";
		String test2 = "hello";
		String test3 = "";
		String test4 = "hi ih";
		assertEquals(isPalindrome(test), true);
		assertEquals(isPalindrome(test2), false);
		assertEquals(isPalindrome(test3), false);
		assertEquals(isPalindrome(test4), true);
	}
	
	@Test
	public void testSyntaxChecker() {
		assertEquals(syntaxChecker("{}"), true);
		assertEquals(syntaxChecker("{[]}"), true);
		assertEquals(syntaxChecker("{<[]>}"), true);
		assertEquals(syntaxChecker("{]"), false);
	}

}
