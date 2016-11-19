import java.util.Scanner;
import java.util.Stack;

public class Hangman {

	public static void main(String[] args) {
		// setup for game
		Scanner scanner = new Scanner(System.in);
		Stack puzzles = new Stack();
		String word;
		int lives;
		int wins=0;
		boolean correct;

		puzzles.push("apple");
		puzzles.push("frog");
		puzzles.push("programming");
		puzzles.push("java");

		System.out.println("welcome to hangman!\nguess a letter");

		// while loop
		while (!puzzles.empty()) {
			word = (String) puzzles.pop();
			lives = 9;
			correct = true;
			char[] guesses = new char[word.length()];
			for (int i = 0; i < guesses.length; i++) {
				guesses[i] = '-';
			}

			while (correct && lives > 0) {
				for (char c : guesses) {
					System.out.print(c);
				}
				System.out.print(" lives: " + lives + "\n");

				// check input
				correct = false;
				boolean guessCorrect = false;
				String input = scanner.next();
				for (int i = 0; i < guesses.length; i++) {
					if (input.charAt(0) == word.charAt(i)) {
						guesses[i] = word.charAt(i);
						guessCorrect = true;
					}

					if (guesses[i] == '-') {
						correct = true;
					}

				}

				// decrement lives
				if (!guessCorrect) {
					lives--;
				}

			}

			if (lives == 0) {
				System.out.println("you lost!");
			} else {
				System.out.println(word + "\nyou won!");
				wins++;
			}

		}
		System.out.println("you won "+wins+"games.");
	}
	
}
