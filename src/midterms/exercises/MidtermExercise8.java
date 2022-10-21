package midterms.exercises;

import java.util.Scanner;

public class MidtermExercise8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a, b, c;
        printHeading(); // invoke printHeading method
        System.out.print("Enter a: ");
        a = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter b: ");
        b = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter c: ");
        c = Double.parseDouble(keyboard.nextLine());
        if (b * b - 4 * a * c >= 0)
            determineAndShowTheRealRoots(a, b, c);
        else
            determineAndShowTheImaginaryRoots(a, b, c);
        System.exit(0);
    }
    public static void printHeading() {
        System.out.println("This program helps you solve for the roots of a Quadratic Equation.");
                System.out.println("You should enter the coefficients of the quadratic equation");
    }
    public static double computeFirstRoot(double a, double b, double c) {
        double root; // local variable with initial value
                root = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        return root;
    }
    public static double computeSecondRoot(double a, double b, double c) {
        double root; // local variable with initial value
                root = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return root;
    }
    public static void showRealRoots(double r1, double r2) {
        System.out.println("The roots are: " + r1 + " and " + r2 + ".");
    }
    public static String representFirstImaginaryRoot(double a, double b, double c) {
        String root = "";
        root += -b / (2 * a) + " + (square root of (" + (-1) * (b * b - 4 * a * c) +
                ") * i) / " +
                (2 * a);
        return root;
    }
    public static String representSecondImaginaryRoot(double a, double b, double c) {
        String root = "";
        root += -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) +
                ") * i) / " +
                (2 * a);
        return root;
    }
    public static void showImaginaryRoots(String r1, String r2) {
        System.out.println("The imaginary roots are: " + r1 + " and " + r2 + ".");
    }
    public static void determineAndShowTheRealRoots(double a, double b, double c) {
        double root1 = computeFirstRoot(a, b, c); // invoke computeFirstRoot method
        double root2 = computeSecondRoot(a, b, c); // invoke computeSecondRoot method
        showRealRoots(root1, root2); // Invoke showRoots method
    }
    public static void determineAndShowTheImaginaryRoots(double a, double b, double
            c) {
        String root1 = representFirstImaginaryRoot(a, b, c); /* invoke representFirstImaginaryRoot method */
        String root2 = representSecondImaginaryRoot(a, b, c); /* invoke method representSecondImaginaryRoot */
        showImaginaryRoots(root1, root2); // invoke showImaginaryRoots method
    }
}
