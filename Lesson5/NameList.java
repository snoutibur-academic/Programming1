/* Last modified: 2022-10-21 */

import java.util.Scanner;

public class NameList {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String[] names = new String[] { "Joe1", "Joe2", "Joe3", "Joe4", "Joe5", "Joe6" };

        System.out.print("Names: ");
        for (int i = 0; i <= 5; i++) {
            System.out.print(names[i] + ", ");
        }

        System.out.println("What name are ya lookin' for?");
        String nameIn = in.nextLine();
        
        for (int i = 0; i < 6; i++) {

            if (names[i].equals(nameIn)) {
                System.out.println(nameIn + " is found at: " + i);
            }
        }
    }
}