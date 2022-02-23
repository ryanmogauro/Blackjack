/**
 * Project: Blackjack
 * File: Shuffle.java
 * Author: Ryan Mogauro
 * Date: 02/10/2022
 * Course: CS231A
 */	
public class Card {
	public int value;

	//a constructor with the value of the card
	//ensures v is a valid value (2-11)
	public Card(int v) {
		if(v > 1 && v < 12) {
			this.value = v; 
		} else if (v > 12) {
			System.out.println("value is too big");
		} else if (v < 2) {
			System.out.println("value is too small");
		}
	}
	
	//return the numeric value of the card.
	public int getValue() {
		return this.value;
	}
	
	//return a string that represents the Card object
	public String toString() {
		return this.value + ""; 
	}

	//tests methods to ensure they're working as intended
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card one = new Card(1); 
		System.out.println("testing getValue method: " + one.getValue());
		System.out.println("testing toString method: " + (one)); 
		Card seven = new Card(7); 
		System.out.println(); 
		System.out.println("testing getValue method: " + seven.getValue());
		System.out.println("testing toString method: " + (seven));
		Card fifteen = new Card(27); 
		Card zero = new Card(0); 
	}

}
