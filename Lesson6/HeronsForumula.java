/* Last modified: 2022-10-29 */

import java.util.Scanner;

public class HeronsForumula {

    public static double getArea(double side1, double side2, double side3) {
        return 0.25 * Math.sqrt((side1 + side2 + side3) * ((-1 * (side1)) + side2 + side3) * (side1 - side2 + side3) * (side1 + side2 - side3));
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter yer value for side A");
        double side1 = in.nextDouble();
        System.out.println("Enter yer value for side B");
        double side2 = in.nextDouble();
        System.out.println("Enter yer value for side C");
        double side3 = in.nextDouble();

        System.out.println("The area of yer dingus triangle is " + getArea(side1, side2, side3) + " units squared.");
    }
}