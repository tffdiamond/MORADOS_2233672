package something.tutorials;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeletion2 {
    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println("The elements of an array: "+Arrays.toString(arr));
        System.out.println("Please input a number to be remove in the array");
        int num1 = Integer.parseInt(kyb.nextLine());
        int[] arr_new = new int[arr.length-1];
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]!=num1){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
    }
}
