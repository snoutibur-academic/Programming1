import java.util.Scanner;

public class DaysToMin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of days:");
		int days = in.nextInt();
		
		int minutesinaday = 1440;
		int minutes = days*minutesinaday;
				
		System.out.println(minutes);

	}

}
