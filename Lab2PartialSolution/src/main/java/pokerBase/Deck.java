package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				deckCards.add(new Card(eSuit, eRank, iCardNbr++));
			}
		}
		Collections.shuffle(deckCards);
	}
	
	public Card Draw() {
		// Implemented the Draw method and GetDeckSize method
		Card FirstCard = deckCards.get(0);
		deckCards.remove(0);
		return FirstCard;
	}
	
	public int GetDeckSize() {
		return deckCards.size();
	}
	
}
