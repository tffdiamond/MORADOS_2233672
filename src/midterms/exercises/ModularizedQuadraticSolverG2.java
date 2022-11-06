package midterms.exercises;

import javax.swing.*;

public class ModularizedQuadraticSolverG2 {
    public static void main(String[] args) {
        double a, b, c, root1, root2;
        String input = "";
        showIntroduction(); // invoke showIntroduction
                input = JOptionPane.showInputDialog("Please enter the coefficient of x^2, (a in " +
                "ax^2+bx+c=0): ");
        a = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please enter the coefficient of x, (b in " +
                "ax^2+bx+c=0): ");
        b = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please enter the constant, (c in ax^2+bx+c=0): ");
        c = Double.parseDouble(input);
        if (b * b - 4 * a * c >= 0)
            determineAndShowTheRealRoots(a, b, c);
        else
            determineAndShowTheImaginaryRoots(a, b, c);

        System.exit(0);
    }
    public static void showIntroduction() {
        JOptionPane.showMessageDialog(null, "This program helps you solve for the roots of a " +
                "quadratic equation.\nThe quadratic equation should be " +
                "written in the form ax^2 + bx+ c = 0 \nYou will be " + "asked to enter the coefficients of the quadratic " +
                "equation");
        return;
    }
    public static double computeFirstRoot(double a, double b, double c) {
        double root = 0.0; // local variable with initial value
        root = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return root;
    }
    public static double computeSecondRoot(double a, double b, double c) {
        double root = 0.0; // local variable with initial value
        root = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return root;
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
    public static void determineAndShowTheRealRoots(double a, double b, double c) {
        double root1 = computeFirstRoot(a, b, c); // invoke computeFirstRoot method
        double root2 = computeSecondRoot(a, b, c); // invoke computeSecondRoot method
        JOptionPane.showMessageDialog(null, "The roots of (" + a + ")x^2 + (" + b +
                ")x + (" + c +
                ") = 0 are " + root1 + " and " + root2 + ".");
        return;
    }

    public static void determineAndShowTheImaginaryRoots(double a, double b, double
            c) {
// invoke representFirstImaginaryRoot method
        String root1 = representFirstImaginaryRoot(a, b, c);
// invoke method representSecondImaginaryRoot method
        String root2 = representSecondImaginaryRoot(a, b, c);
        JOptionPane.showMessageDialog(null, "The roots of (" + a + ")x^2 + (" + b +
                ")x + (" + c +
                ") = 0 are " + root1 + " and " + root2 + ".");
        return;
    }
}
