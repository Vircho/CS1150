/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Mar 08, 2023
 * Description: Assignment #7
 * - Practice using different methods
 */

import java.util.Scanner;
public class WhiteJoshuaAssignment7 
{
	
	// main - Main method
	public static void main (String[] args)
	{
		
		// Scanner
		Scanner userInput = new Scanner (System.in);
		
		// Variables
		int chosenHealthCheck;
		double calculatedBMI;
		String finalHealthResults;
		int bloodPressureTop = 0;
		int bloodPressureBottom = 0;
		int cholesterol = 0;
		
		// Get the health check
		chosenHealthCheck = getHealthCheck(userInput);
		
		// While not exited
		while (chosenHealthCheck != 4)
		{
			
			if (chosenHealthCheck == 1)
			{
				
				calculatedBMI = computeBMI (userInput);
				finalHealthResults = checkBMI (calculatedBMI);
				displayResults(chosenHealthCheck, finalHealthResults);
				chosenHealthCheck = getHealthCheck(userInput);
				
			}
			else if (chosenHealthCheck == 2)
			{
				
				// Since I need to return 2 seperate numbers, the prompt will be up here to make sure it only prompts once.
				System.out.println("You have chosen: Blood Pressure");
				System.out.println("Please input your top number then your bottom number of your blood pressure.");
				System.out.println("(Number, enter, number)");
				
				bloodPressureTop = computeBloodPressure(userInput);
				bloodPressureBottom = computeBloodPressure(userInput);
				finalHealthResults = checkBloodPressure(bloodPressureTop, bloodPressureBottom);
				displayResults(chosenHealthCheck, finalHealthResults);
				chosenHealthCheck = getHealthCheck(userInput);
				
			}
			else if (chosenHealthCheck == 3)
			{
				
				cholesterol = computeCholesterol(userInput);
				finalHealthResults = checkCholesterol(cholesterol);
				displayResults(chosenHealthCheck, finalHealthResults);
				chosenHealthCheck = getHealthCheck(userInput);
				
			}	
			
		} // End of While Loop
		
		System.out.println("System exited. Goodbye."); // While loop exited
		
	}
	//|End of main|
	
	// getHealthCheck - Returns the chosen health check option
	public static int getHealthCheck (Scanner userInput)
	{
		
		// Variables
		int whichHealthCheck;
		
		// Display and prompt
		System.out.println("-----------------------");
		System.out.println("Welcome to health check");
		System.out.println("-----------------------");
		System.out.println("Option | Health Check  ");
		System.out.println("1      | BMI           ");
		System.out.println("2      | Blood Pressure");
		System.out.println("3      | Cholesterol   ");
		System.out.println("4      | Exit          ");
		whichHealthCheck = userInput.nextInt();
		
		// Check validity
		while (whichHealthCheck < 1 || whichHealthCheck > 4)
		{
			
			System.out.println("Invalid health check entry. Please try again.");
			whichHealthCheck = userInput.nextInt();
			
		}
		
		// Return option
		return whichHealthCheck;
		
	}
	//|End of getHealthCheck|
	
	// computeBMI - Calculate users BMI
    public static double computeBMI (Scanner userInput)
	{
    	
		// Variables
		double userWeight;
		double userFeet;
		double userInches;
		double userBMI;
		double totalInches;
		
		// Prompt & Scan BMI Data
		System.out.println("You have chosen: BMI");
		System.out.println("What is your weight (lbs)? ");
		userWeight = userInput.nextInt();
		System.out.println("What is your height (ft.)? ");
		userFeet = userInput.nextInt();
		System.out.println("What is your height (in.)? ");
		userInches = userInput.nextInt();
		
		// Calculate
		totalInches = (userFeet * 12) + userInches;
		userBMI = 703 * (userWeight / (totalInches * totalInches));
		
		// Return
		return userBMI;
		
	}
	//|End of computeBMI|
	
    //checkBMI - Turns BMI score into String
	public static String checkBMI (double bodyMassIndex)
	{
		
		// Variables
		String finalBMI = " ";
		
		// Transform BMI score into words
		if (bodyMassIndex < 18.5)
		{
			
			finalBMI = "Underweight";
			
		}
		else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 25)
		{
			
			finalBMI = "Normal";
			
		}
		else if (bodyMassIndex > 25)
		{
			
			finalBMI = "Overweight";
			
		}
		
		return finalBMI;
		
	}
	//|End of checkBMI|
	
	// computeCholesterol - Prompts user to enter cholesterol
	public static int computeCholesterol (Scanner userInput)
	{
		
		int inputtedCholesterol;
		System.out.println("You have chosen: Cholesterol");
		System.out.println("Please input your cholesterol.");
		inputtedCholesterol = userInput.nextInt();
		
		return inputtedCholesterol;
		
	}
	//|End of computeCholesterol|
	
	//checkCholesterol - Turns user cholesterol into String
	public static String checkCholesterol (int cholesterol)
	{
		
		String userCholesterol = " ";
		
		if (cholesterol < 200)
		{
			
			userCholesterol = "Good";
			
		}
		else if (cholesterol >= 200 && cholesterol <= 239)
		{
			
			userCholesterol = "Borderline";
			
		}
		else if (cholesterol > 239)
		{
			
			userCholesterol = "High";
			
		}
		
		return userCholesterol;
		
	}
	//|End of checkCholesterol|
	
	// computeBloodPressure - Takes in users blood pressure
	public static int computeBloodPressure (Scanner userInput)
	{
		
		// Variables
		int returnedNumber = 0;
		
		returnedNumber = userInput.nextInt();
		return returnedNumber;
		
	}
	//|End of computeBloodPressure|
	
	// checkBloodPressure - Turns user blood pressure into String
	public static String checkBloodPressure (int topNumber, int bottomNumber)
	{
		
		String userBloodPressure = " ";
		
		if (topNumber <= 120 && bottomNumber <= 80)
		{
			
			userBloodPressure = "Normal";
			
		}
		else if (topNumber >= 121 && topNumber <= 129 && bottomNumber <= 80)
		{
			
			userBloodPressure = "Elevated";
			
		}
		else if (topNumber >= 130 && topNumber <= 139 && bottomNumber >= 80 && bottomNumber <= 89)
		{
			
			userBloodPressure = "Stage 1 blood pressure";
			
		}
		else
		{
			
			userBloodPressure = "Stage 2 blood pressure";
			
		}
		
		return userBloodPressure;
		
	}
	//|End of checkBloodPressure|
	
	// displayResults - Displays the results of the health check chosen
	public static void displayResults (int healthCheck, String healthCheckResult)
	{
		
		switch (healthCheck)
		{
		
		case 1:
			System.out.println("Your BMI indicates that you are " + healthCheckResult);
			break;
		case 2:
			System.out.println("Your blood pressure is " + healthCheckResult);
			break;
		case 3:
			System.out.println("Your cholesterol is " + healthCheckResult);
			break;
			
		}
		
	}
	//|End of displayResults|
	
}