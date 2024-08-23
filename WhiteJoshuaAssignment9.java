/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Apr 05, 2023
 * Description: Assignment #9
 * - Play around with changing arrays
 */

import java.util.Arrays;
public class WhiteJoshuaAssignment9 
{
	public static void main (String[] args)
	{
		// variables
		int[] original;
		int[] even;
		int[] odd;
		int[] combined;
		int[] firstArrayToMerge = {1, 2, 10, 11, 12, 14};
		int[] secondArrayToMerge = {3, 4, 5, 13, 15, 16, 17};
		int[] mergedArray;
		int evenAmount = 0;
		int oddAmount = 0;
		original = new int[12];
		String currentName = "Original Array";
		
		// fill original with random numbers
		for (int i = 0; i < original.length; i++)
		{
			original[i] = (int) (Math.random() * 50) + 1;
			
			// prepare for even & odd arrays by finding out how many are even vs odd
			if (original[i] % 2 == 0)
			{
				evenAmount++;
			}
			else if (original[i] % 2 == 1)
			{
				oddAmount++;
			}
		}
		
		// display original array
		display (original, currentName);
		
		// fill the even & odd arrays
		even = new int[evenAmount];
		odd = new int[oddAmount];
		fillEvenAndOddArrays(original, even, odd);
		
		// sort & display even
		Arrays.sort(even);
		currentName = "Even Array Sorted";
		display(even, currentName);
				
		// sort & display odd
		Arrays.sort(odd);
		currentName = "Odd Array Sorted";
		display(odd, currentName);
		
		// combine the two arrays
		combined = new int[even.length + odd.length];
		combined = combineTwoArrays(even, odd);
		
		// put combined array into descending order
		descendingOrderSort(combined);
		
		// display the array
		currentName = "Combined Array Sorted in Descending Order (largest to smallest)";
		display(combined, currentName);
		
		// merge arrays
		mergedArray = sortedMerge(firstArrayToMerge, secondArrayToMerge);
		
		// display the arrays
		currentName = "Manually Merged Array Sorted in Descending Order (largest to smallest)";
		display(mergedArray, currentName);
	}
	
	public static void fillEvenAndOddArrays (int[] original, int[] even, int[] odd)
	{
		// fill even & odd arrays
		int e = 0;
		int o = 0;
		for (int i = 0; i < original.length; i++)
		{
			if (original[i] % 2 == 0)
			{
				even[e] = original[i];
				e++;
			}
			else if (original[i] % 2 == 1)
			{
				odd[o] = original[i];
				o++;
			}
		}
		
	}
	
	public static void display (int[] list, String nameOfArray)
	{
		System.out.println(nameOfArray);
		System.out.println("----------");
		for (int i = 0; i < list.length; i++)
		{
			System.out.printf("array[%d] = %d \t\n", i, list[i]);
		}
		System.out.printf("\n\n\n");
	}
	
	public static int[] combineTwoArrays (int[] array1, int[] array2)
	{
		// variables
		int[] combinedArrays;
		combinedArrays = new int[array1.length + array2.length];
		
		// go through each slot in combinedArrays
		for (int i = 0; i < combinedArrays.length; i++)
		{
			if (i < array1.length) // only use the first until it's over
			{
				combinedArrays[i] = array1[i];
			}
			else // once the first has been used, start using the second
			{
				combinedArrays[i] = array2[i - array1.length];
			}
		}
		
		return combinedArrays;
	}
	
	public static void descendingOrderSort (int[] array)
	{
		int swapSpot; // passage to pass the variables through as they are swapping places
		for (int i = 0; i < array.length; i++) // go through each spot to change it
		{
		    for (int j = i + 1; j < array.length; j++) // check each spot
		    {
		        if (array[j] > array[i]) // if the checked spot is bigger than the spot that's set to be changed, then swap them
		        {
		            swapSpot = array[i]; 
		            array[i] = array[j]; 
		            array[j] = swapSpot; 
		        }
		    }
		}
	}
	
	public static int[] sortedMerge (int[] array1, int[] array2)
	{
		// variables
		int[] mergedArray;
		mergedArray = new int[array1.length + array2.length];
		
		// combine the two arrays
		mergedArray = combineTwoArrays(array1, array2);
		
		// sort smallest to biggest (copy the biggest to smallest, but reverse it)
		int swapSpot;
		for (int i = 0; i < mergedArray.length; i++) 
		{
		    for (int j = i + 1; j < mergedArray.length; j++) 
		    {
		        if (mergedArray[j] < mergedArray[i]) 
		        {
		            swapSpot = mergedArray[i]; 
		            mergedArray[i] = mergedArray[j]; 
		            mergedArray[j] = swapSpot; 
		        }
		    }
		}
		
		// re-sort into descending order
		descendingOrderSort(mergedArray);
	
		return mergedArray;
	}
}
