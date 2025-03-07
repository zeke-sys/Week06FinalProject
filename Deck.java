package week06FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck { //Deck class containing List of card field called cards
	
	//fields
	private List<Card> cards;
	
	//constructor
	public Deck() {
		cards = new ArrayList<>();
		
		String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		for (int i = 0; i < names.length; i++) {
			for (String suit: suits) {
				cards.add(new Card(names[i], suit, values[i]));
			}
		} //end of for loop
	} //end of constructor
	
	
	
	//Deck Shuffle method which randomizes the order of the cards
	//Collections contains static methods that operate on or return collections. Provided by Java.
	public void shuffle() {
		Collections.shuffle(cards); //randomly permutes the specified list using a default source of randomness
	}
	
	//Draw method to draw one card of the top of the deck
	public Card drawCard() {
		return cards.isEmpty() ? null : cards.remove(0); //if the cards list contains cards, remove the first card (position 0)
	}
	
	//Describe method helps bypass the use of card.getValue() and card.getName() to print the cards
	//This makes for a cleaner and more reusable code
	//toString() was added to the Card class to help the bypass
	public void Describe() {
		System.out.println("\nThis deck has 52 cards, as follows:\n");
		for (Card card: cards) {
			System.out.println(card);
		}
	}
	
	
	
	

} //end of class
