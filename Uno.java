import java.util.Stack;

public class Uno {
	
	//Constants
	static final int CARD_COUNT = 108;
	static final int NUMBERED_PER_COLOR = 19;
	static final int SPECIAL_PER_COLOR = 3;
	static final int WILDS = 8;
	
	public static void main(String[] args) {
		
		//Create main deck
		Deck centerDeck = new Deck(CARD_COUNT);
		fillDeck(centerDeck);
		
	}
	
	public static void fillDeck(Deck deck) {
		
		int reds = 0;
		int greens = 0;
		int blues = 0;
		int yellows = 0;
		int blacks = 0;
		
		for (int i = 0; i < CARD_COUNT; i++) {
			
			
		}
	}
}

class Deck {
	
	//Private Variables
	private int size;
	private Stack<Card> deck;
	
	//Constructor
	public Deck(int size) {
		this.size = size;
	}
	
	//Getters
	public int getSize() {
		return size;
	}
	
	public Card getTop() {
		return deck.peek();
	}
	
	//addCard - adds a card to the top of the deck
	public void addCard(Card card) {
		this.deck.add(card);
	}
}

class Card {
	
	//Private Varibles
	private char color;
	private int number;
	
	//Constructor (special cards have special numbers: 11 for skips, 22 for reverse, 33 for draw 2)
	//Also, if color == W (wild), the number corresponds to the type of wild. (0 for wild, 1 for draw 4)
	public Card(char color, int number) {
		this.color = color;
		this.number = number;
	}
}