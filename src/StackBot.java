import java.util.Stack;

public class StackBot {
	public static void main(String[] args) {
		Stack<String> commands = new Stack<String>();
		{
			commands.push("1.15 N");
			commands.push("0.79 S");
			commands.push("0.25 W");
			commands.push("0.15 W");
			commands.push("1.78 S");
			commands.push("0.95 E");
			commands.push("0.75 E");
			commands.push("1.37 N");
			commands.push("0.75 E");
			commands.push("1.85 W");
			commands.push("1.73 W");
			commands.push("0.72 N");
			commands.push("0.75 E");
			commands.push("0.65 E");
			commands.push("1.09 S");
			commands.push("1.75 W");
			commands.push("1.55 N");
			commands.push("0.73 E");
			commands.push("1.05 W");
			commands.push("0.71 E");
			commands.push("1.45 E");
			commands.push("1.75 N");
			commands.push("1.91 S");
			commands.push("0.45 S");
			commands.push("0.11 E");
		}

		int xLocation = 0;
		int yLocation = 0;
		while (commands.size() > 0) {
			String command = commands.pop();
			double distance = Double.parseDouble(command.substring(0, 4));
			double direction = command.charAt(command.length() - 1);

			if (direction == 'N') {
				yLocation += distance;
			} else if (direction == 'S') {
				yLocation -= distance;
			} else if (direction == 'E') {
				xLocation += distance;
			} else if (direction == 'W') {
				direction -= distance;
			}
		}

		if (xLocation > 0 && yLocation > 0) {
			System.out.println("the stackbot is at waffle");
		} else if (xLocation > 0 && yLocation < 0) {
			System.out.println("the stackbot is at poop");
		} else if (xLocation < 0 && yLocation > 0) {
			System.out.println("the stackbot is at taco");
		} else if (xLocation < 0 && yLocation < 0) {
			System.out.println("the stackbot is at cupcake");
		} else {
			System.out.println("the stackbot didn't move!!!");
		}

	}
}
