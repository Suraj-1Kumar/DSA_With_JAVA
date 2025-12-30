package DSA.skills;
import java.util.*;
import java.util.Arrays;


class Solution{

    // Return the first value that is repeating in the array
    static int firstRepeating(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    // Find the smallest element in an array
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    // Find the second smallest element in an array
    static int findSecondMin(int[] arr){
        int min = findMin(arr);

        for(int i = 0; i < arr.length; i++){
            if( arr[i] == min){
                arr[i] = Integer.MAX_VALUE;
            }
        }
        int secondMin = findMin(arr);
        return secondMin;
    }
    
    // Find the largest element in an array
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <  arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Find the second largest element in an array
    static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        for(int i = 0; i <  arr.length; i++){
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);

        return secondMax;
    }

    // Find the unique element in an array where every element appears twice except for one
    static int findUnique(int[] arr){
        int result = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] != -1){
                result = arr[i];
            }
        }
        return result;
    }

    // Counting the number of triplets whose sum is equal to the given number X

    static int countTriplets(int[] arr, int targetsum){
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1 ; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == targetsum){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Counting the number of pairs whose sum is equal to the given number X

    static int targetSum(int[] arr, int target){
        int count = 0;
        int n =  arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + i; j < n; j++){
                if ( arr[i] + arr[j] == target){
                    count++;
                }
            }   
        }  
        return count;   
    }

    // Array printing method
    static void printArray(int[] arr){
        for(int i = 0; i  < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


    // Print smallest and largest element of an array in another array
    static int[] printSmallestLargest(int[] arr){
        Arrays.sort(arr);
        int[] result = {arr[0], arr[arr.length - 1]}; // Smallest and largest element
        return result;
    }
    // Checking if array is sorted in ascending order
    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                check = false;
                break;
            }
        }
        return check;
    }

    // Greater than target
    static void greaterThanTarget(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > target){
                count++;
            }
        }
        System.out.println(count);
    }

    // Last occurenece index of target
    static void lastoccurence(int[] arr, int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] ==  target){
                index = i;
            }
        }
        System.out.println(index);
    }


    // Counting element method
    static void countElement(int[] arr, int target){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(count);
    }
}

public class ArrayPractice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");     
        int n = sc.nextInt();                  // Size of the array
        int[] arr = new int[n];                // Array initialization

        // Input array elements
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        // printing array
        System.out.println("Array is:");
        obj.printArray(arr);
        System.out.println();

        // Counting the element
        System.out.print("The target element is: ");
        int target = sc.nextInt();
        System.out.print("The total times of occurence of " + target + " is: ");
        obj.countElement(arr, target); 

        // Last occurence of element
        System.out.println();
        System.out.print("The last occurence of " + target + " is: ");
        obj.lastoccurence(arr, target);

        // count the number of elements strictly greater than a value x
        System.out.println();
        System.out.print("The total count of elements strictly greater than " + target + " is: ");
        obj.greaterThanTarget(arr, target);

        //  checking if array is sorted or not
        System.out.println();
        System.out.print("Is the array sorted? ");
        System.out.println(obj.isSorted(arr));


        // Smallest and largest element in an array
        System.out.println();
        int[] newArray = obj.printSmallestLargest(arr);
        System.out.println("Smallest element is: " + newArray[0]);
        System.out.println("Largest element is: " + newArray[1]);


        // Target Sum method calling for pairs of elements
        System.out.println();
        System.out.print("Enter the target sum: ");
        int targetsum = sc.nextInt();
        System.out.println(obj.targetSum(arr, targetsum));


        // countTriplets method calling
        System.out.println();
        System.out.print("Enter the target sum: ");
        int targetsum2 = sc.nextInt();
        System.out.println(obj.countTriplets(arr, targetsum2));

        // findUnique() calling
        System.out.println();
        int unique_no = obj.findUnique(arr);
        System.out.print(unique_no + " is the unique number in the array!");  

        // Find maximum value in Array
        System.out.println();
        System.out.print("Maximum value in the array is: ");
        System.out.println(obj.findMax(arr));

        // Find second maximum value in Array
        System.out.println();
        System.out.print("Second maximum value in the array is: ");
        System.out.println(Solution.findSecondMax(arr));  

        // firstRepeating() calling
        System.out.println();
        System.out.println("First repeating value in array is: " + Solution.firstRepeating(arr));

        sc.close();
    }
}    
