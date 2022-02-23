/**
 * Project: Blackjack
 * File: Shuffle.java
 * Author: Ryan Mogauro
 * Date: 02/10/2022
 * Course: CS231A
 */	
public class Blackjack {
	private int reshuffleCut; 
	private Hand playerHand; 
	private Hand dealerHand; 
	private Deck gameDeck; 
	

	//the constructor should store the reshuffleCutoff and set up a game. You can avoid duplicate code by calling the reset() method.
	public Blackjack(int reshuffleCutoff ) {
		this.reshuffleCut = reshuffleCutoff;
		this.gameDeck = new Deck(); 
		this.reset(); 
	}
	
	//should reset the game. Both the player Hand and dealer Hand should start with no cards. If the number of cards in the deck is less than the reshuffle cutoff, then the method should create a fresh (complete), shuffled deck. Otherwise, it should not modify the deck, just clear the player and dealer hands.
	public void reset() {
		this.playerHand = new Hand(); 
		this.dealerHand = new Hand();
		if(gameDeck.size() > this.reshuffleCut) {
			this.gameDeck = new Deck(); 
		}
		
	}
	
	//should deal out two cards to both players from the Deck.
	public void deal() {
		playerHand.add(gameDeck.deal());
		dealerHand.add(gameDeck.deal());
		playerHand.add(gameDeck.deal());
		dealerHand.add(gameDeck.deal());
	}
	
	//have the player draw cards until the total value of the player's hand is equal to or above 16. The method should return false if the player goes over 21 (bust).
	public boolean playerTurn() {
		while(playerHand.getTotalValue() < 16) {
			playerHand.add(gameDeck.deal()); 
		}
		if(playerHand.getTotalValue()>21) {
			return false;
		}
		return true; 
		
	}
	
	//have the dealer draw cards until the total of the dealer's hand is equal to or above 17. The method should return false if the dealer goes over 21.
	public boolean dealerTurn() {
		while(dealerHand.getTotalValue() < 17) {
			dealerHand.add(gameDeck.deal()); 
		}
		if(dealerHand.getTotalValue()>21) {
			return false;
		}
		return true; 
	}
	
	//should assign the new cutoff value to the internal reshuffle cutoff field.
	public void setReshuffleCutoff(int cutoff) {
		this.reshuffleCut = cutoff; 
	}
	
	//returns the current value of the reshuffle cutoff field.
	public int getReshuffleCutoff() {
		return this.reshuffleCut; 
	}
	
	//returns a String that has represents the state of the game. It may be helpful to show the player and dealer hands as well as their current total value.
	public String toString() {
		return "Player hand: " +  playerHand + "\n" + "Player total: " + playerHand.getTotalValue() + "\n" + "Dealer hand: " + dealerHand + "\n" + "Dealer total:" + dealerHand.getTotalValue(); 
	}
	
	public int game(boolean verbose) {
		this.deal(); 
		if(verbose) {
			System.out.println("Initial player hand: "+ this.playerHand); 
			System.out.println("Initial dealer hand: "+ this.dealerHand); 
		}
		this.playerTurn();
		this.dealerTurn();
		int result; 
		if(verbose) {
			if(this.playerHand.getTotalValue() > 21){
				result = -1;
				System.out.println("dealer wins"); 
			} else if(this.dealerHand.getTotalValue() > 21) {
				result = 1; 
				System.out.println("player wins"); 
			} else if(this.dealerHand.getTotalValue() > this.playerHand.getTotalValue()) {
				result = -1;
				System.out.println("dealer wins"); 
			} else if(this.dealerHand.getTotalValue() < this.playerHand.getTotalValue()) {
				result = 1;
				System.out.println("player wins"); 
			
			} else {
				result = 0;
				System.out.println("push"); 
			}
			System.out.println("Final player hand: "+ this.playerHand); 
			System.out.println("Final dealer hand: "+ this.dealerHand);
			return result; 
		} else {
			if(this.playerHand.getTotalValue() > 21){
				result = -1;
			} else if(this.dealerHand.getTotalValue() > 21) {
				result = 1; 
			} else if(this.dealerHand.getTotalValue() > this.playerHand.getTotalValue()) {
				result = -1;
			} else if(this.dealerHand.getTotalValue() < this.playerHand.getTotalValue()) {
				result = 1;
			} else {
				result = 0;
			}
			return result;
		}
	}
			
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blackjack game = new Blackjack(5); 
		for(int i = 0; i < 3; i++) {
		System.out.println(game.game(true));
		game.reset();
		}
	}

}
