/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Feb 22, 2023
 * Description: Assignment #5
 * - Practice using while and for loops to create a scratch ticket simulator
 */

import java.util.Scanner;
public class WhiteJoshuaAssignment5 
{
	public static void main(String[] args)
	{
	
		// Variables
		int ticketsBought;
		int winningNumber;
		int scratchNumber1;
		int scratchNumber2;
		int scratchNumber3;
		int winningTickets = 0;
		char winOrLoss;
		int ticketNumber = 0;
		double probability;
		
		// Prompt for input
		System.out.println("Welcome to the Gambling Grounds! How many tickets will you buy? (1-15)");
		Scanner userInput = new Scanner (System.in);
		ticketsBought = userInput.nextInt();
		
		// Check if valid
		while (ticketsBought < 1 || ticketsBought > 15)
		{
			System.out.println("That's not a valid number of tickets, please enter a ticket amount between 1 and 15");
			ticketsBought = userInput.nextInt();
		}
		
		// Don't need this anymore
		userInput.close();
		
		// Create winning ticket numbers, scratch tickets, and display them
		System.out.println("Here are your tickets!");
		System.out.println("Ticket | Outcome | Winning# | Scratch Ticket Numbers");
		System.out.println("---------------------------------------------------");
		
		for (int i = 0; i < ticketsBought; i++)
		{
			winningNumber = 1 + (int) (Math.random() * 29);	
			scratchNumber1 = 1 + (int) (Math.random() * 29);	
			scratchNumber2 = 1 + (int) (Math.random() * 29);
			scratchNumber3 = 1 + (int) (Math.random() * 29);
			ticketNumber = ticketNumber + 1;
			
			if (scratchNumber1 == winningNumber || scratchNumber2 == winningNumber || scratchNumber3 == winningNumber)
			{
				winningTickets = winningTickets + 1;
				winOrLoss = 'W';
			}
			else
			{
				winOrLoss = 'L';
			}
			
			System.out.printf("%d \t %c \t %d \t %d \t %d \t %d\n", ticketNumber, winOrLoss, winningNumber, scratchNumber1, scratchNumber2, scratchNumber3);
			
		}
		
		// Display final numbers
		probability = ((double)winningTickets / (double)ticketsBought) * 100;
		System.out.println("Scratch tickets bought: " + ticketsBought);
		System.out.println("Number of winning tickets: " + winningTickets);
		System.out.printf("Probability of winning: %.5f", probability);
		System.out.print("%");
	
	}
	
}
