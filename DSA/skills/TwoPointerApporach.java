package DSA.skills;
import java.util.*;

public class TwoPointerApporach {
    static int[] nonIncreasingSquare(int[] arr){
        int n = arr.length;
        int i = 0, j = n - 1;
        int[] ans = new int[n];
        int k = 0;                                       // int k = n - 1;  // both will give the same result
        while(i <= j){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[k++] = arr[i] * arr[i];               //ans[k--] = arr[i] * arr[i];
                i++;
            }
            else{
                ans[k++] = arr[j] * arr[j];               //ans[k--] = arr[j] * arr[j];
                j--;
            }
        }
        reverse(ans);                                    // reverse(ans); should be comment
        return ans;
    }

    static int[] sortEvenOdd(int[] arr){
        int n = arr.length;
        int i = 0, j = n - 1;
        while(i < j){
            if(arr[i] % 2 != 0 && arr[j] % 2 == 0){
                swapArray(arr, i, j);
                i++;
                j--;
            }
            if(arr[i] % 2 == 0){
                i++;
            }
            if(arr[j] % 2 != 0){
                j--;
            }
        }
        return arr;
    }
    static int[] sortUsingTP(int[] arr){
        int n = arr.length;

        int left = 0;
        int right = n - 1;
        while(left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swapArray(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
        return arr;
    }

    static int[] sortArray(int[] arr){
        int n = arr.length;
        int zeros = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i < zeros){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
        /*for(int i = 0; i < zeros; i++){
            arr[i] = 0;
        }
        for(int i = zeros; i < n; i++){
            arr[i] = 1;
        } */
        return arr;
    }

    static void reverse(int[] arr){
        int n = arr.length;
        int i = 0, j = n - 1;
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

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements either 0 or 1: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        printArray(arr);
        System.out.println();

        /*System.out.println("Sorted array: ");
        sortArray(arr);
        printArray(arr);
        sortUsingTP(arr);
        printArray(arr); */

        // Even - odd sorting
        /*sortEvenOdd(arr);
        printArray(arr); */

        int[] ans = nonIncreasingSquare(arr);
        System.out.println("Non-increasing sorted square array: ");
        
        printArray(ans);
    }
}
