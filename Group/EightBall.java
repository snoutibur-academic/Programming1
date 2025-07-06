import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EightBall {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ask ya question you dingus!");
        String ans = in.nextLine();

        System.out.println("8-ball is thinking");
        for(int wait = 0; wait<=15; wait++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        } System.out.println("");
        

        int x = r.nextInt(6);

        if (x == 1) {
            System.out.println("Error: I can't think right now, try again later!");
        } else if (x == 2) {
            System.out.println("We do not have an Answer for that question");
        } else if (x == 3) {
            System.out.println("Definive no.");
        } else if (x == 4) {
            System.out.println("Possibly yes.");
        } else if (x == 5) {
            System.out.println("Don't come back, shake again and I'll explode.");
        } else if (x == 6) {
            System.out.println("Return to sender.");
        }
    }
}