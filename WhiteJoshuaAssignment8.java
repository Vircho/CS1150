/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Mar 22, 2023
 * Description: Assignment #8
 * - Practice using different classes & arrays
 */

public class WhiteJoshuaAssignment8 
{
	public static void main (String[] args)
	{
		// Variables
		int computedSumOfEvenNumbers;
		int sumOfAllConsecutivePairs;
		int[] twoLargestValues;
		
		
		int[] numbers = {10, 3, 8, 6, 1, 7, 2}; // Create the array
		
		display(numbers); // Display each value in the array
		
		computedSumOfEvenNumbers = computeSumOfEvenValues(numbers); // Compute & Display the sum of each even value in the array
		System.out.println("The sum of each even value in the array numbers:");
		System.out.println(computedSumOfEvenNumbers);
		System.out.println("**********");
		
		displaySumOfEachConsecutivePair(numbers); // Compute & Display the sum of each consecutive pair in the array
		
		sumOfAllConsecutivePairs = computeSumOfAllConsecutivePairs(numbers);  // Compute & Display the sum of all consecutive pairs in the array
		System.out.println("Sum of all consecutive pairs in the array numbers:");
		System.out.println(sumOfAllConsecutivePairs);
		System.out.println("**********");
		
		displaySumOfAllPairs(numbers); // Compute & Display the sum of all possible pairs in the array
		
		twoLargestValues = findTwoLargestValues(numbers); // Compute & Display the two largest numbers in the array
		System.out.println("Two largest values in the array numbers:");
		System.out.printf("%d %d", twoLargestValues[0], twoLargestValues[1]);
		System.out.printf("\n**********");
		System.out.printf("\n");
		
		// Dog
		Dog[] dogArray = new Dog[5];
		Dog dog1 = new Dog("Rover", "woof woof");
		Dog dog2 = new Dog("Max", "arf arf arf");
		Dog dog3 = new Dog("Tiny", "yap yap yap");
		Dog dog4 = new Dog("Trooper", "ruff ruff ruff");
		Dog dog5 = new Dog("Magoo", "bow wow bow wow");
		dogArray[0] = dog1;
		dogArray[1] = dog2;
		dogArray[2] = dog3;
		dogArray[3] = dog4;
		dogArray[4] = dog5;
		makeDogsBark(dogArray);
	}
	
	public static void display (int[] numbers)
	{
		System.out.println("Each value in the array numbers:");
		for (int i = 0; i < 7; i++)
		{
			System.out.println("The value in [" + i + "] is " + numbers[i]);
		}
		System.out.println("**********");
	}
	
	public static int computeSumOfEvenValues(int[] numbers)
	{
		int computedSumOfEvenNumbers = 0;
		
		for (int i = 0; i < 7; i++)
		{
			if (numbers[i] % 2 == 0)
			{
				computedSumOfEvenNumbers = computedSumOfEvenNumbers + numbers[i];
			}
		}
		return computedSumOfEvenNumbers;
	}
	
	public static void displaySumOfEachConsecutivePair(int[] numbers)
	{
		System.out.println("The sum of each consecutive pair in the array numbers:");
		for (int i = 0; i < 7; i++)
		{
			if (i != 0)
			{
				System.out.println(numbers[i-1] +
				" + " + numbers[i] + " = "
				+ (numbers[i-1] + numbers[i]));
			}
		}
		System.out.println("**********");
	}
	
	public static int computeSumOfAllConsecutivePairs(int[] numbers)
	{
		int sumOfAllConsecutivePairs = 0;
		
		for (int i = 0; i < 7; i++)
		{
			if (i != 0)
			{
				sumOfAllConsecutivePairs = (sumOfAllConsecutivePairs) + (numbers[i-1] + numbers[i]);
			}
		}
		return sumOfAllConsecutivePairs;
	}
	
	public static void displaySumOfAllPairs(int[] numbers)
	{
		System.out.println("The sum of all possible pairs in the array numbers:");
		for (int i = 0; i < 7; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				if (i != j && i < j)
				{
					System.out.println(numbers[i] + " + " + numbers[j] + " = " + (numbers[i] + numbers[j]));
				}
			}
		}
		System.out.println("**********");
	}
	
	public static int[] findTwoLargestValues(int[] numbers)
	{
		int[] twoLargestValues = {0, 0};
		
		for (int i = 0; i < 7; i++)
		{
			if (numbers[i] > twoLargestValues[0])
			{
				twoLargestValues[0] = numbers[i];
			}
			else if (numbers[i] > twoLargestValues[1])
			{
				twoLargestValues[1] = numbers[i];
			}
		}
		return twoLargestValues;
	}
	
	public static void makeDogsBark(Dog[] dogArray)
	{
		for (int i = 0; i < dogArray.length; i++)
		{
			System.out.println(dogArray[i].getName() + " barks like this: " + dogArray[i].getBark());
		}
	}
}

class Dog
{
	private String name;
	private String bark;
	
	public Dog(String name, String bark)
	{
		this.name = name;
		this.bark = bark;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getBark() 
	{
		return bark;
	}
	
	public void setBark(String bark) 
	{
		this.bark = bark;
	} 
}