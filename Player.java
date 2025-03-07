package week06FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//fields
	private List<Card> hand;
	private int score;
	private String name;
	
	//Constructor
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
	
	
	
	//methods	
	//Describes the player and their hand
	public void Describe() {
		System.out.println("Player: " + name + " | Score: " + score);
		for (Card card : hand) { //calls out the describe method for each card in the hand list
			card.Describe();
		}	
	}
	
	//Removes and returns the top card of the hand
	public Card flip() {
		if (!hand.isEmpty()) { //if the hand contains cards
			return hand.remove(0);
		}
		return null;
	}
	
	//Takes a deck as an argument. Draws a card from the deck and adds it to the player's hand
	public void draw(Deck deck) {
		Card drawnCard = deck.drawCard();
		if (drawnCard != null) { //making sure there is a card
			hand.add(drawnCard);
		}
	}
	
	//Increments the player's score
	public void incrementScore() {
		score++;
	}
	
	//getter for score
	public int getScore() {
		return score;
	}
	
	
	

} //end of class
