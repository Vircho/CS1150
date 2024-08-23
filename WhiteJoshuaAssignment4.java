/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Feb 15, 2023
 * Description: Assignment #4
 * - Practice using Math.random and int to char type-casting
 */

import java.util.Scanner;

public class WhiteJoshuaAssignment4 
{
	public static void main(String[] args)
	{
		// Set up constants
		final char ANIMAL_KINGDOM = 'A';
		final char EPCOT = 'E';
		final char HOLLYWOOD_STUDIOS = 'H';
		final char MAGIC_KINGDOM = 'M';
		
		// Set up variables
		String inputtedParkArea;
		char parkArea;
		int parkDays;
		int ticketNumber1;
		int ticketNumber2;
		char ticketLetter1;
		char ticketLetter2;
		char ticketLetter3;
		String ticketDays = "0";
		String ticketArea;
		
		// Introduce user
		System.out.println("Welcome to [THEME PARK]!");
		System.out.println("Please put in the area you will be visiting followed by the number of days you'll be spending.");
		System.out.println("(Must be inputted in the format of 'Letter, Space, Number. (A 1))");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("A: Animal Kingdom | E: Epcot | H: Hollywood Studios | M: Magic Kingdom");
		
		// Read in user input
		Scanner userInput = new Scanner (System.in);
		inputtedParkArea = userInput.next();
		parkArea = inputtedParkArea.charAt(0);
		parkDays = userInput.nextInt();
		userInput.close();
		
		// Check if valid letter
		if (Character.toUpperCase(parkArea) == 'A' || Character.toUpperCase(parkArea) == 'E' || Character.toUpperCase(parkArea) == 'H' ||
		Character.toUpperCase(parkArea) == 'M')
		{
			
			// Check if valid number
			if (parkDays >= 1 && parkDays <= 7)
			{
				
				if (Character.toUpperCase(parkArea) == ANIMAL_KINGDOM)
				{
					
					// Name the ticket
					ticketArea = "Animal Kingdom";
					
					// Create random ticket for Animal Kingdom (##-####-AK)
					int randomNum1 = 10 + (int) (Math.random() * 89);
					int randomNum2 = 1000 + (int) (Math.random() * 8999);
					ticketNumber1 = randomNum1;
					ticketNumber2 = randomNum2;
					
					// Use switch statement to display days.
					switch (parkDays)
					{
					
					case 1:
						ticketDays = "(1 Day Ticket)";
						break;
					case 2:
						ticketDays = "(2 Day Ticket)";
						break;
					case 3:
						ticketDays = "(3 Day Ticket)";
						break;
					case 4: 
						ticketDays = "(4 Day Ticket)";
					    break;
					case 5:
						ticketDays = "(5 Day Ticket)";
						break;
					case 6:
						ticketDays = "(6 Day Ticket)";
						break;
					case 7:
						ticketDays = "(7 Day Ticket)";
						break;
					
					}
					
					// Display the ticket for Animal Kingdom
					System.out.println("Done! here's your ticket!");
					System.out.println("-------------------------");
					System.out.println(ticketArea + ": " + ticketNumber1 + "-" + ticketNumber2 + "-AK " + ticketDays );
							
				}
				else if (Character.toUpperCase(parkArea) == EPCOT)
				{
					
					// Name the ticket
					ticketArea = "Epcot";
					
					// Randomize the ticket (####--XX--EP)
					int randomNum1 = 1000 + (int) (Math.random() * 8999);
					ticketNumber1 = randomNum1;
					int randomNum2 = 65 + (int) (Math.random() * 25);
					ticketLetter1 = (char)randomNum2;
					int randomNum3 = 65 + (int) (Math.random() * 25);
					ticketLetter2 = (char)randomNum3;
					
					// Use switch statement to display days.
					switch (parkDays)
					{
					
					case 1:
						ticketDays = "(1 Day Ticket)";
						break;
					case 2:
						ticketDays = "(2 Day Ticket)";
						break;
					case 3:
						ticketDays = "(3 Day Ticket)";
						break;
					case 4: 
						ticketDays = "(4 Day Ticket)";
					    break;
					case 5:
						ticketDays = "(5 Day Ticket)";
						break;
					case 6:
						ticketDays = "(6 Day Ticket)";
						break;
					case 7:
						ticketDays = "(7 Day Ticket)";
					    break;
					    
					}
					
					// Display the ticket for Epcot
					System.out.println("Done! Here's your ticket!");
					System.out.println("-------------------------");
					
					System.out.println(ticketArea + ": " + ticketNumber1 + 
							"--" + ticketLetter1 + "" + ticketLetter2 + "--E " + ticketDays);
					
				}
				else if (Character.toUpperCase(parkArea) == HOLLYWOOD_STUDIOS)
				{
					// Name the ticket
					ticketArea = "Hollywood Studios";
					
					// Randomize the ticket (XXX ### HS)
					int randomNum1 = 65 + (int) (Math.random() * 25);
					ticketLetter1 = (char)randomNum1;
					int randomNum2 = 65 + (int) (Math.random() * 25);
					ticketLetter2 = (char)randomNum2;
					int randomNum3 = 65 + (int) (Math.random() * 25);
					ticketLetter3 = (char)randomNum3;
					int randomNum4 = 100 + (int) (Math.random() * 899);
					ticketNumber1 = randomNum4;
					
					// Use switch statements to display days
					switch (parkDays)
					{
					
					case 1:
						ticketDays = "(1 Day Ticket)";
						break;
					case 2:
						ticketDays = "(2 Day Ticket)";
						break;
					case 3:
						ticketDays = "(3 Day Ticket)";
						break;
					case 4: 
						ticketDays = "(4 Day Ticket)";
					    break;
					case 5:
						ticketDays = "(5 Day Ticket)";
						break;
					case 6:
						ticketDays = "(6 Day Ticket)";
						break;
					case 7:
						ticketDays = "(7 Day Ticket)";
					    break;
					    
					}
					
					// Display the ticket for Hollywood Studios
					System.out.println("Done! Here's your ticket!");
					System.out.println("-------------------------");
					
					System.out.println(ticketArea + ": " + ticketLetter1 + ticketLetter2 
					+ ticketLetter3 + " " + ticketNumber1 + " HS " + ticketDays);
					
				}
				else if (Character.toUpperCase(parkArea) == MAGIC_KINGDOM)
				{
					// Name the ticket
					ticketArea = "Magic Kingdom";
					
					// Randomize the ticket (# XXX MK)
					int randomNum1 = (int) (Math.random() * 9);
					ticketNumber1 = randomNum1;
					int randomNum2 = 65 + (int) (Math.random() * 25);
					ticketLetter1 = (char)randomNum2;
					int randomNum3 = 65 + (int) (Math.random() * 25);
					ticketLetter2 = (char)randomNum3;
					int randomNum4 = 65 + (int) (Math.random() * 25);
					ticketLetter3 = (char)randomNum4;
					
					// Use switch statements to display days
					switch (parkDays)
					{
					
					case 1:
						ticketDays = "(1 Day Ticket)";
						break;
					case 2:
						ticketDays = "(2 Day Ticket)";
						break;
					case 3:
						ticketDays = "(3 Day Ticket)";
						break;
					case 4: 
						ticketDays = "(4 Day Ticket)";
					    break;
					case 5:
						ticketDays = "(5 Day Ticket)";
						break;
					case 6:
						ticketDays = "(6 Day Ticket)";
						break;
					case 7:
						ticketDays = "(7 Day Ticket)";
					    break;
					    
					}
					
					// Display the ticket for Magic Kingdom
					System.out.println("Done! Here's your ticket!");
					System.out.println("-------------------------");
					
					System.out.println(ticketArea + ": " + ticketNumber1 + 
					" " + ticketLetter1 + ticketLetter2 + ticketLetter3 + " MK " + ticketDays);
					
				}
			}
			else
			{
				System.out.println(parkDays + " is not a valid amount of days. Please run the program again.");
			}
			
		}
		else
		{
			System.out.println(parkArea + " is not a valid park location. Please run the program again.");
		}
		
	}

}
