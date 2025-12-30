package DSA.skills;

import java.util.*;

public class ArrayReference {
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr  = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 8;
        arr[3] = 6;
        arr[4] = 7;
        System.out.println("Original array: ");
        printArray(arr);

        //Copy the array 
        //int[] arrCopy = arr;                                  // Shallow copy
        int[] arrCopy = arr.clone();                           // Deep Copy
        //int[] arrCopy = Arrays.copyOf(arr, arr.length);    // Deep Copy
        //int[] arrCopy = Arrays.copyOfRange(arr, 0, 3);    // Deep Copy
        System.out.println("Copied array: ");
        printArray(arrCopy);

        //Changing some values of arrCopy
        arrCopy[0] = 0;
        arrCopy[1] = 0;

        System.out.println("Original array after changing arrCopy: ");
        printArray(arr);

        System.out.println("Copied array after changing arrCopy: ");
        printArray(arrCopy);
    }
}
