/* Last modified: 2022-09-13 */

import java.util.Random;
import java.util.Scanner;

public class hilowsingle {

	public static void main(String[] args) {
		
		Random r = new Random();
		int x = r.nextInt(10);
		Scanner in = new Scanner(System.in);
		
		int guesscount = 0;
		
		System.out.println("Heya! Guess ze number! 1 to 10");
		int guess = in.nextInt();
		
		if(guess > x) {
			System.out.println("Yer guess is too high!");
			guesscount = guesscount+1;
		} if(guess < x) {
			System.out.println("Yer guess is too low!");
			guesscount = guesscount+1;
		}
		
		if(guess == x) {
			System.out.println("ayy! you got the right number in " + guesscount + "guesses!");
		}
		
	}

}
