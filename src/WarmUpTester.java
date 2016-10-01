import static org.junit.Assert.*;

import org.junit.Test;

public class WarmUpTester {

	@Test
	public void testRepeatWithString() {
		String s1 = "AxAxA";
		String s2 = "BB!!!BB!!!BB!!!BB";
		String s3 = "word";
		assertEquals(s1, repeatWithString("A", "x", 3));
		assertEquals(s2, repeatWithString("BB", "!!!", 4));
		assertEquals(s3, repeatWithString("word", "5", 1));
	}

	@Test
	public void testHasRepeatingChar() {
		String s1 = "turtle";
		String s2 = "name";
		String s3 = "ladder";
		String s4 = "computer";
		assertTrue(hasRepeatingChar(s1));
		assertFalse(hasRepeatingChar(s2));
		assertTrue(hasRepeatingChar(s3));
		assertFalse(hasRepeatingChar(s4));
	}

	String repeatWithString(String word1, String word2, int numTimes) {
		String output = "";
		for (int i = 0; i < numTimes * 2 - 1; i++) {
			if (i % 2 == 0)
				output += word1;
			else
				output += word2;
		}
		return output;
	}

	boolean hasRepeatingChar(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					return true;
			}
		}
		return false;
	}

}
