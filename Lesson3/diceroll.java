/* Last modified: 2022-09-27 */

import java.util.Random;
import java.util.Scanner;

public class diceroll {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much sides do ya want in yer 'die'?");
		int sides = in.nextInt();
		
		int dice1 = r.nextInt(sides);
		int dice2 = r.nextInt(sides);
		int rollcount = 0;
		
		while( dice1 != dice2) {
			dice1 = r.nextInt(sides);
			dice2 = r.nextInt(sides);
			rollcount = rollcount + 1;
			System.out.println("Dice 1 rolled a " + dice1 + ", Dice 2 rolled a " + dice2);
		} if(dice1 == dice2) {
			System.out.println("Both " + sides + " sided die have rolled the same number: " + dice1 +  ". It took " + rollcount+1 + " rolls.");
		}
	}

}
