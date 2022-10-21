package something.tutorials;

import java.util.Scanner;

public class MethodOutsideClass {
    public static void main(String[] args) {
        System.out.print("How many stars? ");
        Scanner kyb = new Scanner(System.in);
        int numOfStars = kyb.nextInt();
//the first half of diamond
        for (int i = 1; i <= numOfStars; i++){
            for (int k = 0; k <= numOfStars-i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++){
                System.out.print("k");
            }
            System.out.println();
        }
//the second half of diamond
        for (int i = numOfStars - 1; i > 0; i--){
            for (int k = 0; k <= numOfStars-i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++){
                System.out.print("k");
            }
            System.out.println();
        }
    }
}

