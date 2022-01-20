package com.joanabarao.week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	
	static List<Card> cards = new ArrayList<>();
	
	private static int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	
	private static String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
	
	public Deck() {
		for(int value = 0; value <= values.length; value++) {
			for(String suit : suits) {
				cards.add(new Card(value, suit));
				
			}
			
		}
	}
	
	public static void shuffle() {
		Collections.shuffle(cards, new Random());
	}
	
	public Card draw() {
		return cards.remove(0);
	}

}
