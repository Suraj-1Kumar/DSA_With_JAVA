package DSA.skills;

import java.util.Scanner;

public class ArrayLeftRotate {
    static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    
    static void reverse(int[] arr, int i, int j){
        while(i < j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }
    
    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" No of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();
        
        rotate(arr, k);
        print(arr);

        sc.close();
        
    }
}
