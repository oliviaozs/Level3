import java.util.ArrayList;

public class Plane {
	int numberOfPassengers;
	ArrayList<Snake> snakes;

	public Plane(int numPassengers) {
		this.numberOfPassengers = numPassengers;
		snakes = new ArrayList<Snake>();
		Randomness rand = new Randomness();
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake(rand.oneToTen(), rand.trueOrFalse()));
		}
	}

	public double probabilityOfDeath() {
		int totalVenom = 0;
		for (Snake snake : snakes) {
			if (snake.getVenomous()) {
				totalVenom += snake.getViciousness();
			}
		}
		System.out.println(totalVenom);

		double chanceOfDeath = (totalVenom * 10.0) / numberOfPassengers;
		
		if (chanceOfDeath>100){
			return 100;
		}
		
		return chanceOfDeath;
	}
}
