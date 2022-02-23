/**
 * Project: Blackjack
 * File: Shuffle.java
 * Author: Ryan Mogauro
 * Date: 02/10/2022
 * Course: CS231A
 */	
import java.util.ArrayList;
import java.util.Random;
public class Deck {
	private ArrayList<Card> deck; 
	
	//Creates a new, shufffled 52 card by calling the build and shuffle methods.
	public Deck() {
		this.deck = new ArrayList<Card>(); 
		this.build(); 
		this.shuffle();
	}
	
	//builds a deck of 52 cards, 4 each of cards with values 2-9 and 11, and 16 cards with the value 10.
	public void build() {
		for(int i = 2; i < 12; i++) {
			for(int x = 0; x < 4; x++) {
				deck.add(new Card(i)); 
			}
		}
		for(int j = 0; j < 12; j++) {
			deck.add(new Card(10));
		}
	}
	
	//returns the number of cards in the deck.
	public int size() {
		return deck.size();
	}
	
	//returns the top card (position zero) and removes it from the deck.
	public Card deal() {
		Card holder = deck.get(0); 
		deck.remove(0);
		return holder;
	}
	
	//returns the card at position i and removes it from the deck.
	public Card pick( int i) {
		Card holder = deck.get(i); 
		deck.remove(i);
		return holder;
	}
	
	//randomly shuffles the deck field
	public void shuffle() {
		Random rand = new Random(); 
		for(int i = deck.size()-1; i > -1; i--) {
			Card holder = deck.get(i); 
			Card randomCard = deck.get(rand.nextInt(deck.size())); 
			deck.set(i, randomCard);
			deck.set(deck.indexOf(randomCard), holder); 
		}
		
	}
	
	//returns a String that has the contents of the deck
	public String toString() {
		String deckToString = "deck: ";
		for(Card cards: deck) {
			deckToString += cards + " "; 
		}
		return deckToString; 
	}
	
	//tests methods to ensure they're working as intended
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck(); 
		System.out.println("Deck size: " + deck.size()); 
		System.out.println(deck); 
		deck.shuffle();
		System.out.println(deck); 
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		deck.shuffle();
		System.out.println(deck); 
		deck.shuffle();
		System.out.println(deck); 
		deck.shuffle();
		System.out.println(deck); 
	}

}
