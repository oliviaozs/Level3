import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> list) {
		int count = 0;
		for (boolean pearl : list) {
			if (pearl) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> list) {
		double tall = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > tall) {
				tall = list.get(i);
			}
		}
		return tall;
	}

	public static String findLongestWord(List<String> list) {
		String word = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() > word.length()) {
				word = list.get(i);
			}
		}
		return word;
	}

	public static boolean containsSOS(List<String> list) {
		for (String morse : list) {
			if (morse.indexOf("... --- ...") != -1) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			double lowest = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				double highest = list.get(j);
				if (highest < lowest) {
					double temp = lowest;
					list.set(i, highest);
					list.set(j, temp);
					lowest = highest;
				}
			}
		}
		return list;
	}

	public static List<String> sortDNA(List<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			int shortest = list.get(i).length();
			for (int j = i + 1; j < list.size(); j++) {
				int longest = list.get(j).length();
				if (shortest > longest) {
					String temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					shortest = longest;
				}
			}
		}
		return list;
	}

	public static List<String> sortWords(List<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			String lowest = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				String highest = list.get(j);
				if (lowest.compareTo(highest) > 0) {
					String temp = lowest;
					list.set(i, highest);
					list.set(j, temp);
					lowest = highest;
				}
			}
		}
		System.out.println(list);
		return list;
	}
}
