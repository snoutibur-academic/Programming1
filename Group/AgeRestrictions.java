/* Last modified: 2022-10-11 */

import java.util.Scanner;

public class AgeRestrictions {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("How old are ya?");

        while(!in.hasNextDouble()) {
            System.out.println("That's not a number!");
            in.nextLine();
        }

        Double age = in.nextDouble();
        if(age < 13) {
            System.out.println("You can't be on *some* social media!");
        }
        if(age < 16) {
            System.out.println("You can't drive! (unless you have a permit, in which you'll have to be 15)");
            System.out.println("");
        }
        
        if(age < 18) {
            System.out.println("You can't drink!");
            System.out.println("You can't gamble!");
        }
        if(age < 25) {
            System.out.println("You can't rent a car!");
            
            
        }
        if(age >= 25) {
            System.out.println("You can now do pretty much anything that's legal.");
        }
        if(age >=35) {
            System.out.println("You can now run for president!");
        }

    }
}