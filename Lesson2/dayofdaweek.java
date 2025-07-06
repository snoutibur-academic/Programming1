/* Last modified: 2022-09-13 */

import java.util.Scanner;

public class dayofdaweek {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter the day of the week, 1 to 7");
		 int input = in.nextInt();
		 String day = "if this shows up, something went wrong";
		 
		 if(input == 1) {
			 day = "Sunday";
			 System.out.println("Day " + input + " of the week is: " + day);
		 } else if(input == 2) {
			 day = "Monday";
			 System.out.println("Day " + input + " of the week is: " + day);
		 } else if(input == 3) {
			 day = "Tuesday";
			 System.out.println("Day " + input + " of the week is: " + day);
		 } else if(input == 4) {
			 day = "Wednsday";
			 System.out.println("Day " + input + " of the week is: " + day);
		 } else if(input == 5) {
			 day = "Thursday";
			 System.out.println("Day " + input + " of the week is: " + day);
		 } else if(input == 6) {
			 day = "Friday";
			 System.out.println("Day " + input + " of the week is: " + day);
		 } else if(input == 7) {
			 day = "Saturday";
			 System.out.println("Day " + input + " of the week is: " + day);
		 } else if(input < 1) {
			 System.out.println("The inputted value, " + input + " ain't valid!");
		 } else if(input > 1) {
			 System.out.println("The inputted value, " + input + " ain't valid!");
	}

	}
}
