package com.joanabarao.week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<>();
	int score; 
	String name;

	public Player(String name) {
		this.name = name; 
		this.score = 0;
	}
	
	public String describe() {
		StringBuilder playerDesc = new StringBuilder(); 
		
		playerDesc
			.append("Player's name: \n").append(name + "\n\n")
			.append("Player's hand: \n");
		
		for(Card card : hand) {
			playerDesc.append(card.describe() + "\n");
		}
		return playerDesc.toString();
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	
}
