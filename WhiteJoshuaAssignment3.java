/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Feb 08, 2023
 * Description: Assignment #3 
 * - Practice using nested if-statements
 */


import java.util.Scanner;

public class WhiteJoshuaAssignment3 
{
	public static void main(String[] args)
	{
		// Set up constants
		final double ECONOMY_PRICE = 62.00;
		final double COMPACT_PRICE = 75.00;
		final double STANDARD_PRICE = 83.00;
		final double LUXURY_PRICE = 118.00;
		final double DAILY_FEE = 2.50;
		final double TAX_RATE = 0.1125;
		
		// Set up variables
		int carSelection;
		int dayRentAmount;
		double costOfCar = 0;
		double carFees;
		double carTax;
		double carTotal;
		String carName = "Unknown";
		
		// Print out menu for selection
		System.out.println("----------------------");
		System.out.println("Select your car.      ");
		System.out.println("----------------------");
		System.out.println("|1| Economy  | $62.00 ");
		System.out.println("|2| Compact  | $75.00 ");
		System.out.println("|3| Standard | $83.00 ");
		System.out.println("|4| Luxury   | $118.00");
		System.out.println("----------------------");
		System.out.println(" ! Make sure you use  ");
		System.out.println("       Numbers !      ");
		System.out.println("----------------------");
		
		// Scan in user input
		Scanner userInput = new Scanner (System.in);
		carSelection = userInput.nextInt();
		
		// Check car selection
		if (carSelection >= 1 && carSelection <= 4)
		{
			
			// Prompt for and scan in day rent amount.
			System.out.println("----------------------");
			System.out.println("Select number of days.");
			System.out.println("        (1-20)        ");
			System.out.println("----------------------");
			dayRentAmount = userInput.nextInt();
			userInput.close();
			
			// Check if days is valid
			if (dayRentAmount > 0 && dayRentAmount < 21)
			{
				
				// Calculate necessary variables
				if (carSelection == 1)
				{
					costOfCar = ECONOMY_PRICE * dayRentAmount;
					carName = "Economy";
				}
				else if (carSelection == 2)
				{
					costOfCar = COMPACT_PRICE * dayRentAmount;
					carName = "Compact";
				}
				else if (carSelection == 3)
				{
					costOfCar = STANDARD_PRICE * dayRentAmount;
					carName = "Standard";
				}
				else if (carSelection == 4)
				{
					costOfCar = LUXURY_PRICE * dayRentAmount;
					carName = "Luxury";
				}
				carFees = (DAILY_FEE * dayRentAmount);
				carTax = (costOfCar + carFees) * TAX_RATE; 
				carTotal = costOfCar + carFees + carTax;
				
				// Display all information
				System.out.print("--------------------");
				System.out.printf("\n");
				System.out.print("Car:   " + carName);
				System.out.printf("\n");
				System.out.printf("Cost:  $%.2f", costOfCar);
				System.out.printf("\n");
				System.out.printf("Fees:  $%.2f", carFees);
				System.out.printf("\n");
				System.out.printf("Tax:   $%.2f", carTax);
				System.out.printf("\n");
				System.out.printf("Total: $%.2f", carTotal);
				System.out.printf("\n");
				System.out.print("--------------------");
				
			}
			else
			{
				System.out.println(dayRentAmount + " is not a valid amount of days. Run the program again.");
			}
		
		}
	    else
		{
			System.out.println(carSelection + " is not a valid option. Run the program again.");
		}

	}
	
}