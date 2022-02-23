/**
 * Project: Blackjack
 * File: Shuffle.java
 * Author: Ryan Mogauro
 * Date: 02/10/2022
 * Course: CS231A
 */	
public class Simulation {
	//runs 1000 games of blackjack and prints the results
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerWins = 0; 
		int dealerWins = 0; 
		int pushes = 0; 
		Blackjack game = new Blackjack(5); 
		for(int i = 0; i < 1000; i++) {
			game.reset(); 
			int result = game.game(false);
			if(result == -1) {
				dealerWins++; 
			} else if(result == 1) {
				playerWins++; 
			} else {
				pushes++; 
			}
		}
		System.out.println("Player wins: " + playerWins + "(" + (playerWins/10.0) + "%)" + "\n" + "Dealer wins: " + dealerWins + "(" + (dealerWins/10.0) + "%)" +"\n"+ "Pushes: " + pushes + "(" + (pushes/10.0) + "%)");
	}

}
