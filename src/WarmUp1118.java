
public class WarmUp1118 {

	public static String[] initHighscores() {
		String[] highscores = new String[5];
		for (int i = 0; i < highscores.length; i++) {
			highscores[i] = "Noname-0";
		}
		return highscores;
	}

	public static void printHighscores(String[] highscores) {
		for (String score : highscores) {
			System.out.println(score);
		}
	}

//	public static String[] insertScore(String[] highscores, String newScore) {
//		int newValue = Integer.parseInt(newScore.split("-")[1]);
//		for (int i = 0; i<highscores.length; i++) {
//			if (newValue >= Integer.parseInt(highscores[i].split("-")[1])) {
//				
//			}
//		}
//	}

	public static void main(String[] args) {
		printHighscores(initHighscores());
	}

}
