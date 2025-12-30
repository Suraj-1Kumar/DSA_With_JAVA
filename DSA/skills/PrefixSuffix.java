package DSA.skills;

import java.util.Scanner;

public class PrefixSuffix {
    static int findArraySum(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int i = 0; i < n; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int n = arr.length;
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for(int i = 0; i < n; i++){
            prefSum += arr[i];
            int suffSum = totalSum - prefSum;
            if(suffSum == prefSum){
                return true;
            }
        }
        return false;
        
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

        System.out.println("Equal partition possible: " + equalSumPartition(arr));

        sc.close();
    }
}
