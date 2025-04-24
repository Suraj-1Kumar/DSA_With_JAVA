package DSA.skills;
import java.util.*;

public class PrefixSumApproach {
    // Suffix Sum
    static int[] suffixSum(int[] arr){
        int n = arr.length;
        for(int i = n - 2; i >= 0; i--){
            arr[i] +=  arr[i + 1];
        }
        return arr;
    }

    // Sum of elements in range [l, r] in q queries
    //In-place Approach
    static int[] prefixSumInplace(int[] arr){
        int n = arr.length;
        //arr[0] = arr[0];
        for(int i = 1; i < n; i++){
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        System.out.println();
        System.out.println("PrefixSum Array");
        // Without inplace approach
        int[] prefixsum = prefixSumInplace(arr);
        printArray(prefixsum);

        // With inplace approach
        int[] prefixsum1 = prefixSumInplace(arr);
        printArray(prefixsum1); 

        // Suffix Sum Array
        System.out.println("SuffixSum Array");
        int[] suffixsum = suffixSum(arr);
        printArray(suffixsum);
    }
}
