
public class StringManipulator {

	public String reverseWord(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		return reverse;
	}

	public String capitalizeWord(String word) {
		return word.toUpperCase();
	}

	public String uncapitalizeWord(String word) {
		return word.toLowerCase();
	}
}
