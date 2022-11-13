package finals.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FinalExercise4F {
    public static void main(String[] args) {
        showIntroduction();
        String [] elementsOfArray = arrayToSort();
        selectionSort(elementsOfArray);
        printedArray(elementsOfArray);
    }
    static void showIntroduction(){
        System.out.println("Welcome to the program");
        System.out.println("This program will sort the names using selection sorting algorithm");
    }
    static String[] arrayToSort(){
        Scanner kyb = new Scanner(System.in);
        System.out.println("How many names in an array");
        int amountOfElements = Integer.parseInt(kyb.nextLine());
        String[] elementsOfArray = new String[amountOfElements];
        for (int i=0; i<amountOfElements; i++){
            System.out.println("Please input the names to be sorted");
            elementsOfArray[i] = kyb.nextLine();
        }
        System.out.println("\nThe unsorted names in an array: "+Arrays.toString(elementsOfArray));
        return elementsOfArray;
    }
    static void selectionSort(String[] arr){
        int n = arr.length;

        for (int i=0; i<n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++)
                if (arr[i].compareToIgnoreCase(arr[j]) > 0)
                    min_index = j;

            String temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    static void printedArray(String [] arr){
        System.out.print("\nAlphabetically ordered names: \n");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
