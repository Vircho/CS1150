/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Apr 19, 2023
 * Description: Assignment #11
 * - Remake Shrek Smash 'n Crash Racing by creating a race and then printing the results to a file
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class WhiteJoshuaAssignment11 {
	public static void main(String[] args) throws IOException {
		
		// Create array of 6 race cars
		RaceCar[] raceCars;
		raceCars = new RaceCar[6];
		
		// Fill the racecars
		createRaceCars(raceCars);
		
		// Display the racers
		System.out.println("Race cars at start of race");
		displayAllRaceCars(raceCars);
		
		// Start the race
		boolean allRacersFinished = false;
		double minutesRaced = 0;
		System.out.println("");
		System.out.println("All cars are ready - let the race begin in 5..4..3..2..1");
		while (allRacersFinished == false) {
			minutesRaced = minutesRaced + 15;
			System.out.println("Racing time ... " + (minutesRaced / 60)); //Display how many hours have passed
			if (minutesRaced % 60 == 0) { //Check to see if an hour has passed
				for (int i = 0; i < raceCars.length; i++) {
					if (raceCars[i].isFinished() == false) { //Check if the race car is already finished or not
						raceCars[i].getOdometer().updateMiles(raceCars[i].getOdometer().getMiles(), raceCars[i].getAverageSpeed()); //Call updateMiles on the drivers odometer
					}
					if (raceCars[i].getOdometer().getMiles() >= 500) { //Check if racer has gone 500 miles
						displayRaceCar(raceCars[i]);
						raceCars[i].setFinished(true);
					}
				}
			}
			allRacersFinished = isRaceFinished(raceCars); //Checks if all racers are done
		} //End of While Loop
		
		//Display the racers after race is complete
		System.out.println("");
		System.out.println("Race cars at end of race");
		displayAllRaceCars(raceCars);
		
		//Write the car details to file
		writeRaceCarDetailsToFile(raceCars);
		
	}//main
	
	public static void createRaceCars(RaceCar[] raceCars) {
		
		// Manually fill the race cars
		RaceCar raceCar1 = new RaceCar("Donkey   ", 8, 80);
		RaceCar raceCar2 = new RaceCar("Shrek    ", 11, 115);
		RaceCar raceCar3 = new RaceCar("Dragon   ", 17, 70);
		RaceCar raceCar4 = new RaceCar("Fiona    ", 18, 100);
		RaceCar raceCar5 = new RaceCar("Farquaad ", 45, 84);
		RaceCar raceCar6 = new RaceCar("Pinocchio", 42, 68);
		raceCars[0] = raceCar1;
		raceCars[1] = raceCar2;
		raceCars[2] = raceCar3;
		raceCars[3] = raceCar4;
		raceCars[4] = raceCar5;
		raceCars[5] = raceCar6;
	}//createRaceCars
	
	public static void displayRaceCar(RaceCar raceCar) {
		System.out.println("Finished: " + raceCar.getDriver() + " with " + raceCar.getOdometer().getMiles() + " miles.");
	}//displayRaceCar
	
	public static void displayAllRaceCars(RaceCar[] raceCars) {
		
		// Begin display
		System.out.println("---------------------------------------------------------");
		System.out.println("Race-Car Driver         Average Miles");
		System.out.println("Number                  Speed   Raced");
		System.out.println("---------------------------------------------------------");
		
		// Display each racer using a for-loop
		for (int i = 0; i < raceCars.length; i++) {
			System.out.printf("%d\t%S\t%.2f\t%.2f\n", raceCars[i].getNumber(), raceCars[i].getDriver(), raceCars[i].getAverageSpeed(), raceCars[i].getOdometer().getMiles());
		}
	}//displayAllRaceCars
	
	public static boolean isRaceFinished(RaceCar[] raceCars) {
		boolean isRaceFinished = false;
		int finishedRacers = 0;
		for (int i = 0; i < raceCars.length; i++) {
			if (raceCars[i].isFinished() == true) {
				finishedRacers++;
			}
		}
		if (raceCars.length == finishedRacers) {
			isRaceFinished = true;
		}
		
		return isRaceFinished;
	}//isRaceFinished
	
	public static void writeRaceCarDetailsToFile(RaceCar[] raceCars) throws IOException {
		File fileName = new File("Assignment11.txt"); //Creates the file
		PrintWriter resultsFile = new PrintWriter (fileName); //Makes a variable to reference the file
		resultsFile.println("Race Car Details"); //Prints to the file v
		for (int i = 0; i < raceCars.length; i++) {
			resultsFile.println("Race Car #: " + raceCars[i].getNumber());
			resultsFile.println("Driver: " + raceCars[i].getDriver());
			resultsFile.println("Miles: " + raceCars[i].getOdometer().getMiles());
			resultsFile.println();
			resultsFile.println();
		}
		resultsFile.close(); //Closes access to the file
		System.out.println("Find the file here " + fileName.getAbsolutePath());
		System.out.println();
	} 
}

class RaceCar {
	
	// Instance Variables
	private String driver;
	private int number;
	private double averageSpeed;
	private boolean finished;
	private Odometer odometer;
	
	// Constructors
	public RaceCar(String driver, int number, double averageSpeed) {
		this.driver = driver;
		this.number = number;
		this.averageSpeed = averageSpeed;
		odometer = new Odometer();
	}
	
	// Getters
	public String getDriver() {
		return driver;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getAverageSpeed() {
		return averageSpeed;
	}
	
	public boolean isFinished() {
		return finished;
	}
	
	public Odometer getOdometer() {
		return odometer;
	}
	
	// Setters
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
}

class Odometer {
	
	// Instance Variables
	private double miles;
	
	// Constructors
	public Odometer() {
		
	}
	
	// Getters
	public double getMiles() {
		return miles;
	}
	
	// Setters
	
	// Other Methods
	public void updateMiles(double milesTraveled, double driverSpeed) {
		milesTraveled = milesTraveled + driverSpeed;
		miles = milesTraveled;
	}
}