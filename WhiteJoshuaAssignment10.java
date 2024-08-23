/* 
 * Name: Joshua White
 * Class: CS1150
 * Due: Apr 12, 2023
 * Description: Assignment #10
 * - Practice using different classes to make a turtle hospital filled with turtles
 */
public class WhiteJoshuaAssignment10 {
	public static void main (String[] args) {
		
		// Begin part 1
		System.out.println("********************************************");
		System.out.println("Part 1: Turtles In Array in Main");
		System.out.println("********************************************");
		
		// Give life to our beautiful turtles
		Turtle turtle1 = new Turtle("Hawksbill", 42, "Rose");
		Turtle turtle2 = new Turtle("Leatherback", 30, "Donna");
		Turtle turtle3 = new Turtle("Loggerhead", 62, "Pancake");
		Turtle turtle4 = new Turtle("Greenturtle", 39, "Olive");
		Turtle turtle5 = new Turtle("Loggerhead", 75, "Poptart");
		Turtle turtle6 = new Turtle("Hawksbill", 33, "Miss Piggy");
		Turtle turtle7 = new Turtle("Leatherback", 14, "B StreiSAND");
		
		// Create a space for our turtles to live
		Turtle[] turtles;
		turtles = new Turtle[7];
		
		// Bring our turtles to their space
		turtles[0] = turtle1;
		turtles[1] = turtle2;
		turtles[2] = turtle3;
		turtles[3] = turtle4;
		turtles[4] = turtle5;
		turtles[5] = turtle6;
		turtles[6] = turtle7;
		
		// Show the world our wonderful turtles
		System.out.println("--------------------------------------------");
		System.out.println("Turtle  	Age	Name");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < turtles.length; i++) {
			System.out.printf("%s \t %d \t %s \n", turtles[i].getType(), turtles[i].getAge(), turtles[i].getName());
		}
		
		// Which one has blessed this world the longest?
		Turtle oldestTurt = turtles[0];
		for (int i = 0; i < turtles.length; i++) {
			if (turtles[i].getAge() > oldestTurt.getAge()) {
				oldestTurt = new Turtle(turtles[i].getType(), turtles[i].getAge(), turtles[i].getName());
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("Oldest turtle in the array of turtles");
		System.out.println("--------------------------------------------");
		
		System.out.println("Type: " + oldestTurt.getType());
		System.out.println("Age: " + oldestTurt.getAge() + " years");
		System.out.println("Name: " + oldestTurt.getName());
		
		// Start part 2
		System.out.println("********************************************");
		System.out.println("Part 2: Turtles In Turtle Hospital");
		System.out.println("********************************************");
		
		// Create Turtle Hosptial
		TurtleHospital turtleHospital = new TurtleHospital ("ShealthCare", 9);
		
		// Add Our Turts To The Hospital
		for (int i = 0; i < turtles.length; i++) {
			boolean isFull = turtleHospital.addTurt(turtles[i]);
			System.out.println("Was " + turtles[i].getName() + " added to the hospital? " + !isFull);
		}
		
		// Create 3 Siblings For Our Turtles To Play With
		Turtle[] turtleSiblings;
		turtleSiblings = new Turtle[3];
		Turtle turtle8 = new Turtle("Greenturtle", 150, "Crush");
		Turtle turtle9 = new Turtle("Leatherback", 18, "Myrtle");
		Turtle turtle10 = new Turtle("Hawksbill", 44, "Coco");
		turtleSiblings[0] = turtle8;
		turtleSiblings[1] = turtle9;
		turtleSiblings[2] = turtle10;
		
		// Bring The New Turts To The Hospital
		for (int i = 0; i < turtleSiblings.length; i++) {
			boolean isFull = turtleHospital.addTurt(turtleSiblings[i]);
			System.out.println("Was " + turtleSiblings[i].getName() + " added to the hospital? " + !isFull);
		}
		
		// Present To The World Our Beautiful Decade Of Turts
		System.out.println("--------------------------------------------");
		System.out.println("Turtle  	Age	Name");
		System.out.println("--------------------------------------------");
		turtleHospital.displayTurtles();
		
		// Which Turtle In The Hospital Is Oldest?
		Turtle newOldestTurt = turtleHospital.findOldestTurtle();
		
		System.out.println("--------------------------------------------");
		System.out.println("Oldest turtle in turtle hospital");
		System.out.println("--------------------------------------------");
		System.out.println("Turtle Hospital: " + turtleHospital.getName());
		System.out.println("Type: " + newOldestTurt.getType());
		System.out.println("Age: " + newOldestTurt.getAge() + " years");
		System.out.println("Name: " + newOldestTurt.getName());
	}
}

class Turtle {
	private String type;
	private int age;
	private String name;
	
	public Turtle(String type, int age, String name) {
		this.type = type;
		this.age = age;
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

class TurtleHospital {
	private String name;
	private int max;
	private Turtle[] turtles;
	private int turtsInHospital;
	
	public TurtleHospital(String name, int max) {
		this.name = name;
		this.max = max;
		turtles = new Turtle[max];
		turtsInHospital = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addTurt(Turtle nextTurtle) {
		boolean isFull = false;
		
		if (turtsInHospital >= max) {
			isFull = true;
		}
		else {
			turtles[turtsInHospital] = nextTurtle;
			turtsInHospital++;
		}
		
		return isFull;
	}
	
	public void displayTurtles() {
		for (int i = 0; i < turtles.length; i++) {
			System.out.printf("%s \t %d \t %s \n", turtles[i].getType(), turtles[i].getAge(), turtles[i].getName());
		}
	}
	
	public Turtle findOldestTurtle() {
		Turtle oldestTurt = turtles[0];
		for (int i = 0; i < turtles.length; i++) {
			if (turtles[i].getAge() > oldestTurt.getAge()) {
				oldestTurt = new Turtle(turtles[i].getType(), turtles[i].getAge(), turtles[i].getName());
			}
		}
		return oldestTurt;
	}
}