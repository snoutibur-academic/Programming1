import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        
        int total = 0;
        int[] numbers = new int[100];
        for(int i = 0; i < 100; i++) {
            numbers[i] = r.nextInt(21);
        }

        System.out.print("'ere's the array: ");
        for(int i = 0; i<100; i++ ) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("");
        System.out.println("Wat number would you like to count?");
        int countNum = in.nextInt();

        for(int i = 0; i<100; i++) {
            if(numbers[i] == countNum) {
                total = total +1;
            }
        }
        System.out.println(countNum + " is in the array " + total + " times.");
    }
}