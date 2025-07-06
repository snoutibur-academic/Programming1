import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) throws Exception {
        // Write a program that flips heads or tails. Let the user hit enter to flip again, and keep track of the percentage that heads has been flipped.
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int heads = 1;
        int tails = 1;
        double total;
        double math;
        double percentage;
        System.out.println("Flip a coin! Press enter to flip.");

        while(true) {
            String enter = in.nextLine();
            int flip = r.nextInt(2) + 1;

            if(flip == 1) {
                System.out.println("You flipped a tail!");
                tails = tails + 1;
            } else if(flip == 2) {
                System.out.println("You flipped a head!");
                heads = heads +1;
            }
            total = heads + tails;
            math = heads/total;
            percentage = math*100;

            System.out.println(percentage + "% is heads!");
        }
    }
}
