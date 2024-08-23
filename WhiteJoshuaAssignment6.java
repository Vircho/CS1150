/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Mar 01, 2023
 * Description: Assignment #6
 * - Practice using all different kinds of loops
 */

import java.util.Scanner;
public class WhiteJoshuaAssignment6 
{
	public static void main(String[] args)
	{
		// Constants
		final double ONE_HOUR_PASS = 1.50;
		final double TWO_HOUR_PASS = 2.50;
		final double SIX_HOUR_PASS = 4;
		
		// Variables
		boolean customerModeOn = true;
		int bikesAvailable = 9;
		int bikePassChoice;
		int bikeAmountChoice;
		String displayPassChoice = "! Unkown Pass";
		double bikeRentalCost = 0;
		int unlockCode;
		int totalBikes = 0;
		double totalSales = 0;
		
		// Start input
		Scanner userInput = new Scanner (System.in);
		
		// Start customer mode loop
		while (customerModeOn)
		{
			
			// First Menu
			System.out.println("Welcome to Mikes Bikes! What can we do for you today?");
			System.out.println("-----------------------------------------------------");
			System.out.println("Bikes available: " + bikesAvailable                   );
			System.out.println("-----------------------------------------------------");				
			System.out.println("Rental Options | Fee                                 ");
			System.out.printf("[1] 1-Hour | $%.2f \n", ONE_HOUR_PASS);
			System.out.printf("[2] 2-Hour | $%.2f \n", TWO_HOUR_PASS);
			System.out.printf("[3] 6-Hour | $%.2f \n", SIX_HOUR_PASS);
			System.out.print("[4] Return Bike                       ");
			
			// Take in choice
			bikePassChoice = userInput.nextInt();
			
			// If invalid
			while (bikePassChoice < 1 || bikePassChoice > 4 && bikePassChoice != 999)
			{
				
				System.out.println("Invalid input. Please try again.");
				bikePassChoice = userInput.nextInt();
				
			}
			
			// If valid
			if (bikePassChoice == 999) // If admin code
			{
				
				customerModeOn = false;
				
			}
			else if (bikePassChoice == 4) // If Returning
			{
				
				if (bikesAvailable == 9)
				{
					
					System.out.println("Bike station is full.");
					System.out.printf("\n\n\n\n\n");
					
				}
				else
				{
					
					bikesAvailable = bikesAvailable + 1;
					System.out.println("Bike successfully returned; thank you for using Mike's Bikes");
					
				}
				
			}
			else // If renting
			{
				
				// Prompt
				System.out.println("Now put in how many. Maximum of 4");
				bikeAmountChoice = userInput.nextInt();
				
				// If invalid
				while (bikeAmountChoice < 1 || bikeAmountChoice > 4)
				{
					
					System.out.println("Invalid input. Please Try Again.");
					bikeAmountChoice = userInput.nextInt();
					
				}
				
				// If too many
				if (bikeAmountChoice > bikesAvailable)
				{
					
					System.out.println("There are not enough bikes here.");
					System.out.printf("\n\n\n\n\n");
					
				}
				
				// If valid, start calculating
				else if (bikeAmountChoice < bikesAvailable)
				{
					
					// Calculate pass type
					switch (bikePassChoice)
					{
					
					case 1:
						displayPassChoice = "One Hour Pass";
						bikeRentalCost = ONE_HOUR_PASS * bikeAmountChoice;
						break;
					case 2:
						displayPassChoice = "Two Hour Pass";
						bikeRentalCost = TWO_HOUR_PASS * bikeAmountChoice;
						break;
					case 3:
						displayPassChoice = "Six Hour Pass";
						bikeRentalCost = SIX_HOUR_PASS * bikeAmountChoice;
						
					}
					
					// Start printing
					System.out.println("Successfully rented bikes. Here is your reciept");
					System.out.println("-----------------------------------------------");
					System.out.println("-------------------RECIPT----------------------");
					System.out.println("-----------------------------------------------");
					System.out.printf("%s and %d bikes\n", displayPassChoice, bikeAmountChoice);
					System.out.println("Unlock Codes:");
					
					// Create and print unlock codes
					for (int i = 0; i < bikeAmountChoice; i++)
					{
						
						int randomNum = 10000 + (int) (Math.random() * 89999);
						unlockCode = randomNum;
						System.out.printf("%d: %d\n", (i + 1), unlockCode);
						
					}
					
					// Finish Reciept
					System.out.printf("Total Cost: $%.2f\n", bikeRentalCost);
					System.out.println("-----------------------------------------------");
					System.out.printf("\n\n\n\n\n");
					
					// Change necessary stats
					bikesAvailable = bikesAvailable - bikeAmountChoice;
					totalBikes = totalBikes + bikeAmountChoice;
					totalSales = totalSales + bikeRentalCost;
					
				}
				
			} // End of renting
			
		} // End of While Loop
		
		userInput.close();
		System.out.println("Shutdown successful. Final Stats:");
		System.out.println("Total bikes rented: " + totalBikes);
		System.out.printf("Total sales: $%.2f", totalSales);
		
	} // End of static void
	
} // End of class
