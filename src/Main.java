
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Main {

	public static void main(String[] args) throws IOException {
		// 1. Initialize hashmap and arraylist
		HashMap map = new HashMap();
		ArrayList<String> list = new ArrayList<String>();
		Scanner inFile1 = new Scanner(new File("dictionary.txt")).useDelimiter("\n");

		// while loop
		while (inFile1.hasNext()) {
			// find next line

			String current = inFile1.next();
//			for (char c : current.toCharArray()) {
//				if (map.containsKey(c)) {
//					map.put(c, (double) map.get(c) + 1.0);
//				} else {
//					map.put(c, 1.0);
//				}
//			}

			// 2. Add to both hashmap and arraylist
			list.add(current);
			map.put(current, 0);
		}
		inFile1.close();

//		Iterator it = map.entrySet().iterator();
//		while (it.hasNext()) {
//			Map.Entry pair = (Map.Entry) it.next();
//			System.out.println(pair.getKey() + ": " + pair.getValue());
//		}

		
		  long startTime = System.nanoTime(); 
		  // 3. Find the word "turtle" in the arraylist 
		  int index = 0; while
		  (!list.get(index).equals("turtle")) { index++; } long endTime =
		  System.nanoTime(); long duration = (endTime - startTime);
		  System.out.println(duration);
		  
		  startTime = System.nanoTime(); 
		  // 4. Find the word "turtle" in the hashmap 
		  map.get("turtle"); endTime = System.nanoTime(); duration =
		  (endTime - startTime); System.out.println(duration);
		 
	}
}