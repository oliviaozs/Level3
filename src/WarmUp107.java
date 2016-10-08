import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class WarmUp107 {

	public int exclaimCount(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == '!')
				count++;
		}
		return count;
	}

	public boolean isPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public void hundredPrime() {
		int count = 0;
		int num = 3;
		String list = "";
		while (count < 100) {
			if (isPrime(num)) {
				list += (num + " ");
				count++;
			}
			num += 2;
		}
		System.out.println(list);
	}

	public int charCount(String input, char check) {
		HashMap map = new HashMap();
		
		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, (int) map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		if (map.containsKey(check)) {
			return (int) map.get(check);
		}
		else {
			return 0;
		}
	}

	@Test
	public void testCharCount() {
		assertEquals(2, charCount("hello", 'l'));
		assertEquals(0, charCount("hello", 'b'));
		assertEquals(3, charCount("hhh", 'h'));
		assertEquals(0, charCount("hhh", 'l'));
		assertEquals(0, charCount("", 'l'));
	}

	@Test
	public void testRegularCase() {
		assertEquals(3, exclaimCount("hello!!!"));
		assertEquals(2, exclaimCount("good!bye!"));
		hundredPrime();
	}

	@Test
	public void testNoExlaimation() {
		assertEquals(0, exclaimCount(""));
		assertEquals(0, exclaimCount("hello"));
	}

	@Test
	public void testPrimeNumber() {
		assertTrue(isPrime(17));
		assertTrue(isPrime(193));
	}

	@Test
	public void testIsNotPrime() {
		assertFalse(isPrime(9));
		assertFalse(isPrime(100));
	}

}
