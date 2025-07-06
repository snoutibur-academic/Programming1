import java.util.Scanner;

public class PythagoreanTheorem {
    public static double pythag(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Gib a value:");
        a = in.nextDouble();
        System.out.println("Gib b value:");
        b = in.nextDouble();

        System.out.println(pythag(a, b));
    }
}
