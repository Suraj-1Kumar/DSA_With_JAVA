package DSA.skills;
import java.util.*;

public class BubbleSort {
    static void bubbleSort(int[] arr, int n){
        // n-1 iteration
        for(int i = 0; i < n-1; i++){
            boolean flag = false;          
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){        // have any swap happened
                return;
            }
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
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("original Array");
        printArray(arr);

        
        bubbleSort(arr, n);
        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}
