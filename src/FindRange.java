import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FindRange {
	ArrayList<Integer> input = new ArrayList<Integer>();
	int largest = Integer.MIN_VALUE;
	int smallest = Integer.MAX_VALUE;
	int sum = 0;
	float mean = 0;

	/**
	 * To execute Java programs from the command line:
	 * 
	 *  1. Locate the directory containing your .class file, and navigate to that directory using Terminal
	 * 			cd /Users/joonspoon/Documents/workspace/Level3/bin/ 
	 * 
	 * 	2. Then execute it using 
	 * 			java CommandLineEcho
	 * 
	 */
	public static void main(String[] args) {
		
		FindRange k = new FindRange();
		k.run();
		
	}
	public void run(){
		Scanner userInput = new Scanner(System.in);
		while (userInput.hasNext()) {
			try{
				int j = userInput.nextInt();
				if(j == 0){
					
					break;
				}
				else{
					input.add(j);
					
				}
				for(int i = 0; i<input.size();i++){
					
					if(input.get(i) > largest){
						largest = input.get(i);
					}
					if(input.get(i) < smallest){
						smallest = input.get(i);
					}
					
				}
				sum+=j;
				mean+=j;
			}
			catch(InputMismatchException e){
				userInput.nextLine();
			}
			
	
	
		}
		if(smallest == Integer.MAX_VALUE && largest == Integer.MIN_VALUE){
			System.out.println("Please enter a number other than 0.");
		}
		else{
		System.out.println("smallest: "+smallest);
		System.out.println("largest: "+largest);
		System.out.println("sum: "+sum);
		System.out.printf("mean: %1."
				+ "3f",mean/input.size());
		}
	}

}

