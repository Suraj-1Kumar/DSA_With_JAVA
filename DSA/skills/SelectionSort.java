package DSA.skills;
import java.util.*;

public class SelectionSort {
    static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){       // i represents the current index
            int minIdx = i;

            // Find the minimum element in unsorted array
            for(int j = i + 1; j < n; j++){     
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr){
        for(int a : arr){
            System.out.print(a + " ");
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


        System.out.println("Original Array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }    
}
