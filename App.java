package week06FinalProject;

public class App {

	public static void main(String[] args) {
		
		//instantiating a deck and two players
		Deck deck = new Deck();
		
		//deck.Describe(); //printing out the deck
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		//calling the shuffle method on the deck
		deck.shuffle();
		
		//distribute cards to both players
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck); //Player 1 draws a card
			} else {
				player2.draw(deck); //Player 2 draws a card
			}
		}
		
		//To play the game - each player flips a card and compares
		for (int j = 0; j < 26; j++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1 != null && card2 != null) {
				System.out.println("Round " + (j + 1) + ":");
				card1.Describe(); //shows Player 1's card
				card2.Describe(); //shows Player 2's card
				
				//compare card values and award points
				if (card1.getValue() > card2.getValue()) {
					player1.incrementScore();
					System.out.println("Player 1 wins this round!\n");
				} else if (card1.getValue() < card2.getValue()) {
					player2.incrementScore();
					System.out.println("Player 2 wins this round.\n");
				} else {
					System.out.println("It's a tie! No points awarded.\n");
				}
			} //end of if statements	
			
			//pause for two seconds between each round
			try {
				Thread.sleep(2000); //A thread is a thread of execution in a program. For this, the for loop is the thread.
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
			
		} //end of for loop
		
		
		//Printing final scores
		System.out.println("-------------");
		System.out.println("Final Scores:");
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());
		
		//Determining and printing the winner
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins the game!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins the game!");
		} else {
			System.out.println("It's a draw! Play again.");
		} //end of if statements 
		
		

	} //end of main

} //end of class
