/**
 * Project: Blackjack
 * File: Shuffle.java
 * Author: Ryan Mogauro
 * Date: 02/07/2022
 * Course: CS231A
 */	
import java.util.ArrayList;
import java.util.Random;
public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i = 1; i < 11; i++) {
			numbers.add(i);
		}
		
		for(int nums: numbers) {
			System.out.println(nums);
		}
		
		for(int i = numbers.size(); i > 0; i--) {
			int remove = rand.nextInt(i); 
			System.out.println("removing " + numbers.get(remove) + " from ArrayList");
			numbers.remove(remove);
		}
		
		//design for shuffle
		ArrayList<Integer> nums = new ArrayList<Integer>(); 
		ArrayList<Integer> shuffledNums = new ArrayList<Integer>(); 
		for(int i = 1; i < 11; i++) {
			nums.add(i); 
		}
		
		for(int i = nums.size(); i > 0; i--){
			int randomNum = nums.get(rand.nextInt(i)); 
			shuffledNums.add(randomNum);
			nums.remove(nums.indexOf(randomNum)); 
			
		}
		
		for(int num: shuffledNums) {
			System.out.println(num);
		}
		
		System.out.println("the size of the list is " + shuffledNums.size());
		
		
		
		
		
		
	}

}
