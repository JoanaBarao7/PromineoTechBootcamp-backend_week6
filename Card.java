package com.joanabarao.week6;

public class Card {
	
	private int value;
	private String suit;
	private String name;
	
	public Card(int value, String suit) {
		this.setValue(value);
		this.setSuit(suit);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String describe() {
		return "The card is " + value + " of " + suit + "." ; 
	}
	

}
