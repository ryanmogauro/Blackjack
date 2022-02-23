/**
 * Project: Blackjack
 * File: Shuffle.java
 * Author: Ryan Mogauro
 * Date: 02/10/2022
 * Course: CS231A
 */	
import java.util.ArrayList;
import java.util.Random;
public class Hand {
	private ArrayList<Card> hand; 

	//initialize the ArrayList.
	public Hand() {
	this.hand = new ArrayList<Card>();
	}
	
	//reset the hand to empty.
	public void reset() {
		hand.clear();
	}
	
	//add the card object to the hand.
	public void add( Card card ) {
		hand.add(card); 
	}
	
	//returns the number of cards in the hand.
	public int size() {
		return this.hand.size();
	}
	
	//returns the card with index i. Cast as appropriate.
	public Card getCard( int i ) {
		return hand.get(i);
	}
	
	//returns the sum of the values of the cards in the hand.
	public int getTotalValue() {
		int sum = 0; 
		for(Card card: hand) {
			sum+=card.getValue(); 
		}
		return sum; 
	}
	
	//returns a String that has the contents of the hand presented in a nice format. Use the Card toString method (implicitly or explicitly) to accomplish this.
	public String toString() {
		String handToString = ""; 
		for(Card card: hand) {
			handToString += card.getValue() + " "; 
		}
		return handToString; 
	}
	
	//tests methods to ensure they're working as intended
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hand hand = new Hand(); 
		Card one = new Card(2); 
		Card two = new Card(2); 
		Card three = new Card(3); 
		Card four = new Card(4); 
		Card eleven = new Card(11); 
		Card ten = new Card(10); 
		hand.add(one);
		hand.add(two);
		hand.add(three);
		hand.add(four);
		hand.add(eleven);
		hand.add(ten);
		System.out.println("current size: " + hand.size());
		System.out.println("testing getCard method, should be 2: " + hand.getCard(0));
		System.out.println("testing getTotalValue method, should be 32: " + hand.getTotalValue()); 
		System.out.println(hand);
		hand.reset(); 
		System.out.print("size should be 0: " + hand.size());
		
		
		
		
	}

}
