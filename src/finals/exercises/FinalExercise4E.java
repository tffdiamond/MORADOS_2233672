package finals.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FinalExercise4E {
    public static void main(String[] args) {
        showIntroduction();
        String[] arr = arrayOfNames();
        bubbleSorting(arr);
    }
    static void showIntroduction(){
        System.out.println("-------------Welcome to name sorting program--------------");
        System.out.println("This program will alphabetically order the names you input\n");
        ;
    }
    static String [] arrayOfNames(){
        Scanner kyb = new Scanner(System.in);
        System.out.println("How many names in an array\n");
        int numberOfElements = Integer.parseInt(kyb.nextLine());
        String [] arr = new String[numberOfElements];
        for (int i=0; i < arr.length; i++){
            System.out.println("Please input the names that is equivalent to the size of an array");
            arr[i] = kyb.nextLine();
        }
        return arr;
    }
    static void bubbleSorting(String[] arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                if (arr[j].compareToIgnoreCase(arr[j+1]) > 0){
                    String temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
