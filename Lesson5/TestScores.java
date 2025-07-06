import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        // Use three parallel arrays to save the names, test 1 scores, and test 2 scores of 5 students.
        // When the user types in a name, it should display the users name and both of their test scores.
        Scanner in = new Scanner(System.in);

        String[] names = new String[] {"JoeOG", "Joe2.0", "BobV1", "Joelle", "JoelleAI"};
        double[] testScores1 = new double[] {67, 89, 69, 88, 100};
        double[] testScores2 = new double[] {55, 94, 42, 62, 100};

        System.out.println("Enter a name!");
        System.out.print("Names: ");
        for(int i1 = 0; i1 < 5; i1++) {
            System.out.print(names[i1] + " ");
        }
        System.out.println("");
        String nameIn = in.nextLine();

        for (int i = 0; i < 5; i++) {

            if (names[i].equals(nameIn)) {
                System.out.println(nameIn + " scored a " + testScores1[i] + "% on the first test and a " + testScores2[i] + "% on the second test.");
            }
        }
    }
}