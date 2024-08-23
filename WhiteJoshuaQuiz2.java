public class WhiteJoshuaQuiz2 {
	//Main
	public static void main(String[] args) {	
		//Part 1
		// Create the arrays
		int[] numbers1 = {8, 1, 7, 19, 2};
		int[] numbers2 = {6, 3, 12, 4};
		int largestNum = findLargest(numbers1, numbers2);
		
		// Print the largest value in the arrays
		System.out.println("Largest value = " + largestNum);
		
		
		//Part 2
		// Create the turtles
		final int NUM_TURTLES = 6;
		TurtleQ turtle1 = new TurtleQ("Hawksbill", 45, "Rose");
		TurtleQ turtle2 = new TurtleQ("Loggerhead", 62, "Pancake");
		TurtleQ turtle3 = new TurtleQ("Greenturtle", 39, "Olive");
		TurtleQ turtle4 = new TurtleQ("Hawksbill", 33, "Miss Piggy");
		TurtleQ turtle5 = new TurtleQ("Loggerhead", 14, "B StreiSAND");
		TurtleQ turtle6 = new TurtleQ("Loggerhead", 75, "Poptart");
		TurtleQ[] turtles = new TurtleQ[NUM_TURTLES];
		turtles[0] = turtle1;
		turtles[1] = turtle2;
		turtles[2] = turtle3;
		turtles[3] = turtle4;
		turtles[4] = turtle5;
		turtles[5] = turtle6;
		
		// Find how many are loggerheads & print it
		int numLoggerheads = findNumTurtles(turtles, "Loggerhead");
		System.out.println("Number of loggerhead turtles = " + numLoggerheads);
		
		// Find the average age & print it
		double averageAge = computeAverageAge(turtles);
		System.out.printf("Average age of the all turtles: %.2f \n", averageAge);
		
		// Display how many are older than average
		displayOlderThanAverage(turtles, averageAge);
	}
	
	//Find largest of two arrays
	public static int findLargest(int[] array1, int[] array2) {
		//Where the largest will be located
		int largestNum = 0;
		
		for (int i = 0; i < array1.length; i++) { //Search the first array
			if (array1[i] > largestNum) {
				largestNum = array1[i];
			}
		}
		for (int i = 0; i < array2.length; i++) { //Search the second array
			if (array2[i] > largestNum) {
				largestNum = array2[i];
			}
		}
		
		return largestNum;
	}
	
	//Find number of turtles of specific type
	public static int findNumTurtles(TurtleQ[] turtles, String type) {
		
		//Where the amount will be located
		int numLoggerheads = 0;
		
		//Go through each turtle, see if it's a loggerhead, then increase amount
		for (int i = 0; i < turtles.length; i++) {
			if (turtles[i].getType() == type) {
				numLoggerheads++;
			}
		}
		return numLoggerheads;
	}
	
	//Find average age of turtles
	public static double computeAverageAge(TurtleQ[] turtles) {
		
		//Where the average age will be stores
		double averageAge = 0;
		int numTurtles = 0;
		
		//Go through each turtle and do math with the age
		for (int i = 0; i < turtles.length; i++) {
			averageAge = averageAge + turtles[i].getAge();
			numTurtles++;
		}
		averageAge = averageAge / numTurtles;
		
		return averageAge;
	}
	
	//Find all turtles older than average age
	public static void displayOlderThanAverage(TurtleQ[] turtles, double averageAge) {
		
		//Print beginning
		System.out.printf("\n");
		System.out.println("Turtles Older Than The Average Age");
		System.out.println("------------------------------------------");
		System.out.println("Name	Age	Type");
		System.out.println("------------------------------------------");
		
		//Find which turtles are older than average and then print it
		for (int i = 0; i < turtles.length; i++) {
			if (turtles[i].getAge() > averageAge) {
				System.out.printf("%S\t%d\t%S\n", turtles[i].getName(), turtles[i].getAge(), turtles[i].getType());
			}
		}
	}
}

class TurtleQ {
	private String type;
	private int age;
	private String name;
	
	public TurtleQ (String type, int age, String name) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}