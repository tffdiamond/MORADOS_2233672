package midterms.exercises;

import java.util.Scanner;

public class MidtermExercise8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a, b, c;
        System.out.println("This program helps you solve for the roots of a Quadratic Equation.");
        System.out.println("You should enter the coefficients of the quadratic equation");
        System.out.print("Enter a: ");
        a = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter b: ");
        b = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter c: ");
        c = Double.parseDouble(keyboard.nextLine());
        if (b * b - 4 * a * c >= 0) {
            double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("The roots are: " + root1 + " and " + root2 + ".");
        } else {
            String root1 = -b / (2 * a) + " + (square root of (" + (-1) * (b * b - 4 * a * c) +
                    ") * i) / " +
                    (2 * a);
            ; /* invoke representFirstImaginaryRoot method */
            String root2 = -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) +
                    ") * i) / " +
                    (2 * a);
            ; /* invoke method representSecondImaginaryRoot */
            System.out.println("The imaginary roots are: " + root1 + " and " + root2 + ".");
        }
        System.exit(0);
    }
}
