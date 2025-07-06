/* Last modified: 2022-10-25 */

import java.util.Scanner;

public class TestScores2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[] { "JoeOG", "Joe2.0", "BobV1", "Joelle", "JoelleAI" };
        double[][] scores = new double[][] { { 42, 62, 69, 88, 100 }, { 55, 94, 42, 62, 100 }, { 65, 96, 54, 70, 100 } };

        System.out.print("Names: ");
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.print(names[i1]);
            System.out.println(" ");
        }

        System.out.println("Gimme a name:");
        String nameIn = in.nextLine();

        for (int i = 0; i < 5; i++) {
            if (names[i].equals(nameIn)) {
                System.out.println(nameIn + " scored " + scores[0][i] + "% on test 1,  " + scores[1][i] + "% on test 2, and " + scores[2][i] + "% on test 3");
            }
        }
    }
}