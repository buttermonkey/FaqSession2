package org.campus02.faq2.enums;

import java.util.Collections;
import java.util.Stack;

public class Deck {
	private final Stack<Card> cards = new Stack<>();

	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Face face : Face.values()) {
				cards.push(new Card(suit, face));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card drawCard() {
		if (cards.empty())
			return null;
		return cards.pop();
	}
}
