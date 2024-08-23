/* 
 * Name: Joshua White
 * Class: CS1150
 * Due:
 * Description: Assignment #12
 * - Practice with inheritance and polymorphism by creating an animal array of different animals and displaying them 
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class WhiteJoshuaAssignment12 {
	public static void main (String[] args) throws IOException {
		//Open File For Reading
		File animalsFile = new File ("Animals.txt");
		Scanner scanAnimals = new Scanner (animalsFile);
		
		//Create Array For Animals
		Animal[] animals;
		animals = new Animal[scanAnimals.nextInt()];
		
		//Fill The Array With The Animals
		for (int i = 0; i < animals.length; i++) {
			//Get all of the aspects of the animal from the file
			String type = scanAnimals.next();
			String name = scanAnimals.next();
			String food = scanAnimals.next();
			int weight = scanAnimals.nextInt();
			int sleep = scanAnimals.nextInt();
			String location = scanAnimals.nextLine();
			
			//Create the animal
			switch(type) {
			case "Bear":
				animals[i] = new Bear(name, food, weight, sleep, location);
				break;
			case "Elephant":
				animals[i] = new Elephant(name, food, weight, sleep, location);
				break;
			case "Monkey":
				animals[i] = new Monkey(name, food, weight, sleep, location);
				break;
			case "Sloth":
				animals[i] = new Sloth(name, food, weight, sleep, location);
				break;
			}
		}
		
		//Display The Animals
		for (int i = 0; i < animals.length; i++) {
			//Display Things Based On Animal Type v
			if (animals[i] instanceof Sloth) {
				System.out.println("Animal [" + i + "] is a Sloth");
				System.out.println(animals[i].toString());
				animals[i].eat();
				animals[i].sleep();
				animals[i].swim();
				System.out.println("");
			}
			else if (animals[i] instanceof Bear) {
				System.out.println("Animal [" + i + "] is a Bear");
				System.out.println(animals[i].toString());
				animals[i].eat();
				animals[i].sleep();
				animals[i].swim();
				System.out.println("");
			}
			else if (animals[i] instanceof Elephant) {
				System.out.println("Animal [" + i + "] is an Elephant");
				System.out.println(animals[i].toString());
				animals[i].eat();
				animals[i].sleep();
				animals[i].swim();
				System.out.println("");
			}
			else if (animals[i] instanceof Monkey) {
				System.out.println("Animal [" + i + "] is a Monkey");
				System.out.println(animals[i].toString());
				animals[i].eat();
				animals[i].sleep();
				animals[i].swim();
				System.out.println("");
			}
		}
		scanAnimals.close();
		
	}//main
}//WhiteJoshuaAssignment12

class Animal {
	//Instance Variables
	private String name;
	private String food;
	private int weight;
	private int sleep;
	private String location;
	
	//Constructor
	public Animal(String name, String food, int weight, int sleep, String location) {
		this.name = name;
		this.food = food;
		this.weight = weight;
		this.sleep = sleep;
		this.location = location;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	
	public String getFood() {
		return food;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getSleep() {
		return sleep;
	}
	
	public String getLocation() {
		return location;
	}
	
	//Other
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping - do not disturb");
	}
	
	public void swim() {
		System.out.println("Animal is swimming");
	}
}

class Bear extends Animal {
	
	//Constructor
	public Bear (String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
	
	//Other
	@Override
	public void eat() {
		System.out.println("Bear is eating " + getFood());
	}
	
	@Override
	public void sleep() {
		System.out.println("Bear is sleeping " + getSleep() + " hours");
	}
	
	@Override
	public void swim() {
		System.out.println("Bear is swimming");
	}
	
	@Override
	public String toString() {
		return "Bear: Name: " + getName() + " - Weighs: " + getWeight() + " lbs - Sleeps: " + getSleep() + " hours - Location: " + getLocation();
	}
	
}

class Elephant extends Animal {
	
	//Constructor
	public Elephant(String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
	
	//Other
	@Override
	public void sleep() {
		System.out.println("Elephant is sleeping " + getSleep() + " hours");
	}
	
	@Override
	public String toString() {
		return "Elephant: Name: " + getName() + " - Weighs: " + getWeight() +
		" lbs - Sleeps: " + getSleep() + " hours - Location: " + getLocation();
	}
}

class Monkey extends Animal {
	
	//Constructor
	public Monkey(String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
	
	@Override
	public void eat() {
		System.out.println("Monkey is eating " + getFood());
	}
	
	@Override
	public void swim() {
		System.out.println("Monkey is swimming");
	}
	
	@Override
	public String toString() {
		return "Monkey: Name: " + getName() + " - Weighs: " + getWeight() + " lbs - Sleeps: " + getSleep() + " hours - Location: " + getLocation();
	}
}

class Sloth extends Animal {
	
	//Constructor
	public Sloth(String name, String food, int weight, int sleep, String location) {
		super(name, food, weight, sleep, location);
	}
	
	@Override
	public String toString() {
		return "Sloth: Name: " + getName() + " - Weighs: " + getWeight() + " lbs - Sleeps: " + getSleep() + " hours - Location: " + getLocation();
	}
}