package prelims.activities;

import java.io.BufferedReader;
import java.util.Scanner;

public class numberToWords {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        System.out.println("Please input a value in the range of 1 to 10: ");
        num = Integer.parseInt(keyboard.nextLine());
        if (num == 1) System.out.println("One");
        else if (num == 2) System.out.println("Two");
        else if (num == 3) System.out.println("Three");
        else if (num == 4) System.out.println("Four");
        else if (num == 5) System.out.println("Five");
        else if (num == 6) System.out.println("Six");
        else if (num == 7) System.out.println("Seven");
        else if (num == 8) System.out.println("Eight");
        else if (num == 9) System.out.println("Nine");
        else if (num == 10) System.out.println("Ten");
        else System.out.println("Invalid Number");
        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Invalid Number");

        }
    }
}
