package week06FinalProject;

public class Card { //card class which represents a standard playing card (written in Pascal case)
	
	//Creating the fields
	private String name; //private access modifier, meaning it can only be accessed within the class itself
	private String suit; //getters and setters are needed with a private access modifier
	private int value;
	
	
	public Card() {}; //this is added so the default Java constructor Deck() can be used in the main class, if needed
	
	public Card(String name, String suit, int value) { //adding this so it's reusable and so we don't have to create it in the main
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	//Methods
	public void Describe() {
		System.out.println("- " + name + " of " + suit + " (Card Value: " + value + ")");
	}
	
	@Override //overriding so the cards print normally. Otherwise, you get gibberish
	public String toString() {
		return name + " of " + suit + " (Value: " + value + ")"; 
	}
	
	
	//Creating getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	
	

} //end of class
