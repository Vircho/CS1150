import java.util.Scanner;
public class Media_Randomizer 
{
	public static void main(String[] args)
	{
		// Variables
		int mediaTypeChoice;
		boolean running = true;

		while (running)
		{
			Scanner userInput = new Scanner(System.in);
			// Prompt
			System.out.println("--------------------------");
			System.out.println("Do you want to generate a:");
			System.out.println("Game[1]?");
			System.out.println("Movie[2]?");
			System.out.println("Show[3]?");
			System.out.println("END_PROGRAM[4]");
			
			mediaTypeChoice = userInput.nextInt();
			
			while (mediaTypeChoice < 1 || mediaTypeChoice > 4)
			{
				mediaTypeChoice = userInput.nextInt();
			}
			
			switch (mediaTypeChoice)
			{
			case 1:
				generateGame(userInput);
				break;
			case 2:
				generateFilm(userInput);
				break;
			case 3:
				generateShow(userInput);
				break;
			case 4:
				running = false;
				break;
			}
		}
		
	}
	
	public static void generateGame(Scanner userInput)
	{
		int gameAmount = 0;
		int availablePages = 0;
		int generatedSquare = 0;
		int generatedPage = 0;
		int lastPage = 0;
		
		// Get necessary values
		System.out.println("How many games are on backloggd?");
		gameAmount = userInput.nextInt();
		availablePages = (int) Math.ceil(gameAmount / 36);
		lastPage = gameAmount % 36;
		
		// randomize everything
		generatedPage = (int) ((int)(Math.random() * availablePages) + 1);
		if (generatedPage == availablePages) {
			generatedSquare = (int) ((int) (Math.random() * lastPage) + 1);
		}
		else {
			generatedSquare = (int) ((int) (Math.random() * 36) + 1);
		}
		
		// Print results
		System.out.println("To go to your random game, go to the popular page.");
		System.out.println("Go to page " + generatedPage + ".");
		System.out.println("Go to the " + generatedSquare + " game on the page.");
		System.out.println("There's your game!");
	}
	
	public static void generateFilm(Scanner userInput)
	{
		int filmAmount = 0;
		int availablePages = 0;
		int generatedSquare = 0;
		int generatedPage = 0;
		int lastPage = 0;
		
		// Get necessary values
		System.out.println("How many films are on letterboxd?");
		filmAmount = userInput.nextInt();
		availablePages = (int) Math.ceil(filmAmount / 72);
		lastPage = filmAmount % 36;
		
		// randomize everything
		generatedPage = (int) ((int)(Math.random() * availablePages) + 1);
		if (generatedPage == availablePages) {
			generatedSquare = (int) ((int) (Math.random() * lastPage) + 1);
		}
		else {
			generatedSquare = (int) ((int) (Math.random() * 72) + 1);
		}
		
		// Print results
		System.out.println("To go to your random film, go to the popular page.");
		System.out.println("Go to page " + generatedPage + ".");
		System.out.println("Go to the " + generatedSquare + " film on the page.");
		System.out.println("There's your film!");
	}
	
	public static void generateShow(Scanner userInput)
	{
		int showAmount = 0;
		int availablePages = 0;
		int generatedSquare = 0;
		int generatedPage = 0;
		int lastPage = 0;
		int checkVIP = 0;
		boolean statusVIP = false;
		int showsPerPage = 0;
		
		// Check VIP
		System.out.println("Do you have VIP for Trakt?");
		System.out.println("[1] - Yes");
		System.out.println("[2] - No");
		checkVIP = userInput.nextInt();
		while (checkVIP < 1 || checkVIP > 2)
		{
			checkVIP = userInput.nextInt();
		}
		switch (checkVIP)
		{
		case 1:
			statusVIP = true;
			showsPerPage = 36;
			break;
		case 2:
			statusVIP = false;
			showsPerPage = 35;
			break;
		}
		
		// Get necessary values
		System.out.println("To start, go to https://trakt.tv/search/shows?query=");
		System.out.println("How many shows are on Trakt?");
		showAmount = userInput.nextInt();
		availablePages = (int) Math.ceil(showAmount / showsPerPage);
		lastPage = showAmount % showsPerPage;
		
		// randomize everything
		generatedPage = (int) ((int)(Math.random() * availablePages) + 1);
		if (generatedPage == availablePages) {
			generatedSquare = (int) ((int) (Math.random() * lastPage) + 1);
		}
		else {
			generatedSquare = (int) ((int) (Math.random() * showsPerPage) + 1);
		}
		
		// Print results
		System.out.println("To go to your random show, go to https://trakt.tv/search/shows?query=");
		System.out.println("Go to page " + generatedPage + " by putting page=(page number)& after the ? in the URL");
		System.out.println("Go to the " + generatedSquare + " show on the page.");
		System.out.println("There's your show!");
	}
}
