/* Last modified: 2022-10-07 */

import java.util.Scanner;

public class PayrollTrapped {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
		
		System.out.println("Gimme yer name");
		String name = in.nextLine();
		
		System.out.println("Please enter your hourly rate");
        while(!in.hasNextDouble()) {
            System.out.println("That ain't a valid hourly rate! Go again:");
            in.nextLine();
        }

        double rate = in.nextDouble();
		
		System.out.println("How long 'cha worked?");
        while(!in.hasNextDouble()) {
            System.out.println("That ain't a valid time! Go again:");
            in.nextLine();
        }
		double hrs = in.nextDouble();
		
		double pay = rate*hrs;
		
		
		System.out.println("Name: " + name);
		System.out.println("Rate: " + rate);
		System.out.println("Hrs: " + hrs);
		System.out.println("Pay: " + pay);
    }
}
