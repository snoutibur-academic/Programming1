import java.util.Scanner;

public class prisonphonecall {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double price2 = 0;
		int time2;
		
		System.out.println("How long did'cha use le phone? (Lazy programming forces you to round to the nearest whole!)");
		int time = in.nextInt();
		
		if(time >= 2) {
			time2 = time - 2;
			price2 = time2*.5;
			price2 = price2 + 2.5;
			
		} else {
			price2 = time * 1.25;
		}
		
		
		System.out.println("The cost for this phone call is: " + price2 + ". Pay up ya dingus!");
	}
	
}
