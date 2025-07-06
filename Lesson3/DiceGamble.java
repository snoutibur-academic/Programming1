/* Last modified: 2022-09-29 */

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DiceGamble {

    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        int highscore = 0;
        int highscoremoneyz = 0;
        while (true) {
            System.out.println(
                    "Heya! Feed yer gambling addiction, please enter how much money you want to waste! We'll roll 2 6 sided die, and if you get a 7, then I'll pay you $4, otherwise you gain nothing.");
            System.out.println("The current high score is: " + highscore + ", $" + highscoremoneyz + " was gambled.");
            int moneyz = in.nextInt();
            int rolls = 0;
            int initialmoneyz = moneyz;
            System.out.println("Alright, we'll gamble the " + moneyz + " dollars. Have fun!");

            int die1 = r.nextInt(6);
            int die2 = r.nextInt(6);

            for (rolls = 1; moneyz != 0; rolls++) {
                die1 = r.nextInt(6);
                die2 = r.nextInt(6);
                System.out.println("Die 1 rolled a " + die1 + ". Die 2 rolled a " + die2);
                if (die1 + die2 != 7) {
                    moneyz = moneyz - 1;
                    System.out.println("You lose $1, you have $" + moneyz + " left!");
                } else if (die1 + die2 == 7) {
                    moneyz = moneyz + 4;
                    System.out.println("You've rolled a 7. Enjoy your 4 dollars. You have $" + moneyz + " left.");
                }
            }
            System.out.println(
                    "----------------------------------------------------------------------------------------");
            TimeUnit.SECONDS.sleep(1);
            if (moneyz == 0) {
                System.out.println("Congratulations!!11!");
                System.out.println("It took you " + rolls + " rolls to run through your $" + initialmoneyz + ".");

                if (rolls > highscore) {
                    System.out.println("yEEEY! This is a new high score, beating the previous high score of "
                            + highscore + " by " + (rolls - highscore));

                    System.out.println("The previous high score started with $" + highscoremoneyz);
                    highscore = rolls;
                    highscoremoneyz = initialmoneyz;
                }
            }
            System.out.println(
                    "========================================================================================");
        }
    }
}
