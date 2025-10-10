package DSA.skills;
import java.util.*;

public class RearrangeArraySign {
    static void rearrangeArray(int[] arr){
        int n = arr.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2]; 

        int p = 0, q = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                pos[p++] = arr[i];
            }
            else{
                neg[q++] = arr[i];
            }
        }

        for(int i =0; i < n/2; i++){
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }
    }

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // Length of array

        int[] arr = new int[n];    // Array initialization
          
        // Taking user input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Original Array
        System.out.println("original Array:");
        printArray(arr);

        // Rearranged Array
        rearrangeArray(arr);

        System.out.println("Rearranged Array:");
        printArray(arr);

        sc.close();
    }
}
