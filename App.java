package com.joanabarao.week6;

public class App {
	
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player player1 = new Player("Computer");
		Player player2 = new Player("Joana");
		
		Deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if (i % 2 ==  0) { 
				player1.draw(deck); } 		
			else { 
				player2.draw(deck); }
		}	
		
		for(int j = 0; j < 26; j++) {
			int p1 = player1.flip().getValue();			
			int p2 = player2.flip().getValue();
			
			if (p1 > p2) {
				player1.incrementScore();
				System.out.println("Computer wins the round!");
			} else if (p1 < p2){
				player2.incrementScore();
				System.out.println("Joana wins the round!");
			} else {
				System.out.println("It\'s a tie!");
			}
		}
		
		if (player1.score > player2.score) {
			System.out.println("Computer is the winner of the game with a final score of " + player1.score + " to " + player2.score + "!!");
		} else if (player2.score > player1.score){
			System.out.println("Joana is the winner of the game with a final score of " + player2.score + " to " + player1.score + "!!");
		} else {
			System.out.println("The game ended in a draw with the final score: " + player1.score + " to " + player2.score + "!!");
		}
		
					
	}
}
