import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipster {

	public ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network,
			HashMap<String, String> favoriteAnimals) {

		ArrayList<String> hipsters = new ArrayList<String>();
		boolean hipster;
		
		for (String name : network.keySet()) {
			hipster = true;
			
			for (String friendName : network.get(name)) {
				if (favoriteAnimals.get(friendName).equals(favoriteAnimals.get(name))) {
					hipster = false;
				}
			}

			if (hipster) {
				hipsters.add(name);
			}
		}
		return hipsters;

	}

}
