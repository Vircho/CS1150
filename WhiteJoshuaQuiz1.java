import java.util.Scanner;

public class WhiteJoshuaQuiz1 
{
	public static void main(String[] args)
	{	
		// Variables
		String carChoice;
		char trueCarChoice;
		int daysChoice;
		int dailyPrice;
		int carPrice;
		
		// Prompt User
		System.out.println("Please put in a valid character for car.");
		System.out.println("A: Avis B: Budget H: Hertz N: National");
		Scanner userInput = new Scanner (System.in);
		carChoice = userInput.nextLine();
		trueCarChoice = carChoice.charAt(0);
		
		// Check if valid
		if (Character.toUpperCase(trueCarChoice) == 'A' ||Character.toUpperCase(trueCarChoice) == 'B' 
		|| Character.toUpperCase(trueCarChoice) == 'H' || Character.toUpperCase(trueCarChoice) == 'N')
		{
			// Print user selection
			if (Character.toUpperCase(trueCarChoice) == 'A')
			{
				System.out.println("You have selected Avis");
			}
			else if (Character.toUpperCase(trueCarChoice) == 'B')
			{
				System.out.println("You have selected Budget");
			}
			else if (Character.toUpperCase(trueCarChoice) == 'H')
			{
				System.out.println("You have selected Hertz");
			}
			else if (Character.toUpperCase(trueCarChoice) == 'N')
			{
				System.out.println("You have selected National");
			}
			
			// Read in number of days
			System.out.println("Please input number of days 1-30");
			daysChoice = userInput.nextInt();
			
			// Check if valid
			if (daysChoice >= 1 && daysChoice <= 30)
			{
				// Display price
				if (daysChoice >= 1 && daysChoice <= 7)
				{
					dailyPrice = 65;
					carPrice = dailyPrice * daysChoice;
					System.out.println("The car will cost $" + dailyPrice + " per day for a total of $" + carPrice);
				}
				else if (daysChoice >= 8 && daysChoice <= 14)
				{
					dailyPrice = 55;
					carPrice = dailyPrice * daysChoice;
					System.out.println("The car will cost $" + dailyPrice + " per day for a total of $" + carPrice);
				}
				else if (daysChoice >= 15 && daysChoice <= 25)
				{
					dailyPrice = 50;
					carPrice = dailyPrice * daysChoice;
					System.out.println("The car will cost $" + dailyPrice + " per day for a total of $" + carPrice);
				}
				else if (daysChoice >= 26 && daysChoice <= 30)
				{
					dailyPrice = 40;
					carPrice = dailyPrice * daysChoice;
					System.out.println("The car will cost $" + dailyPrice + " per day for a total of $" + carPrice);
				}
				
			}
			else
			{
				System.out.println(daysChoice + " is not a valid number of days. Please run the program again.");
			}
				
		}
		else
		{
			System.out.println(trueCarChoice + " is not a valid option. Run the program again.");
		}
		userInput.close();
	}	
}