import java.util.Random;
import java.util.Scanner;

public class HiLowLimited2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int range = 100;
		boolean win = false;
		System.out.println("Heya! Guess the number, 0 to " + range + "in 10 tries or less!");
		int x = r.nextInt(range);
		
			for(int tries =1; tries<=10 && win == false; tries++) {
				System.out.println("Try #" + tries);
				int guess = in.nextInt();
				
				if(guess > x) {
					System.out.println("Ya guess is too high!");
				} else if(guess<x) {
					System.out.println("Ya guess is too low!");
				}
				
				if(tries >= 10) {
					System.out.println("Congratulations, you consumed all of ya tries! You've lose");
					} 
				if(guess == x) {
					System.out.println("You guessed the number in " + tries + " tries");
					win = true;
				}
			}
		}
	}