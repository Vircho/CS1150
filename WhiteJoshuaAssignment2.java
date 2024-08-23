import java.util.Scanner;
public class WhiteJoshuaAssignment2 
{
	public static void main(String[] args)
	{
		// set up constants
		final double WATTS_PER_KILOWATT = 1000;
		final double COST_PER_KWH = 0.15;
		final int DAYS_PER_MONTH = 30;
		
		// set up other variables
		String applianceOneName;
		String applianceTwoName;
		int applianceOneWatts;
		int applianceTwoWatts;
		int applianceOneHours;
		int applianceTwoHours;
		double wattHoursPerDay1;
		double kWhPerDay1;
		double kWhPerMonth1;
		double costPerMonth1;
		double wattHoursPerDay2;
		double kWhPerDay2;
		double kWhPerMonth2;
		double costPerMonth2;
		double totalKwhPerDay;
		double totalKwhPerMonth;
		double totalCostPerMonth;
		
		
		// prompt user and scan in info for first appliance name
		System.out.println("Welcome! This program will tell you your electricity costs after you provide some information.");
		System.out.println("Firstly, please put in the name of your first appliance.");
		Scanner applianceInfo = new Scanner (System.in);
		applianceOneName = applianceInfo.nextLine();
		
		// prompt user and scan in info for first appliance wattage
		System.out.println("Great! Now please put in how many watts " + applianceOneName + " uses.");
		applianceOneWatts = applianceInfo.nextInt();
		
		//prompt user and scan in info for first appliance hours
		System.out.println("Great! Now please put in how many hours you use " + applianceOneName + " per day.");
		applianceOneHours = applianceInfo.nextInt();
		applianceInfo.nextLine();
		
		// prompt user for all info regarding the second appliance, going faster since they know what to expect now
		System.out.println("Next, please provide the information for your second appliance.");
		System.out.println("What is it's name?");
		applianceTwoName = applianceInfo.nextLine();
		System.out.println("How many watts does " + applianceTwoName + " use?");
		applianceTwoWatts = applianceInfo.nextInt();
		System.out.println("How many hours do you use " + applianceTwoName + " per day?");
		applianceTwoHours = applianceInfo.nextInt();
		applianceInfo.close();
		
		// calculate necessary information
		// Watt Hours Per Day:
		wattHoursPerDay1 = (applianceOneWatts * applianceOneHours);
		wattHoursPerDay2 = (applianceTwoWatts * applianceTwoHours);
		
		// Kilowatt Hours Per Day:
		kWhPerDay1 = (wattHoursPerDay1 / WATTS_PER_KILOWATT);
		kWhPerDay2 = (wattHoursPerDay2 / WATTS_PER_KILOWATT);
		
		// Kilowatt Hours Per Month:
		kWhPerMonth1 = (kWhPerDay1 * DAYS_PER_MONTH);
		kWhPerMonth2 = (kWhPerDay2 * DAYS_PER_MONTH);
		
		// Cost Per Month:
		costPerMonth1 = (kWhPerMonth1 * COST_PER_KWH);
		costPerMonth2 = (kWhPerMonth2 * COST_PER_KWH);
		
		// Total Kilowatt Hours Per Day:
		totalKwhPerDay = (kWhPerDay1 + kWhPerDay2);
		
		// Total Kilowatt Hours Per Month:
		totalKwhPerMonth = (kWhPerMonth1 + kWhPerMonth2);
		
		// Total Cost Per Month:
		totalCostPerMonth = (costPerMonth1 + costPerMonth2);
		
		//Display all of the information to the user
		System.out.print("------------------------------------------------------");
		System.out.print("\n");
		System.out.print("Name -> kWh Per Day -> kWH Per Month -> Cost Per Month");
		System.out.print("\n");
		System.out.print("------------------------------------------------------");
		System.out.print("\n");
		System.out.print(applianceOneName);
		System.out.print(": ");
		System.out.printf("%.2f", kWhPerDay1);
		System.out.print("	");
		System.out.printf("%.2f", kWhPerMonth1);
		System.out.print("	$");
		System.out.printf("%.2f", costPerMonth1);
		System.out.printf("\n");
		System.out.print(applianceTwoName);
		System.out.print(": ");
		System.out.printf("%.2f", kWhPerDay2);
		System.out.print("	");
		System.out.printf("%.2f", kWhPerMonth2);
		System.out.print("	$");
		System.out.printf("%.2f", costPerMonth2);
		System.out.printf("\n");
		System.out.print("Totals: ");
		System.out.printf("%.2f", totalKwhPerDay);
		System.out.print("	");
		System.out.printf("%.2f", totalKwhPerMonth);
		System.out.print("	$");
		System.out.printf("%.2f", totalCostPerMonth);
		System.out.printf("\n");		
	}
}
/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Feb 01, 2023
 * Description: Assignment #2 
 * - Practice scanning user info and using variables
 */