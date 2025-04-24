package DSA.skills;
import java.util.*;

public class RangeQueryPrfeixSum {
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++ ){
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    /*static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 1; i <= n; i++){
            System.out.println(arr[i] + " ");
        }
    } */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr= new int[n+1];

        System.out.println("Enter " + n + " elements:");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        /*System.out.println("Original Array");
        printArray(arr); */

        int[] prefix = prefixSum(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = prefix[r] - prefix[l - 1];

            System.out.println("Sum " + sum); 
        }
        sc.close();
    }
}
