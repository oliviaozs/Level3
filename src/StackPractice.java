import java.util.Stack;

public class StackPractice {
	Stack<StackPractice> myStack;

	public StackPractice() {
		myStack = new Stack<StackPractice>();
		// while (true){
		// myStack.push(new StackPractice());
		// }
	}

	public static void main(String[] args) {
		StackPractice stack = new StackPractice();
		System.out.println(stack.reverseWord("zyxwvutsrqponmlkjihgfedcba"));
	}

	String reverseWord(String word) {
		Stack<Character> stack = new Stack<Character>();
		String reverse = "";
		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}
		while (stack.size() > 0) {
			reverse += stack.pop();
		}
		return reverse;
	}
}
