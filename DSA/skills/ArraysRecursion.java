package DSA.skills;

import java.util.*;

public class ArraysRecursion {

    static int sum(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        return arr[idx] + sum(arr, idx+1);
    }

    static int maxVal(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = maxVal(arr, idx+1);
        return Math.max(arr[idx], smallAns);
    }

    static void printArray(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 

        System.out.println("Print the array: ");
        printArray(arr, 0); 

        System.out.println("Max element in array: " + maxVal(arr, 0));

        System.out.println("Sum of array: " + sum(arr, 0));

        sc.close();

    }
}
