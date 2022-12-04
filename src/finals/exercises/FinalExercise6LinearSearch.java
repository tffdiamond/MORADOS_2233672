package finals.exercises;

import java.util.Objects;
import java.util.Scanner;

public class FinalExercise6LinearSearch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String pName;
        double uPrice, totalCost, discount, discountedCost, amountTendered, change;
        int qty, dRate;
        String [] list = listOfProduct();
        do {
            System.out.print("Product: ");
            pName = keyboard.nextLine();
            if (linearSearch(pName, list)) System.out.println("The product is in the list, please proceed.");
            else System.out.println("The product is not in the list, please enter an appropriate product");
        }while (!linearSearch(pName, list));

        do {
            System.out.print("Quantity: ");
            qty = Integer.parseInt(keyboard.nextLine());
            if (qty < 0){
                System.out.println("Quantity cannot be negative");
            }
        }while (qty < 0);
        do {
            System.out.print("Unit Price: ");
            uPrice = Double.parseDouble(keyboard.nextLine());
            totalCost = uPrice * qty;
            if (uPrice < 0){
                System.out.println("Unit Price must be greater than zero");
            }
        }while (uPrice < 0);
        do {
            System.out.print("Discount: ");
            dRate = Integer.parseInt(keyboard.nextLine());
            discount = totalCost * (dRate / 100.0);
            discountedCost = totalCost - discount;
            if (dRate < 0 || dRate > 100){
                System.out.println("Discount rate cannot be negative and it cannot be more than 100 percent");
            }

        }while (dRate < 0 || dRate > 100);
        do {
            System.out.print("Cash Tendered: ");
            amountTendered = Double.parseDouble(keyboard.nextLine());
            change = amountTendered - discountedCost;
            if (amountTendered < uPrice){
                System.out.println("Amount tendered cannot be lower than the amount to be paid.");
            }
        }while (amountTendered < uPrice);

        System.out.printf("%-25s%12s%n", "----------------------", "--------------");
        System.out.printf("%-25s%12.2f%n", "Total Purchase Amount: ", totalCost);
        System.out.printf("%-25s%12.2f%n", "Total Discount: ", discount);
        System.out.printf("%-25s%12.2f%n", "Amount to be Paid: ", discountedCost);
        System.out.printf("%-25s%12.2f%n", "change: ", change);
        System.exit(0);
    }
    static String[] listOfProduct(){
        String [] listOfProduct = new String[5];
        listOfProduct[0] = "egg";
        listOfProduct[1] = "banana";
        listOfProduct[2] = "eggplant";
        listOfProduct[3] = "milk";
        listOfProduct[4] = "coffee";
        return listOfProduct;
    }
    static boolean linearSearch(String searchKey, String[] list){
        for (String s : list) {
            if (Objects.equals(s, searchKey)) {
                return true;
            }
        }
        return false;
    }
}