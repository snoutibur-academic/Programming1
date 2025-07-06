import java.util.Scanner;

public class FahrenToCelsius {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit");
		double F = in.nextDouble();
		
		double C = (F-32)*5/9;
		
		System.out.println(C + " Celsius");
	}

}
