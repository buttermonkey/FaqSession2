package org.campus02.faq2.enums;

public class Card {
	private final Suit suit;
	private final Face face;

	public Card(Suit suit, Face face) {
		this.suit = suit;
		this.face = face;
	}

	@Override
	public String toString() {
		return face + " of " + suit;
	}
}
