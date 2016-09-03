import java.util.Random;

public class Randomness {

	public boolean trueOrFalse() {
		int rand = new Random().nextInt(2);
		if (rand == 0) {
			return true;
		}
		return false;
	}

	public int oneToTen() {
		return new Random().nextInt(10) + 1;
	}
	
}
