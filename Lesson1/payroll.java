import java.util.Scanner;

public class payroll {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = in.nextLine();
		
		System.out.println("Please enter your hourly rate");
		double rate = in.nextDouble();
		
		System.out.println("Please enter your hours worked");
		double hrs = in.nextDouble();
		
		double pay = rate*hrs;
		
		
		System.out.println("Name:" + name);
		System.out.println("RATE:" + rate);
		System.out.println("HOURS:" + hrs);
		System.out.println("PAY:" + pay);
	}

}

// Line break \n within strings