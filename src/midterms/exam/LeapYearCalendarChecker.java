package midterms.exam;

import java.util.Scanner;


public class LeapYearCalendarChecker {
    public static void main(String[] args) {
        int year;
        char entry = 'x';
        System.out.println("This application will create a typical calendar for a specified year");
        isLeapYear(readYear());
        do {
            entry = repeatProcess();
            switch (entry) {
                case 'y':
                    isLeapYear(readYear());
                    break;
                case 'n':
                    System.out.println("Thank you for using the program");
                    break;
            }
        }while (entry == 'y');

    }
    static int readYear() {
        Scanner kyb = new Scanner(System.in);
        int year;
        do {
            System.out.println("Enter the year of creating a calendar");
            year = Integer.parseInt(kyb.nextLine());
            if (year <= 1582) {
                System.out.println("You must enter an integer that is not less than 1582");
            }
        } while (year <= 1582);
        return year;
    }
    static void isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The inputted year is a leap year");
        } else {
            System.out.println("The inputted year is not a leap year");
        }
    }
    static char repeatProcess(){
        Scanner kyb = new Scanner(System.in);
        char entry;
        do {
            System.out.println("Do you want to repeat the process? (y=yes & n=no)");
            entry = kyb.nextLine().charAt(0);
            if (entry != 'y' && entry != 'n'){
                System.out.println("(yes or no) only");
            }
        } while (entry != 'y' && entry != 'n');
        return entry;
    }
}
