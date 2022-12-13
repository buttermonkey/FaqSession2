package org.campus02.faq2.enums;

public class CardGame {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.drawCard());
		}
		System.out.println();
		System.out.println(new Card(Suit.Spades, Face.Ace));
	}
}
