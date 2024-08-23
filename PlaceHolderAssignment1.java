/*
 * Joshua White
 * CS1450 (T/R)
 * Due 08/31/23
 * Assignment 1
 * Review loops, arrays and files
 */
import java.util.Arrays;
public class PlaceHolderAssignment1 {
	public static void main(String[] args) {
		// Create array, sort it, then display the sorted array
		int[] array = {17, 10, 2, 16, 8, 15, 9, 17, 14, 18, 1, 19, 17, 2, 0};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("*************************");
		
		
		
		// Display all values that add to 10 (remember to fix it using pairs twice later)
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] + array[j] == 10) {
					System.out.println(array[i] + "(at " + i + ") + " + array[j] + "(at " + j + ") = 10 ");
				}
			}
		}
		
		int amountOfCurrentNumbers = 0;
		int mostNumbersFound = 0;
		int placeOfMostNumbersFound = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				amountOfCurrentNumbers++;
			}
			else if (amountOfCurrentNumbers > mostNumbersFound) {
				mostNumbersFound = amountOfCurrentNumbers;
				amountOfCurrentNumbers = 0;
				placeOfMostNumbersFound = i - 1;
			}
		}
		int mode = array[placeOfMostNumbersFound];
		System.out.println("The mode of the array is: " + mode);
		
	}

	
	
	
}
