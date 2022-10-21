package midterms.exercises;

import java.util.Scanner;

public class MidtermExercise7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String classicationConsumer = "";
        int presentReading, previousReading;
        double amountDue = 0.0;
        int minCMResidential = 12;
        double minBillResidential = 180.00;
        float rateResidential = 30.00F;
        int minCMCommercial = 30;
        double minBillCommercial = 600.00;
        float rateCommercial = 50.00F;
        char cType = 'x'; //initialized cType
        String consumer = "";
        System.out.print("Enter the consumer's name: ");
        consumer = keyboard.nextLine();
        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(keyboard.nextLine());
            if (previousReading < 0) {
                System.out.println("The meter reading cannot me negative.");
            }
        } while (previousReading < 0);
        do {
            System.out.print("Enter the meter reading this month: ");
            presentReading = Integer.parseInt(keyboard.nextLine());
            if (presentReading < 0) {
                System.out.println("The meter reading cannot me negative.");
            }
            if (presentReading < previousReading){
                System.out.println("The present water meter reading cannot be less than the previous water meter reading. ");
            }
        } while (presentReading < 0 || presentReading < previousReading);
        double nCMUsed = waterBillComputation(presentReading, previousReading);
        System.out.println("Are you a commercial or residential user? \n(c for commercial & r for residential) ");
        classicationConsumer = keyboard.nextLine();
        cType = classicationConsumer.charAt(0);
        System.out.println("Statement of the account");
        System.out.println("Name of the subscriber: "+consumer);
        System.out.println("Water reading last month: "+previousReading);
        System.out.println("Water reading this month: "+presentReading);
        System.out.println("Water consumption: "+nCMUsed);
        if (cType == 'c'){
            if (nCMUsed <= minCMCommercial){
                System.out.println("Amount due = "+minBillCommercial);
            }
            else if (nCMUsed > minCMCommercial) {
                System.out.println("Amount due = "+minBillCommercial+(nCMUsed-30)*rateCommercial);
            }
        }
        else if (cType == 'r'){
            if (nCMUsed <= minCMResidential){
                System.out.println("Amount due = "+minBillResidential);
            }
            else if (nCMUsed > minCMResidential){
                System.out.println("Amount due = "+minBillResidential+(nCMUsed-12)*rateResidential);
            }
        }
    }
    public static double waterBillComputation(int x, int y){
        int nCMUsed;
        nCMUsed = x - y;
        return nCMUsed;
    }
}
