package io.robusta.hand.solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

import io.robusta.hand.Card;
import io.robusta.hand.CardColor;
import io.robusta.hand.interfaces.IDeck;

public class Deck extends LinkedList<Card> implements IDeck{

	
	private static final long serialVersionUID = -4686285366508321800L;
	
	public Deck() {

	}
	
	@Override
	public Card pick() {
		Collections.shuffle(this);
		return this.pollFirst();
		// shuffle;
		// remove card from deck and returns it
	}


	@Override
	public TreeSet<Card> pick(int number) {
		
		int i = 0;
		TreeSet<Card> cards = new TreeSet<>();
		while ( i < number ){
			cards.add(this.pick());
			i++;
			}
		// reuse pick()
		return cards;
	}
	

	@Override
	public Hand giveHand() {
		Hand hands = new Hand();	
		hands.addAll(this.pick(5));
		// A hand is a **5** card TreeSet
		return hands;
	}
	
	
	
}
