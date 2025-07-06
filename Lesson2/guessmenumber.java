/* Last modified: 2022-09-15 */

import java.util.Scanner;

public class guessmenumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Guess me number 0 to 10");
		int x = in.nextInt();
		
		if(x==6) {
			System.out.println("Correct, you win nothing");
			
		} else {
			System.out.print("Nope! Try again");
		}
	}

}
