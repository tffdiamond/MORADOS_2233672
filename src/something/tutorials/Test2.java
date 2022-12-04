package something.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    static Scanner kyb = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array;
        int result;
        double average;
        int biggestElement;
        int smallestElement;
        double medianElement;
        System.out.println("Enter array size: ");
        int size = Integer.parseInt(kyb.nextLine());
        array = new int[size];
        randomNumbers(array);
        result = sumOfArray(array);
        average = averageOfArray(result, size);
        biggestElement = biggestElement(array);
        smallestElement = smallestElement(array);
        medianElement = medianElement(array);
        System.out.println("The elements in the array: "+Arrays.toString(array)+"\n");
        System.out.println("The sum of the elements of an array is: "+result);
        System.out.println("The average of the elements of an array is: "+average);
        System.out.println("The biggest element in an array is: "+biggestElement);
        System.out.println("The smallest element in array is: "+smallestElement);
        System.out.println("The median of an array is: "+medianElement);
    }

    public static int[] randomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        return array;
    }

    public static int sumOfArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static double averageOfArray(int result, int size) {
        double average;

        average = (double) result/size;
        return average;
    }

    public static int biggestElement(int[] array) {
        int biggestElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j=1; j<array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        biggestElement = array[0];
        return biggestElement;
    }

    public static int smallestElement(int[] array) {
        int smallestElement = 0;
        for (int i = 0; i <array.length; i++) {
            for (int j=1; j<array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        smallestElement = array[0];
        return smallestElement;
    }
    public static double medianElement(int[] array){

        double medianElement = 0;
        for (int i=0; i<array.length; i++){
            if (array.length % 2 != 0){
                medianElement = array[array.length/2];
            }
            else {
                medianElement = (double) array[array.length/2] / array[(array.length/2)+1];
            }
        }
        return medianElement;
    }
}
