import java.util.Scanner;

public class pseudocodenifelseprac {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 1
		System.out.println("assignment 1");
		// Ask for length and width
		// Store input in variables
		System.out.println("What's the length?");
		double length = in.nextDouble();
		System.out.println("What's the width?");
		double width = in.nextDouble();
		
		// Check if length = width
		// if they're same, say square, if not, say rectangle
		if(length==width) {
			System.out.println("This rectangle is a square!");
		} else {
			System.out.println("This is a rectangle, and not a square");
		}
		
		// 2
		System.out.println("assignment 2");
		// Ask the user for 2 integers
		// Store the 2 integer in 2 variables
		System.out.println("What's the first integer");
		int inte1 = in.nextInt();
		System.out.println("What's the second integer?");
		int inte2 = in.nextInt();
		// Check if x > y, if so, then say x is greater than y
		// Else, say Y is greater than X
		if(inte1>inte2) {
			System.out.println("The first integer is larger");
		} else {
			System.out.println("The second integer is larger");
		}
		
		
		// 3
		System.out.println("assignment 3");
		// Ask user for an integer
		System.out.println("Enter a integer");
		int int31 = in.nextInt();
		// Check if the value is equal to 0, if so, say it's 0
		// Check if the value is greater than 0, say it's positive
		// Check if the value is less than 0, say it's negative
		if(int31 == 0) {
			System.out.println("The inputted value is 0");
		} else {
			if(int31 > 0) {
				System.out.println("The inputted value is a positive");
			} else {
				if(int31 < 0) {
					System.out.println("The inputted value is a negative");
				}
			}
		}
		
		// 4
		System.out.println("assignment 4");
		// Ask user for the number of days they were absent
		System.out.println("How much days did'cha miss?");
		int absences = in.nextInt();
		// Check if that integer is greater than 6, if so, then tell the user they've got a U, if it's less, then say they're fiine.
		if(absences > 6) {
			System.out.println("Congrats, you got a U!");
		} else {
			System.out.println("Wowww, you don't have a U.");
		}
		
		// 5
		System.out.println("assignment 5");
		//Ask for an integer, and store the user's input
		System.out.println("Enter a integer.");
		int evnordd = in.nextInt();
		
		// Check if the number is even or odd, then answer the question.
		if( ( evnordd & 1) == 0 ) {
			System.out.println("That's a even number!");
	} else {
		System.out.println("That's a odd number");
	}

	// Additional
	// 1
	// Ask the questions, with answers 1, 2, or 3
	int score = 0;
	System.out.println("Question 1: What's the most useless");
	System.out.println("1: Computer");
	System.out.println("2: This question");
	System.out.println("3: Dirt");
	System.out.println("Enter your answer (1, 2, or 3)");
	// Store the number the user enters
	int q1 = in.nextInt();
	
	if(q1 == 2) {
		score = score + 1;
	}
	
	System.out.println("Question 2: What's the first 13 of pi");
	double q2 = in.nextDouble();
	
	if(q2 == 3.141592653589) {
		score = score + 1;
	}
	
	System.out.println("Question 3: What's minimum wage of Japan?");
	double q3 = in.nextDouble();
	
	if(q3 == 7.30) {
		score = score + 1;
	}
	
	System.out.println("You've finished the quiz. You score is....");
	System.out.println(score + " out of 3");
	
	
	// Once all questions have been answered, compare the inputed values to the correct answer, if the answer is correct, add 1 to the score, if it's not right, do nothing
	// Print the score out of 3
	
	// 3 (This one seems infefficient)
	// List the choices, ask the user for an input 1 to 4.
	// Ask the see for their weight, specifically in kg. This will be the kg variable.
	// If the user chose planet1, let's say Mars, plug in their weight to the formula 6.39*10^23(kg)
	// If the user chose planet 2, aka Venus, plug their weight into the formula 4.867 × 10^24 kg
	// If the user chose planet 3, aka, well, not a planet, but the sun, plug their weight into 1.989 × 10^30 kg
	// If the user chose planet 4, aka Jupiter, plug their weight into 1.898 × 10^27 kg
} }
