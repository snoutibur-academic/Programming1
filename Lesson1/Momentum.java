/* Last modified: 2022-08-27 */

import java.util.Scanner;

public class Momentum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the mass:");
		float mass = in.nextFloat();
		
		System.out.println("Enter the velocity:");
		float velocity = in.nextFloat();
		
		float momentum = mass*velocity;
		
		System.out.println("Momentum: " + momentum);
		
	}
	
}
