package midterms.exercises;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "", s2 = "";
        System.out.print("Enter your first name: ");
        s1 = scan.nextLine();
        System.out.print("Enter someone's first name: ");
        s2 = scan.nextLine();
        System.out.println("Possible names of your proteges");
        System.out.println("1. " + formName3(s1, s2));
        System.out.println("2. " + formName3(s2, s1));
        System.out.println("3. " + formName1(s2, s1));
        System.out.println("4. " + formName1(s1, s2));
        System.out.println("5. " + formName5(s1, s2, 5));
        System.out.println("5. " + formName5(s2, s1, 5));
        System.exit(0);
    } // end of main method
    /**
     * Returns the string formed by concatenating the first 2 characters of a String
     called name1
     * to and the last two characters of another String called name2.
     */
    public static String formName1(String name1, String name2) {
        String result = "";
        result = name1.substring(0, 2).concat(name2.substring(name2.length() - 2));
        return result;

    }

    /**
     * Returns the string formed by concatenating the two strings name1 and name 2
     */
    public static String formName3(String name1, String name2) {
        String result = "";
        result = name1.concat(name2);
        return result;
    }
    /**
     * Returns a string with length n formed by concatenating characters that are
     alternately
     * taken from random positions of the two strings name1 and name 2.
     */
    public static String formName5(String name1, String name2, int n) {
        String result = "";
        Random generate = new Random();
        int location = 0;
        for (int x = 0; x < n; x++) {
            if (x % 2 == 0) {
                location = generate.nextInt(name1.length());
                result = result + name1.charAt(location);
            } else {
                location = generate.nextInt(name2.length());
                result = result + name2.charAt(location);
            }
        } // end of for
        return result;
    } // end of formName5 method
}
