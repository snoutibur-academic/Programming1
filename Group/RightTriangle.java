/* Last modified: 2022-10-11 */

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) throws Exception {
        // Write a program that takes 3 sides as inputs and says whether or not it is a
        // right triangle.

        // It is possible to determine if a triangle contains a right angle using Pythagoras' theorem . If the squares of the two shorter sides add up to the square of the hypotenuse, the triangle contains a right angle.

        // a^2 + b^2 = c^2

        Scanner in = new Scanner(System.in);

        double longside;
        double shortSide1 = 0;
        double shortSide2 = 0;

        System.out.println("Enter yer sides! Starting with side 1");
        double side1 = in.nextDouble();
        System.out.println("Now side 2:");
        double side2 = in.nextDouble();
        System.out.println("Now side 3:");
        double side3 = in.nextDouble();

        side1 = Math.sqrt(side1);
        side2 = Math.sqrt(side2);
        side3 = Math.sqrt(side3);

        if(side1 <= side2) {
            shortSide1 = side1;
        }
        if(side2 <= side3) {
            shortSide2 = side2;
        }

        if(side1<=side2) {
            longside = side1;
        } else if(side2<=side3) {
            longside = side2;
        } else {
            longside = side3;
        }
        double shortSideSum = shortSide1 + shortSide2;

        if(shortSideSum == longside) {
            System.out.println("You seemed to have found a right triangle!");
        } else {
            System.out.println("This ain't no right triangle!");
        }
    }
}
